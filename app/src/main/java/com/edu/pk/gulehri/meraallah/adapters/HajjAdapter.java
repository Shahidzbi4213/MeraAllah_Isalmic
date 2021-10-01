package com.edu.pk.gulehri.meraallah.adapters;

import static java.lang.String.format;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.util.Log;
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
import com.edu.pk.gulehri.meraallah.constansts.Constants;
import com.edu.pk.gulehri.meraallah.model.Model;
import com.edu.pk.gulehri.meraallah.ui.HajjDetailActivity;

public class HajjAdapter extends RecyclerView.Adapter<HajjAdapter.MyHajjHolder> {

    public static final String POSITION = "Position of Item";
    public static final String LANGUAGE = "Selected Language";
    private Context context;
    private final String SELECT_LANGUAGE;

    public HajjAdapter(Context context, String SELECT_LANGUAGE) {
        this.context = context;
        this.SELECT_LANGUAGE = SELECT_LANGUAGE;
    }

    @NonNull
    @Override
    public HajjAdapter.MyHajjHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_item_view, parent, false);
        return new MyHajjHolder(view);
    }


    @SuppressLint("DefaultLocale")
    @Override
    public void onBindViewHolder(@NonNull HajjAdapter.MyHajjHolder holder, int position) {

        if (SELECT_LANGUAGE.equals("Urdu")) {
            holder.mCount.setText(format("(%d)", position + 1));
            holder.heading.setText(Model.HAJJ_HEADINGS[position].getHAJJ_HEADINGS_URDU());

        } else if (SELECT_LANGUAGE.equals("English")) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                Typeface typeface = ResourcesCompat.getFont(context, R.font.catamaran_medium);
                holder.mCount.setTypeface(typeface);
                holder.heading.setTypeface(typeface);

                holder.mCount.setTextSize(TypedValue.COMPLEX_UNIT_PX, context.getResources().getDimension(R.dimen._16sdp));
                holder.heading.setTextSize(TypedValue.COMPLEX_UNIT_PX, context.getResources().getDimension(R.dimen._16sdp));

            } else {
                holder.mCount.setTypeface(Typeface.SERIF, Typeface.ITALIC);
                holder.heading.setTypeface(Typeface.SERIF, Typeface.ITALIC);
                holder.mCount.setTextSize(TypedValue.COMPLEX_UNIT_PX, context.getResources().getDimension(R.dimen._14sdp));
                holder.heading.setTextSize(TypedValue.COMPLEX_UNIT_PX, context.getResources().getDimension(R.dimen._14sdp));
            }
            holder.mLayout.setLayoutDirection(View.LAYOUT_DIRECTION_LTR);
            holder.mCount.setText(format("(%d)", position + 1));
            holder.heading.setText(Model.HAJJ_HEADINGS[position].getHAJJ_HEADINGS_ENGLISH());
        }
        Log.i(Constants.TAG, "onBindViewHolder: " + position);

        holder.mLayout.setOnClickListener(v -> {

            Intent intent = new Intent(context, HajjDetailActivity.class);
            intent.putExtra(POSITION, position);
            intent.putExtra(LANGUAGE, SELECT_LANGUAGE);
            context.startActivity(intent);
        });

    }

    @Override
    public int getItemCount() {
        return Model.HAJJ_HEADINGS.length;
    }

    static class MyHajjHolder extends RecyclerView.ViewHolder {
        private final LinearLayout mLayout;
        private final TextView mCount;
        private final TextView heading;

        public MyHajjHolder(@NonNull View itemView) {
            super(itemView);
            mLayout = itemView.findViewById(R.id.myLayout);
            mCount = itemView.findViewById(R.id.count);
            heading = itemView.findViewById(R.id.heading);
        }
    }
}
