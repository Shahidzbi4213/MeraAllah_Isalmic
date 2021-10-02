package com.edu.pk.gulehri.meraallah.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.edu.pk.gulehri.meraallah.R;
import com.edu.pk.gulehri.meraallah.databinding.ZakkatDteailLayoutItemViewBinding;
import com.edu.pk.gulehri.meraallah.model.DataModel;

public class JanazaDetailAdapter extends RecyclerView.Adapter<JanazaDetailAdapter.MyAdapterHolder> {

    private final int SELECTED_POSITION;
    private final String SELECT_LANGUAGE;
    private Context mContext;

    public JanazaDetailAdapter(int SELECTED_POSITION, String SELECT_LANGUAGE) {
        this.SELECTED_POSITION = SELECTED_POSITION;
        this.SELECT_LANGUAGE = SELECT_LANGUAGE;

    }

    @NonNull
    @Override
    public MyAdapterHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        mContext = parent.getContext();
        return new MyAdapterHolder(ZakkatDteailLayoutItemViewBinding.inflate(LayoutInflater.from(mContext),
                parent, false));
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull MyAdapterHolder holder, int position) {
        View zero = holder.binding.mmLayout.findViewById(R.id.zeroView);
        View one = holder.binding.mmLayout.findViewById(R.id.firstView);
        View two = holder.binding.mmLayout.findViewById(R.id.secondView);
        View three = holder.binding.mmLayout.findViewById(R.id.thirdView);

        if (SELECTED_POSITION == 0) {
            if (SELECT_LANGUAGE.equals("Urdu")) {
                holder.binding.txtOne.setText("طریقہ: " + " " +
                        DataModel.FUNERAL_PRAYER_PROCESS[position].getFUNERAL_PRAYER_PROCESS_IN_URDU());

                holder.binding.txtOne.setTextColor(ContextCompat.getColor(mContext, R.color.white));
                holder.binding.txtThree.setVisibility(View.GONE);
                holder.binding.txtTwo.setVisibility(View.GONE);
                holder.binding.txtFifth.setVisibility(View.GONE);
                holder.binding.txtFourth.setVisibility(View.GONE);
                zero.setVisibility(View.GONE);
                one.setVisibility(View.GONE);
                two.setVisibility(View.GONE);
                three.setVisibility(View.GONE);
            } else if (SELECT_LANGUAGE.equals("English")) {
                holder.binding.txtThree.setText("Process: " + " " +
                        DataModel.FUNERAL_PRAYER_PROCESS[position].getFUNERAL_PRAYER_PROCESS_IN_ENGLISH());

                holder.binding.txtThree.setTextColor(ContextCompat.getColor(mContext, R.color.white));
                holder.binding.txtOne.setVisibility(View.GONE);
                holder.binding.txtTwo.setVisibility(View.GONE);
                holder.binding.txtFifth.setVisibility(View.GONE);
                holder.binding.txtFourth.setVisibility(View.GONE);
                zero.setVisibility(View.GONE);
                one.setVisibility(View.GONE);
                two.setVisibility(View.GONE);
                three.setVisibility(View.GONE);

            }
        }
        if (SELECTED_POSITION == 1) {

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                holder.binding.txtTwo.setTypeface(ResourcesCompat.getFont(mContext, R.font.q_font));
            } else {
                holder.binding.txtTwo.setTypeface(Typeface.DEFAULT);
            }

            if (SELECT_LANGUAGE.equals("Urdu")) {
                holder.binding.txtOne.setText(DataModel.FUNERAL_PRAYER_DUA[position].getFUNERAL_DUA_HEADING_URDU());
                holder.binding.txtTwo.setText("دعا: " + " " + DataModel.FUNERAL_PRAYER_DUA[position].getFUNERAL_DUA());

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                    holder.binding.txtThree.setTypeface(ResourcesCompat.getFont(mContext, R.font.jameel));
                    holder.binding.txtThree.setTextSize(TypedValue.COMPLEX_UNIT_PX, mContext.getResources().getDimension(R.dimen._20sdp));
                } else {
                    holder.binding.txtThree.setTypeface(Typeface.MONOSPACE);
                    holder.binding.txtThree.setTextSize(TypedValue.COMPLEX_UNIT_PX, mContext.getResources().getDimension(R.dimen._19sdp));
                }
                holder.binding.txtThree.setText("ترجمہ: " + " " + DataModel.FUNERAL_PRAYER_DUA[position].getFUNERAL_DUA_MEANING_URDU());
                holder.binding.txtFourth.setText("Transliteration: " + " " + DataModel.FUNERAL_PRAYER_DUA[position].getFUNERAL_DUA_TRANSLITERATION());

            } else if (SELECT_LANGUAGE.equals("English")) {

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                    holder.binding.txtOne.setTypeface(ResourcesCompat.getFont(mContext, R.font.catamaran_medium));
                    holder.binding.txtOne.setTextSize(TypedValue.COMPLEX_UNIT_PX, mContext.getResources().getDimension(R.dimen._18sdp));
                } else {
                    holder.binding.txtOne.setTypeface(Typeface.SERIF);
                    holder.binding.txtOne.setTextSize(TypedValue.COMPLEX_UNIT_PX, mContext.getResources().getDimension(R.dimen._16sdp));
                }
                holder.binding.txtOne.setText(DataModel.FUNERAL_PRAYER_DUA[position].getFUNERAL_DUA_HEADING_ENGLISH());
                holder.binding.txtTwo.setText("دعا: " + " " + DataModel.FUNERAL_PRAYER_DUA[position].getFUNERAL_DUA());
                holder.binding.txtThree.setText("Translation: " + " " + DataModel.FUNERAL_PRAYER_DUA[position].getFUNERAL_DUA_MEANING_ENGLISH());
                holder.binding.txtFourth.setText("Transliteration: " + " " + DataModel.FUNERAL_PRAYER_DUA[position].getFUNERAL_DUA_TRANSLITERATION());

            }
            holder.binding.txtFifth.setVisibility(View.GONE);
            three.setVisibility(View.GONE);
        }
    }


    @Override
    public int getItemCount() {

        if (SELECTED_POSITION == 0) {
            return DataModel.FUNERAL_PRAYER_PROCESS.length;
        } else if (SELECTED_POSITION == 1) {
            return DataModel.FUNERAL_PRAYER_DUA.length;
        } else return 0;
    }

    public static class MyAdapterHolder extends RecyclerView.ViewHolder {
        protected ZakkatDteailLayoutItemViewBinding binding;

        public MyAdapterHolder(ZakkatDteailLayoutItemViewBinding viewBinding) {
            super(viewBinding.getRoot());
            binding = viewBinding;
        }
    }
}
