package com.edu.pk.gulehri.meraallah.ui;

import static android.Manifest.permission.READ_EXTERNAL_STORAGE;
import static android.Manifest.permission.WRITE_EXTERNAL_STORAGE;
import static android.view.View.GONE;
import static android.view.View.VISIBLE;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.media.ThumbnailUtils;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;
import androidx.core.content.res.ResourcesCompat;

import com.edu.pk.gulehri.meraallah.R;
import com.edu.pk.gulehri.meraallah.databinding.ActivityVideoBinding;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.io.File;
import java.util.Objects;

public class VideoActivity extends AppCompatActivity implements View.OnClickListener {

    public static final String CARD_ID = "Clicked Card Name";
    private static final int REQUEST_CODE = 77;
    private ActivityVideoBinding binding;
    private SharedPreferences sp;
    private SharedPreferences.Editor edit;
    private String CHILD, PATH;
    private int ID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityVideoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        setToolBar();
        setPermission();
        setListeners();
        setData();
        atStart();
    }

    @SuppressLint("SetTextI18n")
    private void setToolBar() {
        try {
            setSupportActionBar(binding.toolbarIncludeVideo.mToolbar);
            binding.toolbarIncludeVideo.mToolbar.setElevation(0);

            binding.toolbarIncludeVideo.toolbarImageFirst.setImageResource(0);
            binding.toolbarIncludeVideo.toolbarImageSecond.setImageResource(0);
            binding.toolbarIncludeVideo.toolbarText.setText(R.string.islamic_videos);
            Toolbar.LayoutParams params = new Toolbar.LayoutParams(Toolbar.LayoutParams.WRAP_CONTENT, Toolbar.LayoutParams.WRAP_CONTENT);
            params.gravity = Gravity.CENTER;
            binding.toolbarIncludeVideo.toolbarText.setLayoutParams(params);
            Objects.requireNonNull(getSupportActionBar()).setDisplayShowTitleEnabled(false);
            final Drawable drawable = ResourcesCompat.getDrawable(getResources(), R.drawable.back_arrow, null);
            getSupportActionBar().setHomeAsUpIndicator(drawable);
            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    private void setPermission() {
        ActivityCompat.requestPermissions(this,
                new String[]{READ_EXTERNAL_STORAGE,
                        WRITE_EXTERNAL_STORAGE}, REQUEST_CODE);
    }

    @SuppressLint("SetTextI18n")
    private void setData() {
        binding.tvNameA.setText("Allah Attributes");
        binding.tvNameB.setText("99 Attributes of Allah");
        binding.tvNameC.setText("How Allah Helps The Youth?");
        binding.tvNameD.setText("99 Names of Prophet Muhammad (SAW)");
        binding.tvNameE.setText("Who is Allah ?");
        binding.tvNameF.setText("The Story of Prophet Muhammad (SAW)");
        binding.tvNameG.setText("Don't Be Sad - Allah Knows");
        binding.tvNameH.setText("The Most Beautiful Things You Will Get In Heaven !!");
        binding.tvNameI.setText("Surah Al Fatiha [Explained]");
        binding.tvNameJ.setText("Hell (Jahanum)");
    }

    private void setListeners() {
        binding.cardA.setOnClickListener(this);
        binding.cardB.setOnClickListener(this);
        binding.cardC.setOnClickListener(this);
        binding.cardD.setOnClickListener(this);
        binding.cardE.setOnClickListener(this);
        binding.cardF.setOnClickListener(this);
        binding.cardG.setOnClickListener(this);
        binding.cardH.setOnClickListener(this);
        binding.cardI.setOnClickListener(this);
        binding.cardJ.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        sp = getPreferences(MODE_PRIVATE);
        boolean flagA = sp.getBoolean("video1", false);
        boolean flagB = sp.getBoolean("video2", false);
        boolean flagC = sp.getBoolean("video3", false);
        boolean flagD = sp.getBoolean("video4", false);
        boolean flagE = sp.getBoolean("video5", false);
        boolean flagF = sp.getBoolean("video6", false);
        boolean flagG = sp.getBoolean("video7", false);
        boolean flagH = sp.getBoolean("video8", false);
        boolean flagI = sp.getBoolean("video9", false);
        boolean flagJ = sp.getBoolean("video10", false);

        if (id == R.id.cardA) {
            ID = 1;

            if (flagA) {
                sendIntent(ID);
            } else {
                downloadVideo();
            }
        } else if (id == R.id.cardB) {
            ID = 2;
            if (flagB) {
                sendIntent(ID);
            } else {
                downloadVideo();
            }
        } else if (id == R.id.cardC) {
            ID = 3;
            if (flagC) {
                sendIntent(ID);
            } else {
                downloadVideo();
            }
        } else if (id == R.id.cardD) {
            ID = 4;
            if (flagD) {
                sendIntent(ID);
            } else {
                downloadVideo();
            }
        } else if (id == R.id.cardE) {
            ID = 5;
            if (flagE) {
                sendIntent(ID);
            } else {
                downloadVideo();
            }
        } else if (id == R.id.cardF) {
            ID = 6;
            if (flagF) {
                sendIntent(ID);
            } else {
                downloadVideo();
            }
        } else if (id == R.id.cardG) {
            ID = 7;
            if (flagG) {
                sendIntent(ID);
            } else {
                downloadVideo();
            }
        } else if (id == R.id.cardH) {
            ID = 8;
            if (flagH) {
                sendIntent(ID);
            } else {
                downloadVideo();
            }
        } else if (id == R.id.cardI) {
            ID = 9;
            if (flagI) {
                sendIntent(ID);
            } else {
                downloadVideo();
            }
        } else if (id == R.id.cardJ) {
            ID = 10;
            if (flagJ) {
                sendIntent(ID);
            } else {
                downloadVideo();
            }
        }
    }

    private void sendIntent(int cardID) {
        Intent intent = new Intent(this, VideoPlayActivity.class);
        intent.putExtra(CARD_ID, cardID);
        startActivity(intent);
        finish();
    }


    private void downloadVideo() {

        if (!haveNetworkConnection()) {
            Toast.makeText(this, "Connect to Internet to Download Video", Toast.LENGTH_SHORT).show();
        } else {
            setChildPath();

            //Folder
            File storagePath = new File(this.getExternalFilesDir(null), "Android");
            // Create directory if not exists
            if (!storagePath.exists()) {
                boolean mkdirs = storagePath.mkdirs();
            }
            StorageReference pathReference = FirebaseStorage.getInstance().getReference();

            //Save Video Folder
            File file = new File(storagePath, PATH);
            pathReference.child(CHILD).getFile(file).addOnSuccessListener(taskSnapshot -> {
                sp = getPreferences(MODE_PRIVATE);
                edit = sp.edit();

                if (ID == 1) {
                    edit.putBoolean("video1", true);
                    edit.apply();
                } else if (ID == 2) {
                    edit.putBoolean("video2", true);
                    edit.apply();
                } else if (ID == 3) {
                    edit.putBoolean("video3", true);
                    edit.apply();
                } else if (ID == 4) {
                    edit.putBoolean("video4", true);
                    edit.apply();
                    edit.apply();
                } else if (ID == 5) {
                    edit.putBoolean("video5", true);
                    edit.apply();
                } else if (ID == 6) {
                    edit.putBoolean("video6", true);
                    edit.apply();
                } else if (ID == 7) {
                    edit.putBoolean("video7", true);
                    edit.apply();
                } else if (ID == 8) {
                    edit.putBoolean("video8", true);
                    edit.apply();
                } else if (ID == 9) {
                    edit.putBoolean("video9", true);
                    edit.apply();
                } else if (ID == 10) {
                    edit.putBoolean("video10", true);
                    edit.apply();
                }
                hideDownloadFields(file);
                Toast.makeText(this, "Download Complete", Toast.LENGTH_SHORT).show();
            }).addOnProgressListener(snapshot -> {
                double progress = ((100 * snapshot.getBytesTransferred()) / snapshot.getTotalByteCount());
                setDownloadProgress(progress);

            }).addOnFailureListener(e -> {
                hideDownloadFields(null);
                Toast.makeText(VideoActivity.this, "Download Failed", Toast.LENGTH_SHORT).show();
            });

        }
    }

    private void setChildPath() {
        if (ID == 1) {
            CHILD = "Islamic Videos/Video First.mp4";
            PATH = "Islamic First.mp4";
        } else if (ID == 2) {
            CHILD = "Islamic Videos/Video Second.mp4";
            PATH = "Islamic Second.mp4";
        } else if (ID == 3) {
            CHILD = "Islamic Videos/Video Third.mp4";
            PATH = "Islamic Third.mp4";
        } else if (ID == 4) {
            CHILD = "Islamic Videos/Video Fourth.mp4";
            PATH = "Islamic Fourth.mp4";
        } else if (ID == 5) {
            CHILD = "Islamic Videos/Video Fifth.mp4";
            PATH = "Islamic Fifth.mp4";
        } else if (ID == 6) {
            CHILD = "Islamic Videos/Video Sixth.mp4";
            PATH = "Islamic Sixth.mp4";
        } else if (ID == 7) {
            CHILD = "Islamic Videos/Video Seventh.mp4";
            PATH = "Islamic Seventh.mp4";
        } else if (ID == 8) {
            CHILD = "Islamic Videos/Video Eighth.mp4";
            PATH = "Islamic Eighth.mp4";
        } else if (ID == 9) {
            CHILD = "Islamic Videos/Video Ninth.mp4";
            PATH = "Islamic Ninth.mp4";
        } else if (ID == 10) {
            CHILD = "Islamic Videos/Video Tenth.mp4";
            PATH = "Islamic Tenth.mp4";
        }
    }

    @SuppressLint("SetTextI18n")
    private void setDownloadProgress(double progress) {
        if (ID == 1) {
            binding.pbA.setVisibility(VISIBLE);
            binding.tvPerA.setVisibility(VISIBLE);
            binding.pbA.setProgress((int) progress);
            binding.tvPerA.setText(progress + "%");
        } else if (ID == 2) {
            binding.pbB.setVisibility(VISIBLE);
            binding.tvPerB.setVisibility(VISIBLE);
            binding.pbB.setProgress((int) progress);
            binding.tvPerB.setText(progress + "%");
        } else if (ID == 3) {
            binding.pbC.setVisibility(VISIBLE);
            binding.tvPerC.setVisibility(VISIBLE);
            binding.pbC.setProgress((int) progress);
            binding.tvPerC.setText(progress + "%");
        } else if (ID == 4) {
            binding.pbD.setVisibility(VISIBLE);
            binding.tvPerD.setVisibility(VISIBLE);
            binding.pbD.setProgress((int) progress);
            binding.tvPerD.setText(progress + "%");
        } else if (ID == 5) {
            binding.pbE.setVisibility(VISIBLE);
            binding.tvPerE.setVisibility(VISIBLE);
            binding.pbE.setProgress((int) progress);
            binding.tvPerE.setText(progress + "%");
        } else if (ID == 6) {
            binding.pbF.setVisibility(VISIBLE);
            binding.tvPerF.setVisibility(VISIBLE);
            binding.pbF.setProgress((int) progress);
            binding.tvPerF.setText(progress + "%");
        } else if (ID == 7) {
            binding.pbG.setVisibility(VISIBLE);
            binding.tvPerG.setVisibility(VISIBLE);
            binding.pbG.setProgress((int) progress);
            binding.tvPerG.setText(progress + "%");
        } else if (ID == 8) {
            binding.pbH.setVisibility(VISIBLE);
            binding.tvPerH.setVisibility(VISIBLE);
            binding.pbH.setProgress((int) progress);
            binding.tvPerH.setText(progress + "%");
        } else if (ID == 9) {
            binding.pbI.setVisibility(VISIBLE);
            binding.tvPerI.setVisibility(VISIBLE);
            binding.pbI.setProgress((int) progress);
            binding.tvPerI.setText(progress + "%");
        } else if (ID == 10) {
            binding.pbJ.setVisibility(VISIBLE);
            binding.tvPerJ.setVisibility(VISIBLE);
            binding.pbJ.setProgress((int) progress);
            binding.tvPerJ.setText(progress + "%");
        }
    }

    private void hideDownloadFields(File file) {

        if (ID == 1) {
            binding.pbA.setVisibility(GONE);
            binding.tvPerA.setVisibility(GONE);
            binding.imgDwnA.setVisibility(GONE);
            if (file != null) {
                Bitmap bMap = ThumbnailUtils.createVideoThumbnail("/storage/emulated/0/Android/data/com.edu.pk.gulehri.meraallah/files/Android/Islamic First.mp4", MediaStore.Video.Thumbnails.MINI_KIND);
                binding.imgThumbA.setImageBitmap(bMap);
            } else {
                binding.imgThumbA.setImageResource(R.drawable.ic_video);
            }

        } else if (ID == 2) {
            binding.pbB.setVisibility(GONE);
            binding.tvPerB.setVisibility(GONE);
            binding.imgDwnB.setVisibility(GONE);
            if (file != null) {
                Bitmap bMap = ThumbnailUtils.createVideoThumbnail("/storage/emulated/0/Android/data/com.edu.pk.gulehri.meraallah/files/Android/Islamic Second.mp4", MediaStore.Video.Thumbnails.MINI_KIND);
                binding.imgThumbB.setImageBitmap(bMap);
            } else {
                binding.imgThumbB.setImageResource(R.drawable.ic_video);
            }
        } else if (ID == 3) {
            binding.pbC.setVisibility(GONE);
            binding.tvPerC.setVisibility(GONE);
            binding.imgDwnC.setVisibility(GONE);
            if (file != null) {
                Bitmap bMap = ThumbnailUtils.createVideoThumbnail("/storage/emulated/0/Android/data/com.edu.pk.gulehri.meraallah/files/Android/Islamic Third.mp4", MediaStore.Video.Thumbnails.MINI_KIND);
                binding.imgThumbC.setImageBitmap(bMap);
            } else {
                binding.imgThumbC.setImageResource(R.drawable.ic_video);
            }

        } else if (ID == 4) {
            binding.pbD.setVisibility(GONE);
            binding.tvPerD.setVisibility(GONE);
            binding.imgDwnD.setVisibility(GONE);
            if (file != null) {
                Bitmap bMap = ThumbnailUtils.createVideoThumbnail("/storage/emulated/0/Android/data/com.edu.pk.gulehri.meraallah/files/Android/Islamic Fourth.mp4", MediaStore.Video.Thumbnails.MINI_KIND);
                binding.imgThumbD.setImageBitmap(bMap);
            } else {
                binding.imgThumbD.setImageResource(R.drawable.ic_video);
            }

        } else if (ID == 5) {
            binding.pbE.setVisibility(GONE);
            binding.tvPerE.setVisibility(GONE);
            binding.imgDwnE.setVisibility(GONE);
            if (file != null) {
                Bitmap bMap = ThumbnailUtils.createVideoThumbnail("/storage/emulated/0/Android/data/com.edu.pk.gulehri.meraallah/files/Android/Islamic Fifth.mp4", MediaStore.Video.Thumbnails.MINI_KIND);
                binding.imgThumbE.setImageBitmap(bMap);
            } else {
                binding.imgThumbE.setImageResource(R.drawable.ic_video);
            }

        } else if (ID == 6) {
            binding.pbF.setVisibility(GONE);
            binding.tvPerF.setVisibility(GONE);
            binding.imgDwnF.setVisibility(GONE);
            if (file != null) {
                Bitmap bMap = ThumbnailUtils.createVideoThumbnail("/storage/emulated/0/Android/data/com.edu.pk.gulehri.meraallah/files/Android/Islamic Sixth.mp4", MediaStore.Video.Thumbnails.MINI_KIND);
                binding.imgThumbF.setImageBitmap(bMap);
            } else {
                binding.imgThumbF.setImageResource(R.drawable.ic_video);
            }

        } else if (ID == 7) {
            binding.pbG.setVisibility(GONE);
            binding.tvPerG.setVisibility(GONE);
            binding.imgDwnG.setVisibility(GONE);
            if (file != null) {
                Bitmap bMap = ThumbnailUtils.createVideoThumbnail("/storage/emulated/0/Android/data/com.edu.pk.gulehri.meraallah/files/Android/Islamic Seventh.mp4", MediaStore.Video.Thumbnails.MINI_KIND);
                binding.imgThumbG.setImageBitmap(bMap);
            } else {
                binding.imgThumbG.setImageResource(R.drawable.ic_video);
            }

        } else if (ID == 8) {
            binding.pbH.setVisibility(GONE);
            binding.tvPerH.setVisibility(GONE);
            binding.imgDwnH.setVisibility(GONE);
            if (file != null) {
                Bitmap bMap = ThumbnailUtils.createVideoThumbnail("/storage/emulated/0/Android/data/com.edu.pk.gulehri.meraallah/files/Android/Islamic Eighth.mp4", MediaStore.Video.Thumbnails.MINI_KIND);
                binding.imgThumbH.setImageBitmap(bMap);
            } else {
                binding.imgThumbH.setImageResource(R.drawable.ic_video);
            }

        } else if (ID == 9) {
            binding.pbI.setVisibility(GONE);
            binding.tvPerI.setVisibility(GONE);
            binding.imgDwnI.setVisibility(GONE);
            if (file != null) {
                Bitmap bMap = ThumbnailUtils.createVideoThumbnail("/storage/emulated/0/Android/data/com.edu.pk.gulehri.meraallah/files/Android/Islamic Ninth.mp4", MediaStore.Video.Thumbnails.MINI_KIND);
                binding.imgThumbI.setImageBitmap(bMap);
            } else {
                binding.imgThumbI.setImageResource(R.drawable.ic_video);
            }

        } else if (ID == 10) {
            binding.pbJ.setVisibility(GONE);
            binding.tvPerJ.setVisibility(GONE);
            binding.imgDwnJ.setVisibility(GONE);
            if (file != null) {
                Bitmap bMap = ThumbnailUtils.createVideoThumbnail("/storage/emulated/0/Android/data/com.edu.pk.gulehri.meraallah/files/Android/Islamic Tenth.mp4", MediaStore.Video.Thumbnails.MINI_KIND);
                binding.imgThumbJ.setImageBitmap(bMap);
            } else {
                binding.imgThumbJ.setImageResource(R.drawable.ic_video);
            }

        }
    }

    private void atStart() {
        sp = getPreferences(MODE_PRIVATE);
        boolean flagA = sp.getBoolean("video1", false);
        boolean flagB = sp.getBoolean("video2", false);
        boolean flagC = sp.getBoolean("video3", false);
        boolean flagD = sp.getBoolean("video4", false);
        boolean flagE = sp.getBoolean("video5", false);
        boolean flagF = sp.getBoolean("video6", false);
        boolean flagG = sp.getBoolean("video7", false);
        boolean flagH = sp.getBoolean("video8", false);
        boolean flagI = sp.getBoolean("video9", false);
        boolean flagJ = sp.getBoolean("video10", false);


        if (flagA) {
            Bitmap bMap = ThumbnailUtils.createVideoThumbnail("/storage/emulated/0/Android/data/com.edu.pk.gulehri.meraallah/files/Android/Islamic First.mp4", MediaStore.Video.Thumbnails.MINI_KIND);
            binding.imgThumbA.setImageBitmap(bMap);
            binding.imgDwnA.setVisibility(GONE);
        } else {
            binding.imgDwnA.setVisibility(VISIBLE);
        }
        if (flagB) {
            Bitmap bMap = ThumbnailUtils.createVideoThumbnail("/storage/emulated/0/Android/data/com.edu.pk.gulehri.meraallah/files/Android/Islamic Second.mp4", MediaStore.Video.Thumbnails.MINI_KIND);
            binding.imgThumbB.setImageBitmap(bMap);
            binding.imgDwnB.setVisibility(GONE);
        } else {
            binding.imgDwnB.setVisibility(VISIBLE);
        }
        if (flagC) {
            Bitmap bMap = ThumbnailUtils.createVideoThumbnail("/storage/emulated/0/Android/data/com.edu.pk.gulehri.meraallah/files/Android/Islamic Third.mp4", MediaStore.Video.Thumbnails.MINI_KIND);
            binding.imgThumbC.setImageBitmap(bMap);
            binding.imgDwnC.setVisibility(GONE);
        } else {
            binding.imgDwnC.setVisibility(VISIBLE);
        }
        if (flagD) {
            Bitmap bMap = ThumbnailUtils.createVideoThumbnail("/storage/emulated/0/Android/data/com.edu.pk.gulehri.meraallah/files/Android/Islamic Fourth.mp4", MediaStore.Video.Thumbnails.MINI_KIND);
            binding.imgThumbD.setImageBitmap(bMap);
            binding.imgDwnD.setVisibility(GONE);
        } else {
            binding.imgDwnD.setVisibility(VISIBLE);
        }
        if (flagE) {
            Bitmap bMap = ThumbnailUtils.createVideoThumbnail("/storage/emulated/0/Android/data/com.edu.pk.gulehri.meraallah/files/Android/Islamic Fifth.mp4", MediaStore.Video.Thumbnails.MINI_KIND);
            binding.imgThumbE.setImageBitmap(bMap);
            binding.imgDwnE.setVisibility(GONE);
        } else {
            binding.imgDwnE.setVisibility(VISIBLE);
        }
        if (flagF) {
            Bitmap bMap = ThumbnailUtils.createVideoThumbnail("/storage/emulated/0/Android/data/com.edu.pk.gulehri.meraallah/files/Android/Islamic Sixth.mp4", MediaStore.Video.Thumbnails.MINI_KIND);
            binding.imgThumbF.setImageBitmap(bMap);
            binding.imgDwnF.setVisibility(GONE);
        } else {
            binding.imgDwnF.setVisibility(VISIBLE);
        }
        if (flagG) {
            Bitmap bMap = ThumbnailUtils.createVideoThumbnail("/storage/emulated/0/Android/data/com.edu.pk.gulehri.meraallah/files/Android/Islamic Seventh.mp4", MediaStore.Video.Thumbnails.MINI_KIND);
            binding.imgThumbG.setImageBitmap(bMap);
            binding.imgDwnG.setVisibility(GONE);
        } else {
            binding.imgDwnG.setVisibility(VISIBLE);
        }
        if (flagH) {
            Bitmap bMap = ThumbnailUtils.createVideoThumbnail("/storage/emulated/0/Android/data/com.edu.pk.gulehri.meraallah/files/Android/Islamic Eighth.mp4", MediaStore.Video.Thumbnails.MINI_KIND);
            binding.imgThumbH.setImageBitmap(bMap);
            binding.imgDwnH.setVisibility(GONE);
        } else {
            binding.imgDwnH.setVisibility(VISIBLE);
        }
        if (flagI) {
            binding.imgDwnI.setVisibility(GONE);
            Bitmap bMap = ThumbnailUtils.createVideoThumbnail("/storage/emulated/0/Android/data/com.edu.pk.gulehri.meraallah/files/Android/Islamic Ninth.mp4", MediaStore.Video.Thumbnails.MINI_KIND);
            binding.imgThumbI.setImageBitmap(bMap);
        } else {
            binding.imgDwnI.setVisibility(VISIBLE);
        }
        if (flagJ) {
            Bitmap bMap = ThumbnailUtils.createVideoThumbnail("/storage/emulated/0/Android/data/com.edu.pk.gulehri.meraallah/files/Android/Islamic Tenth.mp4", MediaStore.Video.Thumbnails.MINI_KIND);
            binding.imgThumbJ.setImageBitmap(bMap);
            binding.imgDwnJ.setVisibility(GONE);
        } else {
            binding.imgDwnJ.setVisibility(VISIBLE);
        }
    }

    private boolean haveNetworkConnection() {
        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo wifi = cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
        NetworkInfo mobile = cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);

        return (wifi != null && wifi.isConnected()) || (mobile != null && mobile.isConnected());
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}