package com.edu.pk.gulehri.meraallah.adapters;

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
import com.edu.pk.gulehri.meraallah.ui.AblutionDetailActivity;

public class AblutionAdapter extends RecyclerView.Adapter<AblutionAdapter.MyAblutionHolder> {
    public static final String POSITION = "Item Position";
    public static final String LANGUAGE = "Selected Tab Language";
    public static final String HEADING = "HEADING";
    private final Context mContext;
    private final String language;

    public AblutionAdapter(Context mContext, String language) {
        this.mContext = mContext;
        this.language = language;
    }

    @NonNull
    @Override
    public MyAblutionHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.single_item_view, parent, false);
        return new MyAblutionHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAblutionHolder holder, int position) {


        if (language.equals("Urdu")) {
            holder.linearLayout.setLayoutDirection(View.LAYOUT_DIRECTION_RTL);

            holder.heading.setText(Model.ABLUTION[position].getABLUTION_HEADING_URDU());
            holder.count.setText(String.format("(%d)", position + 1));

        } else if (language.equals("English")) {

            holder.linearLayout.setLayoutDirection(View.LAYOUT_DIRECTION_LTR);
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

            holder.heading.setText(Model.ABLUTION[position].getABLUTION_HEADING_ENGLISH());
            holder.count.setText(String.format("(%d)", position + 1));

        }

        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(mContext, AblutionDetailActivity.class);
            intent.putExtra(POSITION, position);
            intent.putExtra(LANGUAGE, language);
            intent.putExtra(HEADING, holder.heading.getText());
            mContext.startActivity(intent);
        });

    }

    @Override
    public int getItemCount() {
        return Model.ABLUTION.length;
    }

    static class MyAblutionHolder extends RecyclerView.ViewHolder {
        private final TextView count;
        private final TextView heading;
        private final LinearLayout linearLayout;


        public MyAblutionHolder(@NonNull View itemView) {
            super(itemView);
            count = itemView.findViewById(R.id.count);
            heading = itemView.findViewById(R.id.heading);
            linearLayout = itemView.findViewById(R.id.myLayout);

        }
    }
}
