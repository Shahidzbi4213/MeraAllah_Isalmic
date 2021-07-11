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
import com.edu.pk.gulehri.meraallah.ui.HijriInfoDetail;

import java.util.List;

public class HijriInfoAdapter extends RecyclerView.Adapter<HijriInfoAdapter.MyHolder> {

    public static final String POSITION_OF_ITEM = "Item Position";
    public static final String HEADING_TEXT = "Text of Heading";
    private final List<String> dataList;
    private Context mContext;

    public HijriInfoAdapter(List<String> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        mContext = parent.getContext();
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_item_view, parent, false);
        return new MyHolder(view);
    }

    @SuppressLint("DefaultLocale")
    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {

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
            holder.heading.setTextSize(TypedValue.COMPLEX_UNIT_PX, mContext.getResources().getDimension(R.dimen._14sdp));
        }
        holder.count.setText(String.format("(%d)", position + 1));
        holder.heading.setText(dataList.get(position));

        holder.mLinearLayout.setOnClickListener(v -> {
            Intent intent = new Intent(mContext, HijriInfoDetail.class);
            intent.putExtra(POSITION_OF_ITEM, position);
            intent.putExtra(HEADING_TEXT,holder.heading.getText());
            mContext.startActivity(intent);
        });

    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public static class MyHolder extends RecyclerView.ViewHolder {
        private final TextView heading;
        private final TextView count;
        private final LinearLayout mLinearLayout;

        public MyHolder(@NonNull View itemView) {
            super(itemView);

            heading = itemView.findViewById(R.id.heading);
            count = itemView.findViewById(R.id.count);
            mLinearLayout = itemView.findViewById(R.id.myLayout);
        }
    }
}
