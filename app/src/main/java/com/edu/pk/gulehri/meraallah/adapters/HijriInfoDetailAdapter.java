package com.edu.pk.gulehri.meraallah.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.text.LineBreaker;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.edu.pk.gulehri.meraallah.R;
import com.edu.pk.gulehri.meraallah.model.Model;

public class HijriInfoDetailAdapter extends RecyclerView.Adapter<HijriInfoDetailAdapter.MyHolder> {
    private final int CLICKED_POSITION;
    private Context mContext;

    public HijriInfoDetailAdapter(int CLICKED_POSITION) {
        this.CLICKED_POSITION = CLICKED_POSITION;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        mContext = parent.getContext();
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.hijri_detail_layout_view, parent, false);
        return new MyHolder(view);
    }

    @SuppressLint({"SetTextI18n", "InlinedApi"})
    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        if (CLICKED_POSITION == 0) {
            holder.txtFirst.setText(Model.HIJRI_CALENDER[position].getRAMADAN_HEADING_ENGLISH());
            holder.txtThird.setText(Model.HIJRI_CALENDER[position].getRAMADAN_HEADING_URDU());

            holder.txtThird.setTextColor(mContext.getResources().getColor(R.color.white));

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                holder.txtThird.setJustificationMode(LineBreaker.JUSTIFICATION_MODE_INTER_WORD);
            }

            holder.txtSecond.setVisibility(View.GONE);
            holder.txtFourth.setVisibility(View.GONE);
            holder.zero.setVisibility(View.GONE);
            holder.first.setVisibility(View.GONE);
            holder.second.setVisibility(View.GONE);
        }
        if (CLICKED_POSITION == 1) {

            holder.txtFirst.setText("Name: " + Model.HIJRI_DAYS[position].getRAMADAN_QURAN_REFERENCE_ARABIC());
            holder.txtSecond.setText("عربى:" + Model.HIJRI_DAYS[position].getRAMADAN_QURAN_REFERENCE_TRANSLATION_ENGLISH());
            holder.txtThird.setText("Meaning: " + Model.HIJRI_DAYS[position].getRAMADAN_QURAN_REFERENCE_TRANSLATION_URDU());
            holder.txtFourth.setText("Solar Day: " + Model.HIJRI_DAYS[position].getRAMADAN_QURAN_AYAH_REFERENCE());


            holder.first.setVisibility(View.GONE);
            holder.second.setVisibility(View.GONE);

        }
        if (CLICKED_POSITION == 2) {
            holder.txtFirst.setText("Name: " + Model.Hijri_Months[position].getRAMADAN_QURAN_REFERENCE_ARABIC());
            holder.txtSecond.setText("عربى:" + Model.Hijri_Months[position].getRAMADAN_QURAN_REFERENCE_TRANSLATION_ENGLISH());
            holder.txtThird.setText("Meaning: " + Model.Hijri_Months[position].getRAMADAN_QURAN_REFERENCE_TRANSLATION_URDU());
            holder.txtFourth.setText("Note:  " + Model.Hijri_Months[position].getRAMADAN_QURAN_AYAH_REFERENCE());

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                holder.txtFourth.setJustificationMode(LineBreaker.JUSTIFICATION_MODE_INTER_WORD);
            }
            holder.first.setVisibility(View.GONE);
        }

        if (CLICKED_POSITION == 3) {
            holder.txtFirst.setText(Model.ISLAMIC_EVENTS[position].getHIJRA_DATES());
            holder.txtThird.setText(Model.ISLAMIC_EVENTS[position].getDESCRIPTION_OF_EVENTS());

            holder.txtThird.setTextColor(mContext.getResources().getColor(R.color.white));

            holder.txtSecond.setVisibility(View.GONE);
            holder.txtFourth.setVisibility(View.GONE);
            holder.zero.setVisibility(View.GONE);
            holder.first.setVisibility(View.GONE);
            holder.second.setVisibility(View.GONE);
        }

    }

    @Override
    public int getItemCount() {
        if (CLICKED_POSITION == 0) {
            return Model.HIJRI_CALENDER.length;
        } else if (CLICKED_POSITION == 1) {
            return Model.HIJRI_DAYS.length;
        } else if (CLICKED_POSITION == 2) {
            return Model.Hijri_Months.length;
        } else if (CLICKED_POSITION == 3) {
            return Model.ISLAMIC_EVENTS.length;
        } else return 0;

    }

    public static class MyHolder extends RecyclerView.ViewHolder {
        private final TextView txtFirst, txtSecond, txtThird, txtFourth;
        private final View zero, first, second;

        public MyHolder(@NonNull View itemView) {
            super(itemView);
            txtFirst = itemView.findViewById(R.id.txtFifth);
            txtSecond = itemView.findViewById(R.id.txtSecond);
            txtThird = itemView.findViewById(R.id.txtThird);
            txtFourth = itemView.findViewById(R.id.txtFourth);

            zero = itemView.findViewById(R.id.zero);
            first = itemView.findViewById(R.id.first);
            second = itemView.findViewById(R.id.second);
        }
    }
}
