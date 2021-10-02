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
import com.edu.pk.gulehri.meraallah.ui.KalimasDetailActivity;

public class KalimasAdapter extends RecyclerView.Adapter<KalimasAdapter.DataHolder> {
    public static final String SELECTED_LANGUAGE = "Selected Language";
    public static final String CLICKED_POSITION = "Item Position";


    private final String language;
    private Context mContext;

    public KalimasAdapter(String language) {
        this.language = language;
    }

    @NonNull
    @Override
    public DataHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        mContext = parent.getContext();
        return new DataHolder(SingleItemViewBinding.inflate(LayoutInflater.from(mContext), parent, false));
    }

    @SuppressLint("DefaultLocale")
    @Override
    public void onBindViewHolder(@NonNull DataHolder holder, int position) {

        if (language.equals("Urdu")) {
            holder.binding.myLayout.setLayoutDirection(View.LAYOUT_DIRECTION_RTL);

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {

                Typeface typeface = ResourcesCompat.getFont(mContext, R.font.q_font);
                holder.binding.heading.setTypeface(typeface);
            }

            holder.binding.heading.setText(DataModel.SIX_KALIMAS_HEADINGS[position].getFUNERAL_PRAYER_PROCESS_IN_ENGLISH());
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

            holder.binding.heading.setText(DataModel.SIX_KALIMAS_HEADINGS[position].getFUNERAL_PRAYER_PROCESS_IN_URDU());
            holder.binding.count.setText(String.format("(%d)", position + 1));

        }

        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(mContext, KalimasDetailActivity.class);
            intent.putExtra(SELECTED_LANGUAGE, language);
            intent.putExtra(CLICKED_POSITION, position);
            mContext.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return DataModel.SIX_KALIMAS_HEADINGS.length;
    }

    public static class DataHolder extends RecyclerView.ViewHolder {
        private final SingleItemViewBinding binding;

        public DataHolder(@NonNull SingleItemViewBinding itemViewBinding) {
            super(itemViewBinding.getRoot());
            binding = itemViewBinding;
        }
    }
}
