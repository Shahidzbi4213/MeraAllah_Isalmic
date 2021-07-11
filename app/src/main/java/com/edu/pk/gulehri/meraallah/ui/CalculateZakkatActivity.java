package com.edu.pk.gulehri.meraallah.ui;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;

import com.edu.pk.gulehri.meraallah.R;
import com.edu.pk.gulehri.meraallah.databinding.ActivityCalculateZakatBinding;
import com.edu.pk.gulehri.meraallah.model.CountriesList;
import com.google.common.base.CharMatcher;

import org.apache.commons.lang3.StringUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;

import dmax.dialog.SpotsDialog;

public class CalculateZakkatActivity extends AppCompatActivity implements View.OnClickListener {

    public static final int DELAY_MILLIS = 8000;
    private final ArrayList<String> countryList = new ArrayList<>();
    private final ArrayList<String> currencyList = new ArrayList<>();
    private String Country, Currency;
    private int Cash, position;
    private ActivityCalculateZakatBinding binding;
    private Elements dataElementsSilver;
    private String Silver_Tola;
    private SharedPreferences sp;
    private SharedPreferences.Editor edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCalculateZakatBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setToolbar();
        setAdapter();
        setListener();
    }

    private void setAdapter() {
        for (int i = 0; i < CountriesList.COUNTRY_CURRENCY.length; i++) {
            countryList.add(CountriesList.COUNTRY_CURRENCY[i].getCountry());
            currencyList.add(CountriesList.COUNTRY_CURRENCY[i].getCurrency());
        }

        //Assigning Country List to AutoComplete TextView
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, countryList);
        binding.CompleteCountry.setAdapter(adapter);
    }

    private void setListener() {
        binding.btnCalculate.setOnClickListener(this);
    }

    private void setToolbar() {
        setSupportActionBar(binding.toolbarIncludeZakatFinder.mToolbar);
        binding.toolbarIncludeZakatFinder.toolbarText.setText(R.string.find_zakkat);
        binding.toolbarIncludeZakatFinder.toolbarImageFirst.setImageResource(0);
        binding.toolbarIncludeZakatFinder.mToolbar.setElevation(0);

        try {
            Toolbar.LayoutParams params = new Toolbar.LayoutParams(Toolbar.LayoutParams.WRAP_CONTENT, Toolbar.LayoutParams.WRAP_CONTENT);
            params.gravity = Gravity.CENTER;
            binding.toolbarIncludeZakatFinder.toolbarText.setLayoutParams(params);
            final Drawable drawable = ContextCompat.getDrawable(this, R.drawable.back_arrow);
            Objects.requireNonNull(getSupportActionBar()).setHomeAsUpIndicator(drawable);
            getSupportActionBar().setDisplayShowTitleEnabled(false);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setHomeButtonEnabled(true);
        } catch (Exception e) {
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

    private boolean haveNetworkConnection() {
        boolean haveConnectedWifi = false;
        boolean haveConnectedMobile = false;

        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo[] netInfo = cm.getAllNetworkInfo();
        for (NetworkInfo ni : netInfo) {
            if (ni.getTypeName().equalsIgnoreCase("WIFI"))
                if (ni.isConnected())
                    haveConnectedWifi = true;
            if (ni.getTypeName().equalsIgnoreCase("MOBILE"))
                if (ni.isConnected())
                    haveConnectedMobile = true;
        }
        return haveConnectedWifi || haveConnectedMobile;
    }

    private void calculateZakkat() {
        if (!haveNetworkConnection()) {
            Toast.makeText(this, "Connect to Internet", Toast.LENGTH_SHORT).show();
        } else {
            if (binding.CompleteCountry.getText().toString().isEmpty()) {
                binding.CompleteCountry.setError("Select a Country to proceed");
            }
            if (binding.editTextCash.getText().toString().isEmpty()) {
                binding.editTextCash.setError("Give amount to proceed");
            } else {
                Country = binding.CompleteCountry.getText().toString();
                Cash = Integer.parseInt(binding.editTextCash.getText().toString());
                position = getPosition(Country);
                Currency = CountriesList.COUNTRY_CURRENCY[position].getCurrency();
                fetchRates(Country, Currency);
            }
        }
    }

    private void fetchRates(String country, String currency) {
        @SuppressLint("SetTextI18n") Thread thread = new Thread(() -> {
            try {
                String urlSilver;
                Elements elementsSilver;

                urlSilver = "https://www.urdupoint.com/business/silver-rates-in-" + country.toLowerCase()
                        + "-" + currency + ".html";

                Document docSilver = Jsoup.connect(urlSilver).get();
                elementsSilver = docSilver.getElementsByClass("resp_table");
                dataElementsSilver = elementsSilver.select("td");
            } catch (Exception e) {
                e.printStackTrace();
            }
            runOnUiThread(() -> Silver_Tola = dataElementsSilver.get(2).text());
        });
        thread.start();
    }

    @SuppressLint("SetTextI18n")
    public void getNisab(@NonNull String tola) {
        String data;
        sp = getPreferences(MODE_PRIVATE);
        String Nation = sp.getString("nation", null);
        int Money = sp.getInt("money", 0);

        //If tola value equal PKR 1420 make it PKR 1420.00
        if (!tola.contains(".")) {
            tola = tola.concat(".00");
        }

        //Getting Number before decimal Eg: PKR 123.06 == PKR 123
        String str = StringUtils.substringBefore(tola, ".");

        //Getting Numbers from String PKR 123 = 123
        data = CharMatcher.inRange('0', '9').retainFrom(str);

        //Convert 123 String to Integer
        int tolaPrice = Integer.parseInt(data);

        //Calculating Zakkat Nisab == Silver 52 and half tola
        int nisab = (tolaPrice * 52) + (tolaPrice / 2);

        //Zakkat formula 2.5% of total amount
        int zakkat = Money / 40;

        // format the number for a particular locale
        String nisabFormat = NumberFormat.getInstance(Locale.getDefault()).format(nisab);
        String zakkatFormat = NumberFormat.getInstance(Locale.getDefault()).format(zakkat);
        String moneyFormat = NumberFormat.getInstance(Locale.getDefault()).format(Money);

        //Getting Currency for Specific Country
        position = getPosition(Nation);
        Currency = CountriesList.COUNTRY_CURRENCY[position].getCurrency();

        if (Money < nisab) {
            binding.txtStatus.setText(("No"));
            binding.txtPaidZakat.setText(Currency + " " + 0);
        } else {
            binding.txtStatus.setText("Yes");
            binding.txtPaidZakat.setText(Currency + " " + zakkatFormat);
        }
        binding.txtAmount.setText(Currency + " " + moneyFormat);
        binding.txtNisab.setText(Currency + " " + nisabFormat);
        binding.txtCountryName.setText(Nation);

    }

    private int getPosition(String Country) {
        return countryList.indexOf(Country);
    }

    public void hideKeyboard() {
        // Check if no view has focus:
        View view = CalculateZakkatActivity.this.getCurrentFocus();
        if (view != null) {
            InputMethodManager inputManager = (InputMethodManager) this.getSystemService(Context.INPUT_METHOD_SERVICE);
            inputManager.hideSoftInputFromWindow(view.getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
        }
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_calculate) {
            calculateZakkat();
            binding.viewD.setVisibility(View.VISIBLE);
            binding.zakkatDetail.setVisibility(View.GONE);

            sp = getPreferences(MODE_PRIVATE);
            edit = sp.edit();
            edit.putString("nation", Country);
            edit.putInt("money", Cash);
            edit.apply();

            //Hiding Keyboard
            hideKeyboard();

            //Show Progress Dialog for 8seconds
            AlertDialog progressDialog = new SpotsDialog.Builder().
                    setTheme(R.style.Custom).
                    setContext(this).build();
            progressDialog.setMessage("Please Wait....");
            progressDialog.setCancelable(false);

            if ((!binding.CompleteCountry.getText().toString().isEmpty()) &&
                    (!binding.editTextCash.getText().toString().isEmpty()) &&
                    (haveNetworkConnection())) {
                progressDialog.create();
                progressDialog.show();

                new Handler().postDelayed(() -> {
                    binding.viewD.setVisibility(View.GONE);
                    binding.zakkatDetail.setVisibility(View.VISIBLE);

                    if (Country.equals("Pakistan")) {
                        //Rs. 1430 will be  change to 1430
                        String tola_Rate_Pakistan = Silver_Tola.replaceAll("Rs.", "");
                        getNisab(tola_Rate_Pakistan);
                    } else {
                        getNisab(Silver_Tola);
                    }
                    progressDialog.dismiss();
                    progressDialog.cancel();
                }, DELAY_MILLIS);
                //Clear Text  in both Fields
                binding.CompleteCountry.setText("");
                binding.editTextCash.setText("");

                //Set Cursor to AutoComplete TextView
                binding.CompleteCountry.requestFocus();
                //Clear Cursor from Cash EditText
                binding.CompleteCountry.clearFocus();
            }

        }
    }

}
