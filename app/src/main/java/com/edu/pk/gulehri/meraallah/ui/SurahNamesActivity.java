package com.edu.pk.gulehri.meraallah.ui;

import static android.Manifest.permission.READ_EXTERNAL_STORAGE;
import static android.Manifest.permission.WRITE_EXTERNAL_STORAGE;
import static android.content.pm.PackageManager.PERMISSION_GRANTED;
import static android.os.Build.VERSION.SDK_INT;
import static android.os.Build.VERSION_CODES.Q;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.edu.pk.gulehri.meraallah.R;
import com.edu.pk.gulehri.meraallah.adapters.SurahNamesAdapter;
import com.edu.pk.gulehri.meraallah.databinding.ActivitySurahNamesBinding;
import com.edu.pk.gulehri.meraallah.databinding.DownloadDailogBinding;
import com.edu.pk.gulehri.meraallah.databinding.WannaDownloadDialogBinding;
import com.edu.pk.gulehri.meraallah.model.SurahList;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Objects;


public class SurahNamesActivity extends AppCompatActivity
        implements SearchView.OnQueryTextListener {

    public static final String CHECK_FILE_DOWNLOAD = "Check File";
    public static final String FILE_PATH = "File Path";
    private static final String[] perms = {READ_EXTERNAL_STORAGE, WRITE_EXTERNAL_STORAGE};
    private static final int REQUEST_CODE = 7878;
    private ActivitySurahNamesBinding binding;
    private boolean flag;
    private final ArrayList<SurahList> surahList = new ArrayList<>();
    private SurahNamesAdapter adapter;


    private SharedPreferences sp;
    private SharedPreferences.Editor edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySurahNamesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setToolBar();
        requestPermission();

    }

    private void showNotice() {
        sp = getSharedPreferences(null, MODE_PRIVATE);
        boolean isFileDownloaded = sp.getBoolean(CHECK_FILE_DOWNLOAD, false);
        WannaDownloadDialogBinding wannaDownloadDialogBinding = WannaDownloadDialogBinding.inflate(getLayoutInflater());
        View view = wannaDownloadDialogBinding.getRoot();

        if (!isFileDownloaded) {
            AlertDialog dialog = new AlertDialog.Builder(this).setView(view)
                    .setCancelable(false).create();

            //setting Background Transparent
            dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
            dialog.getWindow().setWindowAnimations(R.style.DialogAnimation);

            wannaDownloadDialogBinding.cancelBtn.setOnClickListener(v -> {
                dialog.cancel();
                dialog.dismiss();
                onBackPressed();

            });
            wannaDownloadDialogBinding.okBtn.setOnClickListener(v -> {
                dialog.dismiss();
                dialog.cancel();
                downloadFile();
            });

            dialog.show();
        } else {
            setAdapter();
        }
    }

    private void setAdapter() {
        try {
            binding.surahNameRecycleView.setVisibility(View.VISIBLE);
            binding.surahNameRecycleView.setLayoutManager(new LinearLayoutManager(this));
            adapter = new SurahNamesAdapter(readFromJson());
            binding.surahNameRecycleView.setAdapter(adapter);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private ArrayList<SurahList> readFromJson() throws IOException, JSONException {

        String json;
        InputStream stream = getAssets().open("surah_list.json");
        int size = stream.available();

        byte[] buffer = new byte[size];
        stream.read(buffer);
        stream.close();

        json = new String(buffer, StandardCharsets.UTF_8);
        JSONObject object = new JSONObject(json);
        JSONArray array = object.getJSONArray("data");

        for (int i = 0; i < array.length(); i++) {

            JSONObject metaData = array.getJSONObject(i);

            final String name = metaData.getString("name");
            final String englishName = metaData.getString("englishName");
            final String englishNameTranslation = metaData.getString("englishNameTranslation");
            final String numberOfAyahs = String.valueOf(metaData.getInt("numberOfAyahs"));
            final String type = metaData.getString("revelationType");

            final SurahList listOfSurah = new SurahList(name, englishName, englishNameTranslation, numberOfAyahs, type);
            surahList.add(listOfSurah);
        }
        return surahList;

    }

    @SuppressLint("SetTextI18n")
    private void downloadFile() {

        if (!haveNetworkConnection()) {
            Toast.makeText(this, "Connect to Internet", Toast.LENGTH_SHORT).show();
        } else {
            //Show Download Status
            DownloadDailogBinding dialogBinding = DownloadDailogBinding.inflate(getLayoutInflater());
            AlertDialog downloadDialog = new AlertDialog.Builder(this)
                    .setView(dialogBinding.getRoot())
                    .setCancelable(false)
                    .create();

            //setting Background Transparent && Animation
            downloadDialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
            downloadDialog.getWindow().setWindowAnimations(R.style.DialogAnimation);

            dialogBinding.kalimahName.setText("Holy Quran");
            dialogBinding.pb.setMax(100);


            File storagePath = new File(this.getExternalFilesDir(null), "Android");

            // Create directory if not exists
            if (!storagePath.exists()) {
                storagePath.mkdirs();
            }

            //Downloaded File Name
            final File file = new File(storagePath, "Quran.pdf");

            //Getting Instance to Firebase Storage
            StorageReference reference = FirebaseStorage.getInstance().getReference();

            //Child file inside firebase storage
            reference.child("quraan.pdf").getFile(file)
                    .addOnSuccessListener(taskSnapshot -> {

                        flag = true;
                        sp = getSharedPreferences(null, MODE_PRIVATE);
                        edit = sp.edit();
                        edit.putBoolean(CHECK_FILE_DOWNLOAD, flag);
                        edit.putString(FILE_PATH, file.getAbsolutePath());
                        edit.apply();
                        Toast.makeText(this, "Download Completed", Toast.LENGTH_SHORT).show();
                        showNotice();

                        downloadDialog.dismiss();


                    })
                    .addOnFailureListener(e -> {
                        Toast.makeText(this, "Failed to Download", Toast.LENGTH_SHORT).show();
                        downloadDialog.dismiss();
                    })
                    .addOnProgressListener(snapshot -> {
                        downloadDialog.show();
                        double progress = ((100 * snapshot.getBytesTransferred()) / snapshot.getTotalByteCount());
                        dialogBinding.pb.setProgress((int) progress);
                        dialogBinding.downloadView.setText("Downloading... " + progress + "%");
                    });

        }
    }

    private void setToolBar() {
        try {
            setSupportActionBar(binding.includeToolbarSurahNames.mToolbar);
            binding.includeToolbarSurahNames.mToolbar.setElevation(0);

            binding.includeToolbarSurahNames.toolbarImageFirst.setVisibility(View.GONE);
            binding.includeToolbarSurahNames.toolbarImageSecond.setVisibility(View.GONE);
            binding.includeToolbarSurahNames.toolbarText.setText(R.string.surah);
            Toolbar.LayoutParams params = new Toolbar.LayoutParams(Toolbar.LayoutParams.WRAP_CONTENT, Toolbar.LayoutParams.WRAP_CONTENT);
            params.gravity = Gravity.CENTER;
            binding.includeToolbarSurahNames.toolbarText.setLayoutParams(params);
            Objects.requireNonNull(getSupportActionBar()).setDisplayShowTitleEnabled(false);
            final Drawable drawable = ResourcesCompat.getDrawable(getResources(), R.drawable.back_arrow, null);
            getSupportActionBar().setHomeAsUpIndicator(drawable);
            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        } catch (NullPointerException e) {
            e.printStackTrace();
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
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        if (requestCode == REQUEST_CODE) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                Toast.makeText(this, "Permission Granted", Toast.LENGTH_SHORT).show();
                showNotice();
            } else {
                Toast.makeText(this, "Permission Denied", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this, MainActivity.class));
            }
        }
    }

    public void requestPermission() {

        if ((ContextCompat.checkSelfPermission(this, perms[0]) == PERMISSION_GRANTED) ||
                (ContextCompat.checkSelfPermission(this, perms[1]) == PERMISSION_GRANTED)) {
            showNotice();
        } else {
            ActivityCompat.requestPermissions(this, perms, REQUEST_CODE);
        }
    }

    private boolean haveNetworkConnection() {
        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo wifi = cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
        NetworkInfo mobile = cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);

        return (wifi != null && wifi.isConnected()) || (mobile != null && mobile.isConnected());

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(this, MainActivity.class));
    }


    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options_menu, menu);
        MenuItem menuItem = menu.findItem(R.id.search_ico);
        SearchView searchView = (SearchView) menuItem.getActionView();
        searchView.setOnQueryTextListener(this);

        EditText txtSearch = searchView.findViewById(androidx.appcompat.R.id.search_src_text);
        ImageView imageClose = searchView.findViewById(androidx.appcompat.R.id.search_close_btn);
        ImageView imageSearch = searchView.findViewById(androidx.appcompat.R.id.search_button);

        try {
            @SuppressLint("SoonBlockedPrivateApi") Field field = TextView.class.getDeclaredField("mCursorDrawableRes");
            field.setAccessible(true);
            field.set(txtSearch, R.drawable.my_cursor);
        } catch (Exception e) {
            e.printStackTrace();
        }

        imageClose.setColorFilter(Color.WHITE, PorterDuff.Mode.SRC_ATOP);
        imageSearch.setColorFilter(Color.WHITE, PorterDuff.Mode.SRC_ATOP);
        txtSearch.setHint("Search Surah");

        if (SDK_INT >= Q) {
            txtSearch.setTextCursorDrawable(R.drawable.my_cursor);
        }
        txtSearch.setHintTextColor(Color.LTGRAY);
        txtSearch.setTextColor(Color.WHITE);


        return super.onCreateOptionsMenu(menu);
    }


    @SuppressLint("NotifyDataSetChanged")
    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    @SuppressLint("NotifyDataSetChanged")
    @Override
    public boolean onQueryTextChange(String newText) {

        adapter.filter(newText);
        return false;

    }
}