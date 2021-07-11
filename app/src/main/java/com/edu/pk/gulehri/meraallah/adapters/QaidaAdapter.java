package com.edu.pk.gulehri.meraallah.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.edu.pk.gulehri.meraallah.R;
import com.edu.pk.gulehri.meraallah.databinding.LessonLayoutBinding;
import com.edu.pk.gulehri.meraallah.model.DataModel;
import com.edu.pk.gulehri.meraallah.ui.QaidaViewerActivity;

/**
 * Created by Shahid Iqbal on 5/24/2021
 */

public class QaidaAdapter extends RecyclerView.Adapter<QaidaAdapter.DataCatcher> {
    public static final String ITEM_CLICKED_POSITION = "Item Position";
    private Context mContext;

    @NonNull
    @Override
    public DataCatcher onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        mContext = parent.getContext();
        return new DataCatcher(LessonLayoutBinding.inflate(LayoutInflater.from(mContext), parent, false));
    }

    @SuppressLint({"DefaultLocale", "SetTextI18n"})
    @Override
    public void onBindViewHolder(@NonNull DataCatcher holder, int position) {

        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.O) {
            holder.binding.header.setTypeface(Typeface.SERIF, Typeface.ITALIC);
            holder.binding.header.setTextSize(TypedValue.COMPLEX_UNIT_PX, mContext.getResources().getDimension(R.dimen._14sdp));
        }
        holder.binding.header.setText("Lesson" + " " + DataModel.NOORANI_QAIDA[position].getLESSON_NO());

        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(mContext, QaidaViewerActivity.class);
            intent.putExtra(ITEM_CLICKED_POSITION, position);
            mContext.startActivity(intent);
        });

    }

    @Override
    public int getItemCount() {
        return DataModel.NOORANI_QAIDA.length;
    }

    public static class DataCatcher extends RecyclerView.ViewHolder {
        private final LessonLayoutBinding binding;

        public DataCatcher(@NonNull LessonLayoutBinding itemViewBinding) {
            super(itemViewBinding.getRoot());
            binding = itemViewBinding;
        }
    }
}
