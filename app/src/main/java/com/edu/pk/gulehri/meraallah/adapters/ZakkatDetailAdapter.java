package com.edu.pk.gulehri.meraallah.adapters;

import static com.edu.pk.gulehri.meraallah.R.dimen._20sdp;

import android.annotation.SuppressLint;
import android.content.Context;
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
import com.edu.pk.gulehri.meraallah.databinding.ZakkatDteailLayoutItemViewBinding;
import com.edu.pk.gulehri.meraallah.model.DataModel;
import com.edu.pk.gulehri.meraallah.model.Model;

public class ZakkatDetailAdapter extends RecyclerView.Adapter<ZakkatDetailAdapter.MyDateHolder> {
    private final String LANGUAGE;
    private final int CLICKED_POSITION;
    private Context mContext;


    public ZakkatDetailAdapter(String LANGUAGE, int CLICKED_POSITION) {
        this.LANGUAGE = LANGUAGE;
        this.CLICKED_POSITION = CLICKED_POSITION;
    }

    @NonNull
    @Override
    public ZakkatDetailAdapter.MyDateHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        mContext = parent.getContext();
        return new MyDateHolder(ZakkatDteailLayoutItemViewBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull ZakkatDetailAdapter.MyDateHolder holder, int position) {
        View zeroView = holder.binding.getRoot().findViewById(R.id.zeroView);
        View firstView = holder.binding.getRoot().findViewById(R.id.firstView);
        View secondView = holder.binding.getRoot().findViewById(R.id.secondView);
        View thirdView = holder.binding.getRoot().findViewById(R.id.thirdView);

        if (LANGUAGE.equalsIgnoreCase("Urdu")) {

            if (CLICKED_POSITION == 0) {
                holder.binding.txtOne.setText("آیت: " + " " + Model.ZAKKAT_QURANIC_DETAIL[position].getZAKKAT_QURAN_REFERENCE_ARABIC());
                holder.binding.txtTwo.setText("ترجمہ: " + " " + Model.ZAKKAT_QURANIC_DETAIL[position].getZAKKAT_QURAN_REFERENCE_TRANSLATION_URDU());
                holder.binding.txtThree.setText("Transliteration: " + " " + Model.ZAKKAT_QURANIC_DETAIL[position].getZAKKAT_QURAN_REFERENCE_TRANSLITERATION());
                holder.binding.txtFourth.setText("Reference: " + " " + Model.ZAKKAT_QURANIC_DETAIL[position].getZAKKAT_QURAN_AYAH_REFERENCE());

                thirdView.setVisibility(View.GONE);
                holder.binding.txtFifth.setVisibility(View.GONE);


            } else if (CLICKED_POSITION == 1) {
                holder.binding.txtOne.setText("حدىث: " + " " + DataModel.ZAKKAT_HADITH_DETAIL[position].getZAKKAT_HADITH_REFERENCE_ARABIC());
                holder.binding.txtTwo.setText("ترجمہ: " + " " + DataModel.ZAKKAT_HADITH_DETAIL[position].getZAKKAT_HADITH_REFERENCE_TRANSLATION_URDU());
                holder.binding.txtThree.setText("Narrated By:" + " " + DataModel.ZAKKAT_HADITH_DETAIL[position].getZAKKAT_HADITH_NARRATED_BY());
                holder.binding.txtFourth.setText("Reference: " + " " + DataModel.ZAKKAT_HADITH_DETAIL[position].getZAKKAT_HADITH_REFERENCE());

                thirdView.setVisibility(View.GONE);
                holder.binding.txtFifth.setVisibility(View.GONE);

            } else if (CLICKED_POSITION == 2) {

                holder.binding.txtThree.setText(Model.ZAKKAT_ELIGIBLE_PEOPLE[position].getELIGIBLE_PEOPLE_URDU());
                holder.binding.txtFourth.setText("تفصیل: " + " " + Model.ZAKKAT_ELIGIBLE_PEOPLE[position].getDESCRIPTION_IN_URDU());

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    holder.binding.txtFourth.setTypeface(ResourcesCompat.getFont(mContext, R.font.jameel));
                    holder.binding.txtThree.setTypeface(ResourcesCompat.getFont(mContext, R.font.jameel));
                    holder.binding.txtFourth.setTextSize(TypedValue.COMPLEX_UNIT_PX, mContext.getResources().getDimension(_20sdp));
                    holder.binding.txtThree.setTextSize(TypedValue.COMPLEX_UNIT_PX, mContext.getResources().getDimension(R.dimen._22sdp));
                } else {
                    holder.binding.txtFourth.setTypeface(Typeface.MONOSPACE);
                    holder.binding.txtThree.setTypeface(Typeface.MONOSPACE);
                }

                holder.binding.txtOne.setVisibility(View.GONE);
                holder.binding.txtTwo.setVisibility(View.GONE);
                holder.binding.txtFifth.setVisibility(View.GONE);

                zeroView.setVisibility(View.GONE);
                firstView.setVisibility(View.GONE);
                thirdView.setVisibility(View.GONE);

            }
        } else if (LANGUAGE.equalsIgnoreCase("English")) {

            if (CLICKED_POSITION == 0) {
                holder.binding.txtOne.setText("آیت: " + " " + Model.ZAKKAT_QURANIC_DETAIL[position].getZAKKAT_QURAN_REFERENCE_ARABIC());
                holder.binding.txtThree.setText("Translation: " + " " + Model.ZAKKAT_QURANIC_DETAIL[position].getZAKKAT_QURAN_REFERENCE_TRANSLATION_ENGLISH());
                holder.binding.txtFourth.setText("Transliteration: " + " " + Model.ZAKKAT_QURANIC_DETAIL[position].getZAKKAT_QURAN_REFERENCE_TRANSLITERATION());
                holder.binding.txtFifth.setText("Reference: " + " " + Model.ZAKKAT_QURANIC_DETAIL[position].getZAKKAT_QURAN_AYAH_REFERENCE());

                holder.binding.txtThree.setTextColor(mContext.getResources().getColor(R.color.white));
                holder.binding.txtFourth.setTextColor(mContext.getResources().getColor(R.color.gold));
                holder.binding.txtFifth.setTextColor(mContext.getResources().getColor(R.color.white));

                firstView.setVisibility(View.GONE);
                holder.binding.txtTwo.setVisibility(View.GONE);


            } else if (CLICKED_POSITION == 1) {
                holder.binding.txtOne.setText("حدىث: " + " " + DataModel.ZAKKAT_HADITH_DETAIL[position].getZAKKAT_HADITH_REFERENCE_ARABIC());
                holder.binding.txtThree.setText("Translation: " + " " + DataModel.ZAKKAT_HADITH_DETAIL[position].getZAKKAT_HADITH_REFERENCE_TRANSLATION_ENGLISH());
                holder.binding.txtFourth.setText("Narrated By:" + " " + DataModel.ZAKKAT_HADITH_DETAIL[position].getZAKKAT_HADITH_NARRATED_BY());
                holder.binding.txtFifth.setText("Reference: " + " " + DataModel.ZAKKAT_HADITH_DETAIL[position].getZAKKAT_HADITH_REFERENCE());

                holder.binding.txtThree.setTextColor(mContext.getResources().getColor(R.color.white));
                holder.binding.txtFourth.setTextColor(mContext.getResources().getColor(R.color.gold));
                holder.binding.txtFifth.setTextColor(mContext.getResources().getColor(R.color.white));

                firstView.setVisibility(View.GONE);
                holder.binding.txtTwo.setVisibility(View.GONE);

            } else if (CLICKED_POSITION == 2) {

                holder.binding.txtThree.setText(Model.ZAKKAT_ELIGIBLE_PEOPLE[position].getELIGIBLE_PEOPLE_ENGLISH());
                holder.binding.txtFourth.setText("Detail: " + " " + Model.ZAKKAT_ELIGIBLE_PEOPLE[position].getDESCRIPTION_IN_ENGLISH());

                holder.binding.txtOne.setVisibility(View.GONE);
                holder.binding.txtTwo.setVisibility(View.GONE);
                holder.binding.txtFifth.setVisibility(View.GONE);

                zeroView.setVisibility(View.GONE);
                firstView.setVisibility(View.GONE);
                thirdView.setVisibility(View.GONE);

            }
        }


    }

    @Override
    public int getItemCount() {
        if (CLICKED_POSITION == 0) {
            return Model.ZAKKAT_QURANIC_DETAIL.length;
        } else if (CLICKED_POSITION == 1) {
            return DataModel.ZAKKAT_HADITH_DETAIL.length;
        } else if (CLICKED_POSITION == 2) {
            return Model.ZAKKAT_ELIGIBLE_PEOPLE.length;
        } else
            return 0;
    }

    public static class MyDateHolder extends RecyclerView.ViewHolder {
        protected ZakkatDteailLayoutItemViewBinding binding;

        public MyDateHolder(ZakkatDteailLayoutItemViewBinding viewBinding) {
            super(viewBinding.getRoot());
            this.binding = viewBinding;
        }
    }
}
