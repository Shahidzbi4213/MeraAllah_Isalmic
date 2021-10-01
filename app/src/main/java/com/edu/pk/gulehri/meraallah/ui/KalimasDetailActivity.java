package com.edu.pk.gulehri.meraallah.ui;

import static android.graphics.text.LineBreaker.JUSTIFICATION_MODE_INTER_WORD;
import static android.os.Build.VERSION_CODES.M;
import static com.edu.pk.gulehri.meraallah.constansts.Constants.ANIMATION_CHANGE_DURATION;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.text.LineBreaker;
import android.media.MediaPlayer;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;
import androidx.core.content.res.ResourcesCompat;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.edu.pk.gulehri.meraallah.R;
import com.edu.pk.gulehri.meraallah.adapters.KalimasAdapter;
import com.edu.pk.gulehri.meraallah.constansts.Constants;
import com.edu.pk.gulehri.meraallah.databinding.ActivityKalimasDetailBinding;
import com.edu.pk.gulehri.meraallah.databinding.DownloadDailogBinding;
import com.edu.pk.gulehri.meraallah.model.DataModel;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.io.File;
import java.util.Objects;

public class KalimasDetailActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String[] perms = {Manifest.permission.READ_EXTERNAL_STORAGE,
            Manifest.permission.WRITE_EXTERNAL_STORAGE};
    private static final int REQUEST_CODE = 4213;

    private static final String FIRST_KALIMAH_DOWNLOADED = "Kalimah First Downloaded";
    private static final String SECOND_KALIMAH_DOWNLOADED = "Kalimah Second Downloaded";
    private static final String THIRD_KALIMAH_DOWNLOADED = "Kalimah Third Downloaded";
    private static final String FOURTH_KALIMAH_DOWNLOADED = "Kalimah Fourth Downloaded";
    private static final String FIFTH_KALIMAH_DOWNLOADED = "Kalimah Fifth Downloaded";
    private static final String SIXTH_KALIMAH_DOWNLOADED = "Kalimah Sixth Downloaded";

    private static final String KALIMAH_ONE_FILE = "File Name Of Audio";
    private static final String KALIMAH_TWO_FILE = "File Name Of Audio";
    private static final String KALIMAH_THREE_FILE = "File Name Of Audio";
    private static final String KALIMAH_FOUR_FILE = "File Name Of Audio";
    private static final String KALIMAH_FIVE_FILE = "File Name Of Audio";
    private static final String KALIMAH_SIX_FILE = "File Name Of Audio";

    private String SelectLanguage;
    private int CLICKED_POSITION;
    private ActivityKalimasDetailBinding binding;
    private MediaPlayer mediaPlayer;

    private SharedPreferences sp;
    private SharedPreferences.Editor edit;
    private String CHILD, PATH;

    // /storage/emulated/0/Android/data/com.edu.pk.gulehri.meraallah/files/Android/Kalimah Shahadat.mp3
    // /storage/self/primary/Android/data/com.edu.pk.gulehri.meraallah/files/Android/Kalimah Tamjeed.mp3


    @RequiresApi(api = M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityKalimasDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        getValues();
        setToolBar();
        setAnimations();
        setValues();
        setTextJustification();
        setListeners();
        requestPermission();
        setChildPath();

    }

    private void setListeners() {
        binding.toolbarIncludeKalimasDetail.toolbarImageFirst.setOnClickListener(this);
        binding.toolbarIncludeKalimasDetail.toolbarImageSecond.setOnClickListener(this);

    }

    private void getValues() {
        Intent intent = getIntent();
        SelectLanguage = intent.getStringExtra(KalimasAdapter.SELECTED_LANGUAGE);
        CLICKED_POSITION = intent.getIntExtra(KalimasAdapter.CLICKED_POSITION, 0);
    }

    @SuppressLint("SetTextI18n")
    private void setToolBar() {
        try {
            setSupportActionBar(binding.toolbarIncludeKalimasDetail.mToolbar);
            binding.toolbarIncludeKalimasDetail.mToolbar.setElevation(0);

            binding.toolbarIncludeKalimasDetail.toolbarImageFirst.setImageResource(R.drawable.play);
            binding.toolbarIncludeKalimasDetail.toolbarImageSecond.setImageResource(R.drawable.copy);
            binding.toolbarIncludeKalimasDetail.toolbarText.setText(R.string.kalimas);
            Toolbar.LayoutParams params = new Toolbar.LayoutParams(Toolbar.LayoutParams.WRAP_CONTENT, Toolbar.LayoutParams.WRAP_CONTENT);
            params.gravity = Gravity.CENTER;
            binding.toolbarIncludeKalimasDetail.toolbarText.setLayoutParams(params);
            Objects.requireNonNull(getSupportActionBar()).setDisplayShowTitleEnabled(false);
            final Drawable drawable = ResourcesCompat.getDrawable(getResources(), R.drawable.back_arrow, null);
            getSupportActionBar().setHomeAsUpIndicator(drawable);
            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    private void setAnimations() {
        YoYo.with(Techniques.ZoomIn).duration(ANIMATION_CHANGE_DURATION).playOn(binding.kalimas);
        YoYo.with(Techniques.ZoomIn).duration(ANIMATION_CHANGE_DURATION).playOn(binding.kalimaMeaning);
        YoYo.with(Techniques.ZoomIn).duration(ANIMATION_CHANGE_DURATION).playOn(binding.kalimasTitle);
        YoYo.with(Techniques.ZoomIn).duration(ANIMATION_CHANGE_DURATION).playOn(binding.kalimasTransliteration);
    }

    @SuppressLint("InlinedApi")
    private void setTextJustification() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            binding.kalimas.setJustificationMode(JUSTIFICATION_MODE_INTER_WORD);
            binding.kalimaMeaning.setJustificationMode(JUSTIFICATION_MODE_INTER_WORD);

            if (SelectLanguage.equals("English")) {
                Typeface typeface = ResourcesCompat.getFont(this, R.font.catamaran_medium);
                binding.kalimasTitle.setTypeface(typeface);
                binding.kalimaMeaning.setTypeface(typeface);
            }

        } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            binding.kalimas.setBreakStrategy(LineBreaker.BREAK_STRATEGY_BALANCED);
            binding.kalimaMeaning.setBreakStrategy(LineBreaker.BREAK_STRATEGY_BALANCED);
        } else {
            binding.kalimasTitle.setTypeface(Typeface.SERIF, Typeface.ITALIC);
            binding.kalimaMeaning.setTypeface(Typeface.SERIF, Typeface.ITALIC);

        }

    }

    @SuppressLint("SetTextI18n")
    private void setValues() {
        if (SelectLanguage == null) throw new AssertionError();
        if (SelectLanguage.equals("Urdu")) {

            if (Build.VERSION.SDK_INT < Build.VERSION_CODES.O) {
                binding.kalimasTitle.setTextSize(TypedValue.COMPLEX_UNIT_PX, getResources().getDimension(R.dimen._20sdp));
                binding.kalimaMeaning.setTextSize(TypedValue.COMPLEX_UNIT_PX, getResources().getDimension(R.dimen._20sdp));
            }

            binding.kalimasTitle.setText(DataModel.SIX_KALIMAS_HEADINGS[CLICKED_POSITION].getFUNERAL_PRAYER_PROCESS_IN_ENGLISH());
            binding.kalimas.setText("كلمة: " + " " + DataModel.SIX_KALIMAS[CLICKED_POSITION].getKALIMAH_IN_ARABIC());
            binding.kalimaMeaning.setText(String.format("ترجمه: %s", DataModel.SIX_KALIMAS[CLICKED_POSITION].getKALIMAH_TRANSLATION_IN_URDU()));
            binding.kalimasTransliteration.setText("Transliteration: " + " " + DataModel.SIX_KALIMAS[CLICKED_POSITION].getKALIMAH_TRANSLITERATION());


        } else if (SelectLanguage.equals("English")) {


            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                Typeface typeface = ResourcesCompat.getFont(this, R.font.catamaran_medium);
                binding.kalimasTitle.setTypeface(typeface);
                binding.kalimaMeaning.setTypeface(typeface);
            } else {
                binding.kalimasTitle.setTypeface(Typeface.SERIF, Typeface.ITALIC);
                binding.kalimaMeaning.setTypeface(Typeface.SERIF, Typeface.ITALIC);
                binding.kalimasTransliteration.setTypeface(Typeface.SERIF, Typeface.ITALIC);
            }

            binding.kalimasTitle.setTextSize(TypedValue.COMPLEX_UNIT_PX, getResources().getDimension(R.dimen._16sdp));
            binding.kalimaMeaning.setTextSize(TypedValue.COMPLEX_UNIT_PX, getResources().getDimension(R.dimen._16sdp));

            binding.kalimasTitle.setText(DataModel.SIX_KALIMAS_HEADINGS[CLICKED_POSITION].getFUNERAL_PRAYER_PROCESS_IN_URDU());
            binding.kalimas.setText("كلمة: " + " " + DataModel.SIX_KALIMAS[CLICKED_POSITION].getKALIMAH_IN_ARABIC());
            binding.kalimaMeaning.setText("Translation: " + " " + DataModel.SIX_KALIMAS[CLICKED_POSITION].getKALIMAH_TRANSLATION_IN_ENGLISH());
            binding.kalimasTransliteration.setText("Transliteration: " + " " + DataModel.SIX_KALIMAS[CLICKED_POSITION].getKALIMAH_TRANSLITERATION());
        }

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        try {
            if (v.getId() == R.id.toolbarImageSecond) {
                copyText();
            } else if (v.getId() == R.id.toolbarImageFirst) {

                sp = getPreferences(MODE_PRIVATE);
                boolean kalimahOne = sp.getBoolean(FIRST_KALIMAH_DOWNLOADED, false);
                boolean kalimahTwo = sp.getBoolean(SECOND_KALIMAH_DOWNLOADED, false);
                boolean kalimahThree = sp.getBoolean(THIRD_KALIMAH_DOWNLOADED, false);
                boolean kalimahFour = sp.getBoolean(FOURTH_KALIMAH_DOWNLOADED, false);
                boolean kalimahFive = sp.getBoolean(FIFTH_KALIMAH_DOWNLOADED, false);
                boolean kalimahSix = sp.getBoolean(SIXTH_KALIMAH_DOWNLOADED, false);

                if (CLICKED_POSITION == 0 && !kalimahOne) {
                    downloadAudio();
                }
                if (CLICKED_POSITION == 1 && !kalimahTwo) {
                    downloadAudio();
                }
                if (CLICKED_POSITION == 2 && !kalimahThree) {
                    downloadAudio();
                }
                if (CLICKED_POSITION == 3 && !kalimahFour) {
                    downloadAudio();
                }
                if (CLICKED_POSITION == 4 && !kalimahFive) {
                    downloadAudio();
                }
                if (CLICKED_POSITION == 5 && !kalimahSix) {
                    downloadAudio();
                }

                if (CLICKED_POSITION == 0 && kalimahOne) {
                    if (mediaPlayer != null && mediaPlayer.isPlaying()) {
                        mediaPlayer.pause();
                        binding.toolbarIncludeKalimasDetail.toolbarImageFirst.setImageResource(0);
                        binding.toolbarIncludeKalimasDetail.toolbarImageFirst.setImageResource(R.drawable.play);
                    } else {
                        setMediaPlayer();
                    }
                } else if (CLICKED_POSITION == 1 && kalimahTwo) {
                    if (mediaPlayer != null && mediaPlayer.isPlaying()) {
                        mediaPlayer.pause();
                        binding.toolbarIncludeKalimasDetail.toolbarImageFirst.setImageResource(0);
                        binding.toolbarIncludeKalimasDetail.toolbarImageFirst.setImageResource(R.drawable.play);
                    } else {
                        setMediaPlayer();
                    }
                } else if (CLICKED_POSITION == 2 && kalimahThree) {
                    if (mediaPlayer != null && mediaPlayer.isPlaying()) {
                        mediaPlayer.pause();
                        binding.toolbarIncludeKalimasDetail.toolbarImageFirst.setImageResource(0);
                        binding.toolbarIncludeKalimasDetail.toolbarImageFirst.setImageResource(R.drawable.play);
                    } else {
                        setMediaPlayer();
                    }
                } else if (CLICKED_POSITION == 3 && kalimahFour) {
                    if (mediaPlayer != null && mediaPlayer.isPlaying()) {
                        mediaPlayer.pause();
                        binding.toolbarIncludeKalimasDetail.toolbarImageFirst.setImageResource(0);
                        binding.toolbarIncludeKalimasDetail.toolbarImageFirst.setImageResource(R.drawable.play);
                    } else {
                        setMediaPlayer();
                    }
                } else if (CLICKED_POSITION == 4 && kalimahFive) {
                    if (mediaPlayer != null && mediaPlayer.isPlaying()) {
                        mediaPlayer.pause();
                        binding.toolbarIncludeKalimasDetail.toolbarImageFirst.setImageResource(0);
                        binding.toolbarIncludeKalimasDetail.toolbarImageFirst.setImageResource(R.drawable.play);
                    } else {
                        setMediaPlayer();
                    }
                } else if (CLICKED_POSITION == 5 && kalimahSix) {
                    if (mediaPlayer != null && mediaPlayer.isPlaying()) {
                        mediaPlayer.pause();
                        binding.toolbarIncludeKalimasDetail.toolbarImageFirst.setImageResource(0);
                        binding.toolbarIncludeKalimasDetail.toolbarImageFirst.setImageResource(R.drawable.play);
                    } else {
                        setMediaPlayer();
                    }
                }


            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @SuppressLint({"SetTextI18n", "ClickableViewAccessibility"})
    private void downloadAudio() {

        if (!haveNetworkConnection()) {
            Toast.makeText(this, "Connect to Internet to Download Audio", Toast.LENGTH_SHORT).show();
        } else {

            final DownloadDailogBinding dialogBinding = DownloadDailogBinding.inflate(getLayoutInflater());
            final AlertDialog dialog = new AlertDialog.Builder(this).setView(dialogBinding.getRoot())
                    .setCancelable(false).create();

            //setting Background Transparent && Animation
            dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
            dialog.getWindow().setWindowAnimations(R.style.DialogAnimation);
            dialogBinding.pb.setMax(100);

            File storagePath = new File(this.getExternalFilesDir(null), "Android");
            // Create directory if not exists
            if (!storagePath.exists()) {
                boolean mkdirs = storagePath.mkdirs();
            }
            StorageReference pathReference = FirebaseStorage.getInstance().getReference();
            File file = new File(storagePath, PATH);
            pathReference.child(CHILD).getFile(file).addOnSuccessListener(taskSnapshot -> {

                sp = getPreferences(MODE_PRIVATE);
                edit = sp.edit();

                if (CLICKED_POSITION == 0) {
                    edit.putString(KALIMAH_ONE_FILE, file.getAbsolutePath());
                    edit.putBoolean(FIRST_KALIMAH_DOWNLOADED, true);
                    edit.apply();
                } else if (CLICKED_POSITION == 1) {
                    edit.putString(KALIMAH_TWO_FILE, file.getAbsolutePath());
                    edit.putBoolean(SECOND_KALIMAH_DOWNLOADED, true);
                    edit.apply();
                } else if (CLICKED_POSITION == 2) {
                    edit.putString(KALIMAH_THREE_FILE, file.getAbsolutePath());
                    edit.putBoolean(THIRD_KALIMAH_DOWNLOADED, true);
                    edit.apply();
                } else if (CLICKED_POSITION == 3) {
                    edit.putString(KALIMAH_FOUR_FILE, file.getAbsolutePath());
                    edit.putBoolean(FOURTH_KALIMAH_DOWNLOADED, true);
                    edit.apply();
                } else if (CLICKED_POSITION == 4) {
                    edit.putString(KALIMAH_FIVE_FILE, file.getAbsolutePath());
                    edit.putBoolean(FIFTH_KALIMAH_DOWNLOADED, true);
                    edit.apply();
                } else if (CLICKED_POSITION == 5) {
                    edit.putString(KALIMAH_SIX_FILE, file.getAbsolutePath());
                    edit.putBoolean(SIXTH_KALIMAH_DOWNLOADED, true);
                    edit.apply();
                }

                Log.i(Constants.TAG, "downloadAudio: " + file.getAbsolutePath());

                if (dialog.isShowing()) {
                    dialog.dismiss();
                }
                Toast.makeText(KalimasDetailActivity.this, "Download Completed", Toast.LENGTH_SHORT).show();


            }).addOnFailureListener(e -> {
                dialog.cancel();
                Toast.makeText(KalimasDetailActivity.this, "Download Failed", Toast.LENGTH_SHORT).show();

            })
                    .addOnProgressListener(snapshot -> {
                        dialog.show();
                        double progress = ((100 * snapshot.getBytesTransferred()) / snapshot.getTotalByteCount());
                        dialogBinding.pb.setProgress((int) progress);
                        dialogBinding.downloadView.setText("Downloading... " + progress + "%");
                        dialogBinding.kalimahName.setText(DataModel.SIX_KALIMAS[CLICKED_POSITION].getKALIMAH_NAME());
                        Log.i(Constants.TAG, "downloadAudio: " + progress);

                    }).addOnCompleteListener(task -> dialog.dismiss());
        }
    }

    private void setMediaPlayer() {

        if (CLICKED_POSITION == 0) {
            mediaPlayer = MediaPlayer.create(this,
                    Uri.parse("/storage/emulated/0/Android/data/com.edu.pk.gulehri.meraallah/files/Android/Kalimah Tayyiba.mp3"));
        } else if (CLICKED_POSITION == 1) {
            mediaPlayer = MediaPlayer.create(this,
                    Uri.parse("/storage/emulated/0/Android/data/com.edu.pk.gulehri.meraallah/files/Android/Kalimah Shahadat.mp3"));
        } else if (CLICKED_POSITION == 2) {
            mediaPlayer = MediaPlayer.create(this,
                    Uri.parse("/storage/emulated/0/Android/data/com.edu.pk.gulehri.meraallah/files/Android/Kalimah Tamjeed.mp3"));
        } else if (CLICKED_POSITION == 3) {
            mediaPlayer = MediaPlayer.create(this,
                    Uri.parse("/storage/emulated/0/Android/data/com.edu.pk.gulehri.meraallah/files/Android/Kalimah Touheed.mp3"));
        } else if (CLICKED_POSITION == 4) {
            mediaPlayer = MediaPlayer.create(this,
                    Uri.parse("/storage/emulated/0/Android/data/com.edu.pk.gulehri.meraallah/files/Android/Kalimah Istaghfar.mp3"));
        } else if (CLICKED_POSITION == 5) {
            mediaPlayer = MediaPlayer.create(this,
                    Uri.parse("/storage/emulated/0/Android/data/com.edu.pk.gulehri.meraallah/files/Android/Kalimah RadEKufar.mp3"));

        }
        mediaPlayer.start();
        mediaPlayer.setLooping(true);
        binding.toolbarIncludeKalimasDetail.toolbarImageFirst.setImageResource(0);
        binding.toolbarIncludeKalimasDetail.toolbarImageFirst.setImageResource(R.drawable.pause);

    }


    private void copyText() {
        ClipboardManager manager = (ClipboardManager) this.getSystemService(Context.CLIPBOARD_SERVICE);
        String data = binding.kalimasTitle.getText() + ":\n\n" +
                binding.kalimas.getText() + "\n\n" +
                binding.kalimaMeaning.getText();

        ClipData clipData = ClipData.newPlainText("Kalimah", data);
        manager.setPrimaryClip(clipData);

        Toast.makeText(this, "Copied to Clipboard", Toast.LENGTH_SHORT).show();

    }

    private boolean haveNetworkConnection() {
        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo wifi = cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
        NetworkInfo mobile = cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);

        return (wifi != null && wifi.isConnected()) || (mobile != null && mobile.isConnected());

    }


    private void setChildPath() {

        if (CLICKED_POSITION == 0) {
            CHILD = "Audio Data/1 kalimah.mp3";
            PATH = "Kalimah Tayyiba.mp3";
        } else if (CLICKED_POSITION == 1) {
            CHILD = "Audio Data/2 kalimah.mp3";
            PATH = "Kalimah Shahadat.mp3";
        } else if (CLICKED_POSITION == 2) {
            CHILD = "Audio Data/3 kalimah.mp3";
            PATH = "Kalimah Tamjeed.mp3";
        } else if (CLICKED_POSITION == 3) {
            CHILD = "Audio Data/4 kalimah.mp3";
            PATH = "Kalimah Touheed.mp3";
        } else if (CLICKED_POSITION == 4) {
            CHILD = "Audio Data/5 kalimah.mp3";
            PATH = "Kalimah Istaghfar.mp3";
        } else if (CLICKED_POSITION == 5) {
            CHILD = "Audio Data/6 kalimah.mp3";
            PATH = "Kalimah RadEKufar.mp3";
        }
    }


    public void requestPermission() {
        ActivityCompat.requestPermissions(this, perms, REQUEST_CODE);
    }

    @Override
    protected void onPause() {
        super.onPause();

        if (mediaPlayer != null) {
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.pause();
                mediaPlayer.stop();
            }
            mediaPlayer.release();
            mediaPlayer = null;

            binding.toolbarIncludeKalimasDetail.toolbarImageFirst.setImageResource(0);
            binding.toolbarIncludeKalimasDetail.toolbarImageFirst.setBackgroundResource(R.drawable.play);
        }
    }

    @Override
    public void onBackPressed() {

        if (mediaPlayer != null) {
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.pause();
                mediaPlayer.stop();
            }
            mediaPlayer.release();
            mediaPlayer = null;

            binding.toolbarIncludeKalimasDetail.toolbarImageFirst.setImageResource(0);
            binding.toolbarIncludeKalimasDetail.toolbarImageFirst.setBackgroundResource(R.drawable.play);

        }
        super.onBackPressed();
    }
}