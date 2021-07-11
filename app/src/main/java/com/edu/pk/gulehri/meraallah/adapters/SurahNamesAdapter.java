package com.edu.pk.gulehri.meraallah.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.edu.pk.gulehri.meraallah.R;
import com.edu.pk.gulehri.meraallah.databinding.SurahNamesListViewBinding;
import com.edu.pk.gulehri.meraallah.model.DataModel;
import com.edu.pk.gulehri.meraallah.ui.QuranFifteenActivity;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Shahid Iqbal on 5/17/2021
 */

public class SurahNamesAdapter extends RecyclerView.Adapter<SurahNamesAdapter.DataHolder> {
    public static final String ITEM_POSITION = "Position of Clicked Item";
    public static final String ITEM_TEXT = "Selected Item Text";
    private Context mContext;
    private ArrayList<DataModel> surahList;


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
