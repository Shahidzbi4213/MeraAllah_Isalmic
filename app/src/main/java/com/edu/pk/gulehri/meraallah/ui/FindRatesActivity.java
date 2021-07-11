package com.edu.pk.gulehri.meraallah.ui;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
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
import com.edu.pk.gulehri.meraallah.constansts.Constants;
import com.edu.pk.gulehri.meraallah.databinding.GoldRatesLayoutBinding;
import com.edu.pk.gulehri.meraallah.model.CountriesList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.Objects;

import dmax.dialog.SpotsDialog;

public class FindRatesActivity extends AppCompatActivity {

    private static final int DELAY = 8000;
    private final ArrayList<String> listCountry = new ArrayList<>();
    private final ArrayList<String> listCurrency = new ArrayList<>();

    private GoldRatesLayoutBinding binding;
    private String country, currency;
    private Elements dataElementsGold;
    private Elements dataElementsSilver;
    private String TOLA_GOLD, GRAM_GOLD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = GoldRatesLayoutBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setToolBar();
        setAdapter();


        binding.findBtn.setOnClickListener(v -> {

            //Hide Keyboard
            hideKeyboard();

            if (!haveNetworkConnection()) {
                Toast.makeText(this, "Connect to Internet", Toast.LENGTH_LONG).show();

            } else {
                AlertDialog progressDialog = new SpotsDialog.Builder().
                        setTheme(R.style.Custom).
                        setContext(this).build();

                country = binding.autoTxt.getText().toString();

                if (country.isEmpty()) {
                    binding.autoTxt.setError("Please Select a country");
                } else {
                    int position = getPosition(country);
                    currency = CountriesList.COUNTRY_CURRENCY[position].getCurrency();
                    fetchRates(country, currency);
                    binding.autoTxt.setText("");

                    progressDialog.setMessage("Loading...");
                    progressDialog.setCancelable(false);
                    progressDialog.create();
                    progressDialog.show();

                    binding.tableLayout.setVisibility(View.GONE);
                    binding.tableLayoutSilver.setVisibility(View.GONE);
                    new Handler().postDelayed(() -> {
                        progressDialog.cancel();
                        progressDialog.dismiss();

                        binding.tableLayout.setVisibility(View.VISIBLE);
                        binding.tableLayoutSilver.setVisibility(View.VISIBLE);
                    }, DELAY);
                }
            }
        });


    }

    private void fetchRates(String Country, String Currency) {
        @SuppressLint("SetTextI18n") Thread thread = new Thread(() -> {
            try {
                String urlSilver;
                String urlGold;
                Elements elementsGold;
                Elements elementsSilver;

                if (country.equals("Pakistan")) {
                    urlGold = "https://hamariweb.com/finance/gold_rate/";
                    urlSilver = "https://hamariweb.com/finance/silver_rate/";
                } else {
                    urlGold = "https://www.urdupoint.com/business/gold-rates-in-" + Country.toLowerCase() + "-" + Currency + ".html";
                    urlSilver = "https://www.urdupoint.com/business/silver-rates-in-" + Country.toLowerCase() + "-" + Currency + ".html";
                }


                Document docGold = Jsoup.connect(urlGold).get();
                Document docSilver = Jsoup.connect(urlSilver).get();

                if (country.equals("Pakistan")) {
                    elementsGold = docGold.getElementsByClass("bold_text");
                    GRAM_GOLD = elementsGold.get(0).text();
                    TOLA_GOLD = elementsGold.get(1).text();

                    elementsSilver = docSilver.getElementsByClass("table table-bordered content-box mb-0");
                    dataElementsSilver =elementsSilver.select("td");

                } else {
                    elementsGold = docGold.getElementsByClass("table-responsive");
                    dataElementsGold = elementsGold.select("td");

                    elementsSilver = docSilver.getElementsByClass("resp_table");
                    dataElementsSilver = elementsSilver.select("td");
                }


            } catch (Exception e) {
                e.printStackTrace();
            }

            runOnUiThread(() -> {

                if (country.equals("Pakistan")) {

                    binding.location.setText("Pakistan");
                    binding.gramTenChoubis.setText(GRAM_GOLD);
                    binding.tola.setText(TOLA_GOLD);

                    binding.locationSilver.setText("Pakistan");
                    binding.gramTenChoubisSilver.setText(dataElementsSilver.get(0).text());
                    binding.tolaSilver.setText(dataElementsSilver.get(1).text());

                } else {
                    binding.location.setText(dataElementsGold.get(0).text());
                    binding.gramTenChoubis.setText(dataElementsGold.get(1).text());
                    binding.tola.setText(dataElementsGold.get(2).text());

                    binding.locationSilver.setText(dataElementsSilver.get(0).text());
                    binding.gramTenChoubisSilver.setText(dataElementsSilver.get(1).text());
                    binding.tolaSilver.setText(dataElementsSilver.get(2).text());
                }


            });
        });
        thread.start();
    }

    private void setToolBar() {
        setSupportActionBar(binding.includeGoldRates.mToolbar);
        binding.includeGoldRates.toolbarText.setText(R.string.find_Rates);
        binding.includeGoldRates.toolbarImageFirst.setImageResource(0);
        binding.includeGoldRates.toolbarImageSecond.setImageResource(0);
        binding.includeGoldRates.mToolbar.setElevation(0);


        try {
            Toolbar.LayoutParams params = new Toolbar.LayoutParams(Toolbar.LayoutParams.WRAP_CONTENT, Toolbar.LayoutParams.WRAP_CONTENT);
            params.gravity = Gravity.CENTER;
            binding.includeGoldRates.toolbarText.setLayoutParams(params);
            final Drawable drawable = ContextCompat.getDrawable(this, R.drawable.back_arrow);
            Objects.requireNonNull(getSupportActionBar()).setHomeAsUpIndicator(drawable);
            getSupportActionBar().setDisplayShowTitleEnabled(false);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setHomeButtonEnabled(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void setAdapter() {
        for (int i = 0; i < CountriesList.COUNTRY_CURRENCY.length; i++) {
            listCountry.add(CountriesList.COUNTRY_CURRENCY[i].getCountry());
            listCurrency.add(CountriesList.COUNTRY_CURRENCY[i].getCurrency());
        }
        Log.i(Constants.TAG, "setAdapter: " + CountriesList.COUNTRY_CURRENCY.length);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listCountry);
        binding.autoTxt.setAdapter(adapter);

        binding.tableLayout.setVisibility(View.GONE);
        binding.tableLayoutSilver.setVisibility(View.GONE);
    }

    private int getPosition(String Country) {
        return listCountry.indexOf(Country);
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

    public void hideKeyboard() {
        // Check if no view has focus:
        View view = FindRatesActivity.this.getCurrentFocus();
        if (view != null) {
            InputMethodManager inputManager = (InputMethodManager) this.getSystemService(Context.INPUT_METHOD_SERVICE);
            inputManager.hideSoftInputFromWindow(view.getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
        }
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);

    }
}