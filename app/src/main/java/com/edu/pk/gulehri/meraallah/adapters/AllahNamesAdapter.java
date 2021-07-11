package com.edu.pk.gulehri.meraallah.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.edu.pk.gulehri.meraallah.databinding.NameViewBinding;
import com.edu.pk.gulehri.meraallah.model.Model;
import com.edu.pk.gulehri.meraallah.ui.AllahNamesDetailActivity;

/**
 * Created by Shahid Iqbal on 6/3/2021
 */

public class AllahNamesAdapter extends RecyclerView.Adapter<AllahNamesAdapter.NamesHolder> {
    public static final String ITEM_CLICKED = "Clicked Item Position";
    private Context mContext;

    @NonNull
    @Override
    public NamesHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        mContext = parent.getContext();
        return new NamesHolder(NameViewBinding.inflate(LayoutInflater.from(mContext), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull NamesHolder holder, int position) {

        holder.binding.nameArabic.setText(Model.ALLAH[position].getALLAH_NAMES_ARABIC());
        holder.binding.nameEnglish.setText(Model.ALLAH[position].getALLAH_NAMES_ENGLISH());

        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(mContext, AllahNamesDetailActivity.class);
            intent.putExtra(ITEM_CLICKED, position);
            mContext.startActivity(intent);
        });

    }

    @Override
    public int getItemCount() {
        return Model.ALLAH.length;
    }

    public static class NamesHolder extends RecyclerView.ViewHolder {
        private final NameViewBinding binding;

        public NamesHolder(@NonNull NameViewBinding viewBinding) {
            super(viewBinding.getRoot());
            binding = viewBinding;
        }
    }
}
