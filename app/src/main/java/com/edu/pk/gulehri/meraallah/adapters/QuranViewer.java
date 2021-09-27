package com.edu.pk.gulehri.meraallah.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.edu.pk.gulehri.meraallah.model.Arabic;

import java.util.List;

public class QuranViewer extends RecyclerView.Adapter<QuranViewer.DataHolder> {

    private Context mContext;
    private List<Arabic> arabic;
    private List<Arabic> urdu;
    private List<Arabic> english;

    public QuranViewer(Context mContext, List<Arabic> arabic, List<Arabic> urdu, List<Arabic> english) {
        this.mContext = mContext;
        this.arabic = arabic;
        this.urdu = urdu;
        this.english = english;
    }

    @NonNull
    @Override
    public QuranViewer.DataHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull QuranViewer.DataHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return arabic.size();
    }

    public static class DataHolder extends RecyclerView.ViewHolder {
        public DataHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
