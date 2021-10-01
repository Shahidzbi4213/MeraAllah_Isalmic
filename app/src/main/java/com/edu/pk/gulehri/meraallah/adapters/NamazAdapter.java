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
import com.edu.pk.gulehri.meraallah.ui.NamazDetailActivity;

public class NamazAdapter extends RecyclerView.Adapter<NamazAdapter.MyNamazHolder> {
    /**
     * vars
     */
    public static final String TITLE = "Title";
    public static final String POSITION = "Position";
    public static final String LANGUAGE = "Tab Language";
    private final Context mContext;
    private final String language;
    private String ITEM_NAME;

    public NamazAdapter(Context mContext, String language) {
        this.mContext = mContext;
        this.language = language;
    }

    @NonNull
    @Override
    public MyNamazHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.single_item_view, parent, false);
        return new MyNamazHolder(view);
    }

    @SuppressLint("DefaultLocale")
    @Override
    public void onBindViewHolder(@NonNull MyNamazHolder holder, int position) {

        if (language.equals("Urdu")) {
            holder.linearLayout.setLayoutDirection(View.LAYOUT_DIRECTION_RTL);
            holder.namazSteps.setText(String.format("(%d)", position + 1));
            holder.namazHeading.setText(Model.NAMAZ[position].getNAMAZ_HEADING_URDU());
        } else if (language.equals("English")) {
            holder.linearLayout.setLayoutDirection(View.LAYOUT_DIRECTION_LTR);

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {

                Typeface typeface = ResourcesCompat.getFont(mContext, R.font.catamaran_medium);
                holder.namazHeading.setTypeface(typeface);
                holder.namazSteps.setTypeface(typeface);
                holder.namazHeading.setTextSize(TypedValue.COMPLEX_UNIT_PX, mContext.getResources().getDimension(R.dimen._16sdp));
                holder.namazSteps.setTextSize(TypedValue.COMPLEX_UNIT_PX, mContext.getResources().getDimension(R.dimen._16sdp));

            } else {

                holder.namazHeading.setTypeface(Typeface.SERIF, Typeface.ITALIC);
                holder.namazSteps.setTypeface(Typeface.SERIF, Typeface.ITALIC);

                holder.namazHeading.setTextSize(TypedValue.COMPLEX_UNIT_PX, mContext.getResources().getDimension(R.dimen._14sdp));
                holder.namazSteps.setTextSize(TypedValue.COMPLEX_UNIT_PX, mContext.getResources().getDimension(R.dimen._14sdp));
            }


            holder.namazSteps.setText(String.format("(%d)", position + 1));
            holder.namazHeading.setText(Model.NAMAZ[position].getNAMAZ_HEADING_ENGLISH());
        }

        holder.itemView.setOnClickListener(v -> {
            ITEM_NAME = holder.namazHeading.getText().toString();
            Intent intent = new Intent(mContext, NamazDetailActivity.class);
            intent.putExtra(TITLE, ITEM_NAME);
            intent.putExtra(POSITION, position);
            intent.putExtra(LANGUAGE, language);
            mContext.startActivity(intent);
        });

    }

    @Override
    public int getItemCount() {
        return Model.NAMAZ.length;

    }

    static class MyNamazHolder extends RecyclerView.ViewHolder {
        final TextView namazSteps;
        final TextView namazHeading;
        final LinearLayout linearLayout;

        public MyNamazHolder(@NonNull View itemView) {
            super(itemView);
            namazSteps = itemView.findViewById(R.id.count);
            namazHeading = itemView.findViewById(R.id.heading);
            linearLayout = itemView.findViewById(R.id.myLayout);
        }
    }
}
