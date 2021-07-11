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
import com.edu.pk.gulehri.meraallah.ui.SupplicationDetailActivity;

import java.util.ArrayList;

public class SupplicationAdapter extends RecyclerView.Adapter<SupplicationAdapter.MySupplicationHolder> {
    public static final String POSITION_OF_DUA = "Dua Position";
    public static final String SELECTED_LANGUAGE = "Tab Language";
    public static final String ITEM_TEXT = "Item Text";
    public static ArrayList<Model> duaList;


    private final Context mContext;
    private final String language;
    private Intent intent;

    public SupplicationAdapter(Context mContext, String language, ArrayList<Model> supplicationsList) {
        this.mContext = mContext;
        this.language = language;
        duaList = supplicationsList;
    }

    @NonNull
    @Override
    public SupplicationAdapter.MySupplicationHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.single_item_view, parent, false);
        return new MySupplicationHolder(view);
    }

    @SuppressLint("DefaultLocale")
    @Override
    public void onBindViewHolder(@NonNull SupplicationAdapter.MySupplicationHolder holder, int position) {


        if (language.equals("Urdu")) {

            holder.linearLayout.setLayoutDirection(View.LAYOUT_DIRECTION_RTL);
            holder.duaCount.setText(String.format("(%d)", position + 1));
            holder.duaTitle.setText(duaList.get(position).getDUA_URDU());

        } else if (language.equals("English")) {
            holder.linearLayout.setLayoutDirection(View.LAYOUT_DIRECTION_LTR);

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {

                Typeface typeface = ResourcesCompat.getFont(mContext, R.font.dosis_medium);
                holder.duaCount.setTypeface(typeface);
                holder.duaTitle.setTypeface(typeface);
                holder.duaTitle.setTextSize(TypedValue.COMPLEX_UNIT_PX, mContext.getResources().getDimension(R.dimen._16sdp));
                holder.duaCount.setTextSize(TypedValue.COMPLEX_UNIT_PX, mContext.getResources().getDimension(R.dimen._16sdp));

            } else {

                holder.duaCount.setTypeface(Typeface.SERIF, Typeface.ITALIC);
                holder.duaTitle.setTypeface(Typeface.SERIF, Typeface.ITALIC);

                holder.duaTitle.setTextSize(TypedValue.COMPLEX_UNIT_PX, mContext.getResources().getDimension(R.dimen._14sdp));
                holder.duaCount.setTextSize(TypedValue.COMPLEX_UNIT_PX, mContext.getResources().getDimension(R.dimen._14sdp));
            }


            holder.duaCount.setText(String.format("(%d)", position + 1));
            holder.duaTitle.setText(duaList.get(position).getDUA_ENGLISH());
        }

        holder.itemView.setOnClickListener(v -> {
            intent = new Intent(mContext, SupplicationDetailActivity.class);
            intent.putExtra(POSITION_OF_DUA, position);
            intent.putExtra(ITEM_TEXT, holder.duaTitle.getText().toString());
            intent.putExtra(SELECTED_LANGUAGE, language);
            mContext.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return duaList.size();
    }

    public void updateDataList(ArrayList<Model> list) {
        duaList = new ArrayList<>();
        duaList.addAll(list);
        notifyDataSetChanged();
    }


    static class MySupplicationHolder extends RecyclerView.ViewHolder {
        private final TextView duaCount;
        private final TextView duaTitle;
        private final LinearLayout linearLayout;

        public MySupplicationHolder(@NonNull View itemView) {
            super(itemView);
            duaCount = itemView.findViewById(R.id.count);
            duaTitle = itemView.findViewById(R.id.heading);
            linearLayout = itemView.findViewById(R.id.myLayout);
        }
    }
}
