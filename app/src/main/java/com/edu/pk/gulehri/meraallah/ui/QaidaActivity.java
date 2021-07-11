package com.edu.pk.gulehri.meraallah.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.edu.pk.gulehri.meraallah.R;
import com.edu.pk.gulehri.meraallah.adapters.QaidaAdapter;
import com.edu.pk.gulehri.meraallah.databinding.ActivityQaidaBinding;
import com.edu.pk.gulehri.meraallah.databinding.DownloadDailogBinding;
import com.edu.pk.gulehri.meraallah.databinding.WannaDownloadDialogBinding;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.io.File;
import java.util.Objects;

import static android.Manifest.permission.READ_EXTERNAL_STORAGE;
import static android.Manifest.permission.WRITE_EXTERNAL_STORAGE;
import static android.content.pm.PackageManager.PERMISSION_GRANTED;
import static android.os.Build.VERSION_CODES.M;

public class QaidaActivity extends AppCompatActivity {

    public static final String CHECK_IS_FILE_DOWNLOAD = "Check file Downloaded or Not";
    public static final String DOWNLOADED_FILE_PATH = "File Path Name";
    private static final String[] perms = {READ_EXTERNAL_STORAGE, WRITE_EXTERNAL_STORAGE};
    private static final int REQUEST_CODE = 8998;

    private SharedPreferences sp;
    private SharedPreferences.Editor edit;

    private boolean checkFlag;
    private ActivityQaidaBinding binding;

    @RequiresApi(api = M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityQaidaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setToolBar();
        requestPermission();
    }

    private void setToolBar() {
        try {
            setSupportActionBar(binding.includeQaida.mToolbar);
            binding.includeQaida.mToolbar.setElevation(0);

            binding.includeQaida.toolbarImageFirst.setVisibility(View.GONE);
            binding.includeQaida.toolbarImageSecond.setVisibility(View.GONE);
            binding.includeQaida.toolbarText.setText(R.string.qaida);
            Toolbar.LayoutParams params = new Toolbar.LayoutParams(Toolbar.LayoutParams.WRAP_CONTENT, Toolbar.LayoutParams.WRAP_CONTENT);
            params.gravity = Gravity.CENTER;
            binding.includeQaida.toolbarText.setLayoutParams(params);
            Objects.requireNonNull(getSupportActionBar()).setDisplayShowTitleEnabled(false);
            final Drawable drawable = ResourcesCompat.getDrawable(getResources(), R.drawable.back_arrow, null);
            getSupportActionBar().setHomeAsUpIndicator(drawable);
            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    private void setAdapter() {
        try {
            binding.recycleQaida.setVisibility(View.VISIBLE);
            binding.recycleQaida.setLayoutManager(new LinearLayoutManager(this));
            binding.recycleQaida.setAdapter(new QaidaAdapter());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void showNotice() {

        sp = getSharedPreferences(null, MODE_PRIVATE);

        boolean isDownloaded = sp.getBoolean(CHECK_IS_FILE_DOWNLOAD, false);

        WannaDownloadDialogBinding wannaDownloadDialogBinding =
                WannaDownloadDialogBinding.inflate(getLayoutInflater());
        View view = wannaDownloadDialogBinding.getRoot();
        wannaDownloadDialogBinding.messageText.setText(R.string.message);

        if (!isDownloaded && binding.includeQaida.toolbarText.getText().equals("Qaida")) {
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

    @SuppressLint("SetTextI18n")
    private void downloadFile() {

        if (!haveNetworkConnection()) {
            Toast.makeText(this, "Connect to Internet", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this, MainActivity.class));
        } else {

            //Show Download Status
            DownloadDailogBinding downloadBind = DownloadDailogBinding.inflate(getLayoutInflater());
            AlertDialog dDialog = new AlertDialog.Builder(this)
                    .setView(downloadBind.getRoot())
                    .setCancelable(false)
                    .create();

            //setting Background Transparent && Animation
            dDialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
            dDialog.getWindow().setWindowAnimations(R.style.DialogAnimation);

            downloadBind.kalimahName.setText("Qaida");
            downloadBind.pb.setMax(100);

            //Making Android Folder
            File storagePath = new File(this.getExternalFilesDir(null), "Android");

            // Create directory if not exists
            if (!storagePath.exists()) {
                boolean mkdirs = storagePath.mkdirs();
            }

            //Save File to Qaida.pdf to Android Folder
            final File fileName = new File(storagePath, "Qaida.pdf");

            //Getting Instance to Firebase Storage
            StorageReference reference = FirebaseStorage.getInstance().getReference();

            //Child file inside firebase storage
            reference.child("Norani Qaida.pdf").getFile(fileName)
                    .addOnSuccessListener(taskSnapshot -> {

                        checkFlag = true;
                        sp = getSharedPreferences(null, MODE_PRIVATE);
                        edit = sp.edit();
                        edit.putBoolean(CHECK_IS_FILE_DOWNLOAD, checkFlag);
                        edit.putString(DOWNLOADED_FILE_PATH, fileName.getAbsolutePath());
                        edit.apply();
                        Toast.makeText(this, "Download Completed", Toast.LENGTH_SHORT).show();
                        showNotice();

                        dDialog.dismiss();


                    })
                    .addOnFailureListener(e -> {
                        Toast.makeText(this, "Failed to Download", Toast.LENGTH_SHORT).show();
                        dDialog.dismiss();
                    })
                    .addOnProgressListener(snapshot -> {
                        dDialog.show();
                        double progress = ((100 * snapshot.getBytesTransferred()) / snapshot.getTotalByteCount());
                        downloadBind.pb.setProgress((int) progress);
                        downloadBind.downloadView.setText("Downloading... " + progress + "%");
                    });

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

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
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
}