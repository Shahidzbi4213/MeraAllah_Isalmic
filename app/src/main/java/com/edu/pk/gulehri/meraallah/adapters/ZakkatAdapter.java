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
import com.edu.pk.gulehri.meraallah.ui.CalculateZakkatActivity;
import com.edu.pk.gulehri.meraallah.ui.FindRatesActivity;
import com.edu.pk.gulehri.meraallah.ui.ZakkatDetailActivity;

public class ZakkatAdapter extends RecyclerView.Adapter<ZakkatAdapter.ZakkatHolder> {
    public static final String CLICKED_ITEM_DATA = "Item Data";
    public static final String CLICK_ITEM_POSITION = "Item Position";
    public static final String SELECTED_LANG = "Language";

    private final Context mContext;
    private final String Language;

    public ZakkatAdapter(Context mContext, String language) {
        this.mContext = mContext;
        Language = language;
    }

    @NonNull
    @Override
    public ZakkatAdapter.ZakkatHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.single_item_view, parent, false);
        return new ZakkatHolder(view);
    }

    @SuppressLint("DefaultLocale")
    @Override
    public void onBindViewHolder(@NonNull ZakkatAdapter.ZakkatHolder holder, int position) {

        if (Language.equals("Urdu")) {
            holder.mLinearLayout.setLayoutDirection(View.LAYOUT_DIRECTION_RTL);

            holder.heading.setText(Model.ZAKKAT_HEADINGS[position].getRAMADAN_HEADING_URDU());
            holder.count.setText(String.format("(%d)", position + 1));

        } else if (Language.equals("English")) {

            holder.mLinearLayout.setLayoutDirection(View.LAYOUT_DIRECTION_LTR);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {

                Typeface typeface = ResourcesCompat.getFont(mContext, R.font.dosis_medium);

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

            holder.heading.setText(Model.ZAKKAT_HEADINGS[position].getRAMADAN_HEADING_ENGLISH());
            holder.count.setText(String.format("(%d)", position + 1));

        }


        if (position == 3) {
            holder.itemView.setOnClickListener(v -> mContext.startActivity(new Intent(mContext, CalculateZakkatActivity.class)));
        } else if (position == 4) {
            holder.itemView.setOnClickListener(v -> mContext.startActivity(new Intent(mContext, FindRatesActivity.class)));
        } else {

            holder.itemView.setOnClickListener(v -> {
                Intent intent = new Intent(mContext, ZakkatDetailActivity.class);
                intent.putExtra(CLICKED_ITEM_DATA, holder.heading.getText());
                intent.putExtra(CLICK_ITEM_POSITION, position);
                intent.putExtra(SELECTED_LANG, Language);
                mContext.startActivity(intent);
            });

        }

    }

    @Override
    public int getItemCount() {
        return Model.ZAKKAT_HEADINGS.length;
    }

    static class ZakkatHolder extends RecyclerView.ViewHolder {
        private final TextView heading;
        private final TextView count;
        private final LinearLayout mLinearLayout;

        public ZakkatHolder(@NonNull View itemView) {
            super(itemView);
            heading = itemView.findViewById(R.id.heading);
            count = itemView.findViewById(R.id.count);
            mLinearLayout = itemView.findViewById(R.id.myLayout);
        }
    }
}
