package com.edu.pk.gulehri.meraallah.adapters;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.edu.pk.gulehri.meraallah.R;
import com.edu.pk.gulehri.meraallah.databinding.SurahInfoDialogBinding;
import com.edu.pk.gulehri.meraallah.databinding.SurahNamesListViewBinding;
import com.edu.pk.gulehri.meraallah.model.DataModel;
import com.edu.pk.gulehri.meraallah.model.SurahList;
import com.edu.pk.gulehri.meraallah.ui.QuranFifteenActivity;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/**
 * Created by Shahid Iqbal on 5/17/2021
 */

public class SurahNamesAdapter extends RecyclerView.Adapter<SurahNamesAdapter.DataHolder> {
    public static final String ITEM_POSITION = "Position of Clicked Item";
    public static final String ITEM_TEXT = "Selected Item Text";
    private Context mContext;
    private ArrayList<DataModel> surahList;
    private ArrayList<SurahList> sList = new ArrayList<>();

    private String name;
    private String englishName;
    private String englishNameTranslation;
    private String numberOfAyahs;
    private String type;
    private SurahList listOfSurah;


    public SurahNamesAdapter(ArrayList<DataModel> surahList) {
        this.surahList = surahList;
    }

    public SurahNamesAdapter() {
    }

    public void updateDataList(ArrayList<DataModel> list) {
        surahList = new ArrayList<>();
        surahList.addAll(list);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public DataHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        mContext = parent.getContext();
        return new DataHolder(SurahNamesListViewBinding.inflate(LayoutInflater.from(mContext), parent, false));
    }

    @SuppressLint({"DefaultLocale", "SetTextI18n"})
    @Override
    public void onBindViewHolder(@NonNull DataHolder holder, int position) {


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            holder.binding.surahCount.setTypeface(ResourcesCompat.getFont(mContext, R.font.dosis_medium));

        }

        holder.binding.surahArabic.setText(surahList.get(position).getSURAH_NAME());
        holder.binding.surahEnglish.setText(surahList.get(position).getSURAH_NAME_ENGLISH());
        holder.binding.surahCount.setText(String.format("(%d)", position + 1));

        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(mContext, QuranFifteenActivity.class);
            intent.putExtra(ITEM_POSITION, position);
            intent.putExtra(ITEM_TEXT, holder.binding.surahEnglish.getText().toString());
            mContext.startActivity(intent);
        });

        holder.binding.btnForInfo.setOnClickListener(v1 -> {

            try {
                final ArrayList<SurahList> surahLists = readFromJson();
                final SurahInfoDialogBinding dialogBinding = SurahInfoDialogBinding.inflate(LayoutInflater.from(mContext));
                AlertDialog builder = new AlertDialog.Builder(mContext).setView(dialogBinding.getRoot())
                        .setCancelable(false).create();

                builder.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
                builder.getWindow().setWindowAnimations(R.style.DialogAnimation);

                dialogBinding.btnGone.setOnClickListener(v2 -> builder.dismiss());

                dialogBinding.aName.setText("Arabic: " + surahLists.get(position).getName());
                dialogBinding.eName.setText("English: " + surahLists.get(position).getEnglishName());
                dialogBinding.eTrans.setText("Translation: " + surahLists.get(position).getEnglishNameTranslation());
                dialogBinding.nAyah.setText("Total Ayah: " + surahLists.get(position).getNumberOfAyahs());
                dialogBinding.sType.setText("Type: " + surahLists.get(position).getType());

                builder.show();


            } catch (IOException | JSONException e) {
                e.printStackTrace();
            }

        });
    }

    private ArrayList<SurahList> readFromJson() throws IOException, JSONException {

        String json;
        InputStream stream = mContext.getAssets().open("surah_list.json");
        int size = stream.available();

        byte[] buffer = new byte[size];
        final int read = stream.read(buffer);
        stream.close();

        json = new String(buffer, StandardCharsets.UTF_8);
        JSONObject object = new JSONObject(json);
        JSONArray array = object.getJSONArray("data");

        for (int i = 0; i < array.length(); i++) {

            JSONObject metaData = array.getJSONObject(i);

            name = metaData.getString("name");
            englishName = metaData.getString("englishName");
            englishNameTranslation = metaData.getString("englishNameTranslation");
            numberOfAyahs = String.valueOf(metaData.getInt("numberOfAyahs"));
            type = metaData.getString("revelationType");

            listOfSurah = new SurahList(name, englishName, englishNameTranslation, numberOfAyahs, type);
            sList.add(listOfSurah);
        }
        return sList;

    }

    @Override
    public int getItemCount() {
        return surahList.size();
    }

    public static class DataHolder extends RecyclerView.ViewHolder {
        private final SurahNamesListViewBinding binding;

        public DataHolder(@NonNull SurahNamesListViewBinding itemViewBinding) {
            super(itemViewBinding.getRoot());
            binding = itemViewBinding;
        }
    }
}
