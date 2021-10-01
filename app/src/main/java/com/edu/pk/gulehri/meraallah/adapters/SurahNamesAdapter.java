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
import com.edu.pk.gulehri.meraallah.model.SurahList;
import com.edu.pk.gulehri.meraallah.ui.QuranFifteenActivity;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * Created by Shahid Iqbal on 5/17/2021
 */

public class SurahNamesAdapter extends RecyclerView.Adapter<SurahNamesAdapter.DataHolder> {
    public static final String ITEM_POSITION = "Position of Clicked Item";
    public static final String ITEM_TEXT = "Selected Item Text";
    private Context mContext;
    private final ArrayList<SurahList> surahList;
    private final List<SurahList> list;

    public SurahNamesAdapter(ArrayList<SurahList> surahList) {
        this.surahList = surahList;
        list = new ArrayList<>();
        list.addAll(surahList);
    }

    public void filter(String text) {

        text = text.toLowerCase(Locale.getDefault());
        surahList.clear();

        if (text.length() == 0) {
            surahList.addAll(list);
        } else {
            for (SurahList i : list) {

                if (i.getEnglishName().toLowerCase().contains(text)) {
                    surahList.add(i);
                }
            }
        }

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
            holder.binding.surahCount.setTypeface(ResourcesCompat.getFont(mContext, R.font.catamaran_medium));
        }

        holder.binding.surahArabic.setText(surahList.get(position).getName());
        holder.binding.surahEnglish.setText(surahList.get(position).getEnglishName() + " (" + surahList.get(position).getEnglishNameTranslation() + " )");
        holder.binding.surahCount.setText(String.format("(%d)", position + 1));

        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(mContext, QuranFifteenActivity.class);
            intent.putExtra(ITEM_TEXT, surahList.get(position).getEnglishName());
            Gson gson = new Gson();
            String s = gson.toJson(list, List.class);
            intent.putExtra("sList", s);
            mContext.startActivity(intent);
        });

        holder.binding.btnForInfo.setOnClickListener(v1 -> {

            final SurahInfoDialogBinding dialogBinding = SurahInfoDialogBinding.inflate(LayoutInflater.from(mContext));
            AlertDialog builder = new AlertDialog.Builder(mContext).setView(dialogBinding.getRoot())
                    .setCancelable(false).create();

            builder.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
            builder.getWindow().setWindowAnimations(R.style.DialogAnimation);

            dialogBinding.btnGone.setOnClickListener(v2 -> builder.dismiss());
            dialogBinding.aName.setText("Arabic: " + surahList.get(position).getName());
            dialogBinding.eName.setText("English: " + surahList.get(position).getEnglishName());
            dialogBinding.eTrans.setText("Translation: " + surahList.get(position).getEnglishNameTranslation());
            dialogBinding.nAyah.setText("Total Ayah: " + surahList.get(position).getNumberOfAyahs());
            dialogBinding.sType.setText("Type: " + surahList.get(position).getType());

            builder.show();


        });
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
