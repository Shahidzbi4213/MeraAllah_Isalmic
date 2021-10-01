package com.edu.pk.gulehri.meraallah.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.edu.pk.gulehri.meraallah.R;
import com.edu.pk.gulehri.meraallah.databinding.SingleItemViewBinding;
import com.edu.pk.gulehri.meraallah.model.DataModel;
import com.edu.pk.gulehri.meraallah.ui.NewBornDetailActivity;

/**
 * Created by Shahid Iqbal on 5/27/2021
 */

public class NewChildAdapter extends RecyclerView.Adapter<NewChildAdapter.ChildData> {
    public static final String POSITION = "Item Position";
    public static final String USER_LANGUAGE = "Selected Language";
    private final String language;
    private Context mContext;

    public NewChildAdapter(String language) {
        this.language = language;
    }

    @NonNull
    @Override
    public NewChildAdapter.ChildData onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        mContext = parent.getContext();
        return new ChildData(SingleItemViewBinding.inflate(LayoutInflater.from(mContext), parent, false));
    }

    @SuppressLint("DefaultLocale")
    @Override
    public void onBindViewHolder(@NonNull NewChildAdapter.ChildData holder, int position) {
        if (language.equals("Urdu")) {
            holder.binding.myLayout.setLayoutDirection(View.LAYOUT_DIRECTION_RTL);
            holder.binding.heading.setText(DataModel.NEWBORN_CHILD[position].getCHILD_HEADING_URDU());
            holder.binding.count.setText(String.format("(%d)", position + 1));
        } else if (language.equals("English")) {

            holder.binding.myLayout.setLayoutDirection(View.LAYOUT_DIRECTION_LTR);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {

                Typeface typeface = ResourcesCompat.getFont(mContext, R.font.catamaran_medium);
                holder.binding.heading.setTypeface(typeface);
                holder.binding.count.setTypeface(typeface);
                holder.binding.count.setTextSize(TypedValue.COMPLEX_UNIT_PX, mContext.getResources().getDimension(R.dimen._16sdp));
                holder.binding.heading.setTextSize(TypedValue.COMPLEX_UNIT_PX, mContext.getResources().getDimension(R.dimen._16sdp));
            } else {
                holder.binding.count.setTypeface(Typeface.SERIF, Typeface.ITALIC);
                holder.binding.heading.setTypeface(Typeface.SERIF, Typeface.ITALIC);
                holder.binding.count.setTextSize(TypedValue.COMPLEX_UNIT_PX, mContext.getResources().getDimension(R.dimen._14sdp));
                holder.binding.count.setTextSize(TypedValue.COMPLEX_UNIT_PX, mContext.getResources().getDimension(R.dimen._14sdp));
            }
            holder.binding.heading.setText(DataModel.NEWBORN_CHILD[position].getCHILD_HEADING_ENGLISH());
            holder.binding.count.setText(String.format("(%d)", position + 1));
        }
        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(mContext, NewBornDetailActivity.class);
            intent.putExtra(POSITION, position);
            intent.putExtra(USER_LANGUAGE, language);
            mContext.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return DataModel.NEWBORN_CHILD.length;
    }

    public static class ChildData extends RecyclerView.ViewHolder {
        private final SingleItemViewBinding binding;

        public ChildData(@NonNull SingleItemViewBinding itemViewBinding) {
            super(itemViewBinding.getRoot());
            binding = itemViewBinding;
        }
    }
}
