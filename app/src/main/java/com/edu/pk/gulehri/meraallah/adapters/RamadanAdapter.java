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
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.edu.pk.gulehri.meraallah.R;
import com.edu.pk.gulehri.meraallah.model.Model;
import com.edu.pk.gulehri.meraallah.ui.RamadanDetailActivity;

public class RamadanAdapter extends RecyclerView.Adapter<RamadanAdapter.RamadanHolder> {
    public static final String POSITION = "Position of Item";
    public static final String LANGUAGE = "Selected Language";
    public static final String HEADING = "Select Item Title";
    private final Context mContext;
    private final String Language;

    public RamadanAdapter(Context mContext, String language) {
        this.mContext = mContext;
        Language = language;
    }

    @NonNull
    @Override
    public RamadanAdapter.RamadanHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.single_item_view, parent, false);
        return new RamadanHolder(view);
    }

    @SuppressLint("DefaultLocale")
    @Override
    public void onBindViewHolder(@NonNull RamadanAdapter.RamadanHolder holder, int position) {

        if (Language.equals("Urdu")) {
            holder.mLinearLayout.setLayoutDirection(View.LAYOUT_DIRECTION_RTL);

            holder.heading.setText(Model.RAMADAN_HEADINGS[position].getRAMADAN_HEADING_URDU());
            holder.count.setText(String.format("(%d)", position + 1));

        } else if (Language.equals("English")) {

            holder.mLinearLayout.setLayoutDirection(View.LAYOUT_DIRECTION_LTR);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {

                Typeface typeface = ResourcesCompat.getFont(mContext, R.font.catamaran_medium);

                holder.heading.setTypeface(typeface);
                holder.count.setTypeface(typeface);

                holder.count.setTextSize(TypedValue.COMPLEX_UNIT_PX, mContext.getResources().getDimension(R.dimen._16sdp));
                holder.heading.setTextSize(TypedValue.COMPLEX_UNIT_PX, mContext.getResources().getDimension(R.dimen._16sdp));
            } else {
                holder.count.setTypeface(Typeface.SERIF, Typeface.ITALIC);
                holder.heading.setTypeface(Typeface.SERIF, Typeface.ITALIC);

                holder.count.setTextSize(TypedValue.COMPLEX_UNIT_PX, mContext.getResources().getDimension(R.dimen._14sdp));
                holder.count.setTextSize(TypedValue.COMPLEX_UNIT_PX, mContext.getResources().getDimension(R.dimen._14sdp));

            }

            holder.heading.setText(Model.RAMADAN_HEADINGS[position].getRAMADAN_HEADING_ENGLISH());
            holder.count.setText(String.format("(%d)", position + 1));

        }


        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(mContext, RamadanDetailActivity.class);
            intent.putExtra(POSITION, position);
            intent.putExtra(LANGUAGE, Language);
            intent.putExtra(HEADING, holder.heading.getText());
            mContext.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return Model.RAMADAN_HEADINGS.length;
    }

    static class RamadanHolder extends RecyclerView.ViewHolder {

        private final TextView heading;
        private final TextView count;
        private final LinearLayout mLinearLayout;

        public RamadanHolder(@NonNull View itemView) {
            super(itemView);
            heading = itemView.findViewById(R.id.heading);
            count = itemView.findViewById(R.id.count);
            mLinearLayout = itemView.findViewById(R.id.myLayout);
        }
    }
}
