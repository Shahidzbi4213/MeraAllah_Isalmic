package com.edu.pk.gulehri.meraallah.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.edu.pk.gulehri.meraallah.R;
import com.edu.pk.gulehri.meraallah.model.Model;

import static android.graphics.text.LineBreaker.JUSTIFICATION_MODE_INTER_WORD;
import static android.util.TypedValue.COMPLEX_UNIT_PX;
import static android.view.View.GONE;

public class HajjDetailAdapter extends RecyclerView.Adapter<HajjDetailAdapter.MyHajjDetailHolder> {

    private static String SELECTED_LANGUAGE;
    private static int CLICKED_ITEM_POSITION;
    private Context mContext;

    public HajjDetailAdapter(int ITEM_POSITION, String LANGUAGE) {
        CLICKED_ITEM_POSITION = ITEM_POSITION;
        SELECTED_LANGUAGE = LANGUAGE;

    }

    @NonNull
    @Override
    public HajjDetailAdapter.MyHajjDetailHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        mContext = parent.getContext();
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ramadan_detail_bg, parent, false);
        return new MyHajjDetailHolder(view);
    }


    @SuppressLint({"DefaultLocale", "SetTextI18n", "InlinedApi"})
    @Override
    public void onBindViewHolder(@NonNull MyHajjDetailHolder holder, int position) {
        if (CLICKED_ITEM_POSITION == 0) {
            holder.duaTransliteration.setVisibility(GONE);
            holder.duaMeaning.setVisibility(GONE);
            holder.first.setVisibility(GONE);
            holder.second.setVisibility(GONE);
            holder.duaHeading.setVisibility(GONE);

            holder.dua.setTextColor(ContextCompat.getColor(mContext, R.color.gold));

            if (SELECTED_LANGUAGE.equals("Urdu")) {
                holder.dua.setText(Model.HAJJ_AQDAMAT[0].getHAJJ_PROCESS_URDU());

            } else if (SELECTED_LANGUAGE.equals("English")) {

                holder.dua.setTextSize(COMPLEX_UNIT_PX, mContext.getResources().getDimension(R.dimen._18sdp));
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    holder.dua.setTypeface(ResourcesCompat.getFont(mContext, R.font.dosis_medium));

                } else {
                    holder.dua.setTypeface(Typeface.SANS_SERIF);
                }

                holder.dua.setText(Model.HAJJ_AQDAMAT[0].getHAJJ_PROCESS_ENGLISH());
            }
        }
        if (CLICKED_ITEM_POSITION == 1) {
            holder.duaTransliteration.setVisibility(GONE);
            holder.duaMeaning.setVisibility(GONE);
            holder.first.setVisibility(GONE);
            holder.second.setVisibility(GONE);
            holder.duaHeading.setVisibility(GONE);

            holder.dua.setTextColor(ContextCompat.getColor(mContext, R.color.gold));

            if (SELECTED_LANGUAGE.equals("Urdu")) {
                holder.dua.setText(Model.HAJJ_AQDAMAT[1].getHAJJ_PROCESS_URDU());

            } else if (SELECTED_LANGUAGE.equals("English")) {

                holder.dua.setTextSize(COMPLEX_UNIT_PX, mContext.getResources().getDimension(R.dimen._18sdp));
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    holder.dua.setTypeface(ResourcesCompat.getFont(mContext, R.font.dosis_medium));

                } else {
                    holder.dua.setTypeface(Typeface.SANS_SERIF);
                }

                holder.dua.setText(Model.HAJJ_AQDAMAT[1].getHAJJ_PROCESS_ENGLISH());
            }
        }
        if (CLICKED_ITEM_POSITION == 2) {
            holder.duaTransliteration.setVisibility(GONE);
            holder.duaMeaning.setVisibility(GONE);
            holder.first.setVisibility(GONE);
            holder.second.setVisibility(GONE);
            holder.duaHeading.setVisibility(GONE);

            holder.dua.setTextColor(ContextCompat.getColor(mContext, R.color.gold));

            if (SELECTED_LANGUAGE.equals("Urdu")) {
                holder.dua.setText(Model.HAJJ_AQDAMAT[2].getHAJJ_PROCESS_URDU());

            } else if (SELECTED_LANGUAGE.equals("English")) {

                holder.dua.setTextSize(COMPLEX_UNIT_PX, mContext.getResources().getDimension(R.dimen._18sdp));
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    holder.dua.setTypeface(ResourcesCompat.getFont(mContext, R.font.dosis_medium));

                } else {
                    holder.dua.setTypeface(Typeface.SANS_SERIF);
                }

                holder.dua.setText(Model.HAJJ_AQDAMAT[2].getHAJJ_PROCESS_ENGLISH());
            }
        }
        if (CLICKED_ITEM_POSITION == 3) {
            holder.duaTransliteration.setVisibility(GONE);
            holder.duaMeaning.setVisibility(GONE);
            holder.first.setVisibility(GONE);
            holder.second.setVisibility(GONE);
            holder.duaHeading.setVisibility(GONE);

            holder.dua.setTextColor(ContextCompat.getColor(mContext, R.color.gold));

            if (SELECTED_LANGUAGE.equals("Urdu")) {
                holder.dua.setText(Model.HAJJ_AQDAMAT[3].getHAJJ_PROCESS_URDU());

            } else if (SELECTED_LANGUAGE.equals("English")) {

                holder.dua.setTextSize(COMPLEX_UNIT_PX, mContext.getResources().getDimension(R.dimen._18sdp));
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    holder.dua.setTypeface(ResourcesCompat.getFont(mContext, R.font.dosis_medium));

                } else {
                    holder.dua.setTypeface(Typeface.SANS_SERIF);
                }

                holder.dua.setText(Model.HAJJ_AQDAMAT[3].getHAJJ_PROCESS_ENGLISH());
            }
        }
        if (CLICKED_ITEM_POSITION == 4) {
            holder.duaTransliteration.setVisibility(GONE);
            holder.duaMeaning.setVisibility(GONE);
            holder.first.setVisibility(GONE);
            holder.second.setVisibility(GONE);
            holder.duaHeading.setVisibility(GONE);

            holder.dua.setTextColor(ContextCompat.getColor(mContext, R.color.gold));

            if (SELECTED_LANGUAGE.equals("Urdu")) {
                holder.dua.setText(Model.HAJJ_AQDAMAT[4].getHAJJ_PROCESS_URDU());

            } else if (SELECTED_LANGUAGE.equals("English")) {

                holder.dua.setTextSize(COMPLEX_UNIT_PX, mContext.getResources().getDimension(R.dimen._18sdp));
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    holder.dua.setTypeface(ResourcesCompat.getFont(mContext, R.font.dosis_medium));

                } else {
                    holder.dua.setTypeface(Typeface.SANS_SERIF);
                }

                holder.dua.setText(Model.HAJJ_AQDAMAT[4].getHAJJ_PROCESS_ENGLISH());
            }
        }
        if (CLICKED_ITEM_POSITION == 5) {
            holder.duaTransliteration.setVisibility(GONE);
            holder.duaMeaning.setVisibility(GONE);
            holder.first.setVisibility(GONE);
            holder.second.setVisibility(GONE);
            holder.duaHeading.setVisibility(GONE);

            holder.dua.setTextColor(ContextCompat.getColor(mContext, R.color.gold));

            if (SELECTED_LANGUAGE.equals("Urdu")) {
                holder.dua.setText(Model.HAJJ_AQDAMAT[5].getHAJJ_PROCESS_URDU());

            } else if (SELECTED_LANGUAGE.equals("English")) {

                holder.dua.setTextSize(COMPLEX_UNIT_PX, mContext.getResources().getDimension(R.dimen._18sdp));
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    holder.dua.setTypeface(ResourcesCompat.getFont(mContext, R.font.dosis_medium));

                } else {
                    holder.dua.setTypeface(Typeface.SANS_SERIF);
                }

                holder.dua.setText(Model.HAJJ_AQDAMAT[5].getHAJJ_PROCESS_ENGLISH());
            }
        }
        if (CLICKED_ITEM_POSITION == 6) {
            holder.duaTransliteration.setVisibility(GONE);
            holder.duaMeaning.setVisibility(GONE);
            holder.first.setVisibility(GONE);
            holder.second.setVisibility(GONE);
            holder.duaHeading.setVisibility(GONE);

            holder.dua.setTextColor(ContextCompat.getColor(mContext, R.color.gold));

            if (SELECTED_LANGUAGE.equals("Urdu")) {
                holder.dua.setText(Model.HAJJ_AQDAMAT[6].getHAJJ_PROCESS_URDU());

            } else if (SELECTED_LANGUAGE.equals("English")) {

                holder.dua.setTextSize(COMPLEX_UNIT_PX, mContext.getResources().getDimension(R.dimen._18sdp));
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    holder.dua.setTypeface(ResourcesCompat.getFont(mContext, R.font.dosis_medium));

                } else {
                    holder.dua.setTypeface(Typeface.SANS_SERIF);
                }

                holder.dua.setText(Model.HAJJ_AQDAMAT[6].getHAJJ_PROCESS_ENGLISH());
            }
        }
        if (CLICKED_ITEM_POSITION == 7) {
            holder.duaTransliteration.setVisibility(GONE);
            holder.duaMeaning.setVisibility(GONE);
            holder.first.setVisibility(GONE);
            holder.second.setVisibility(GONE);
            holder.duaHeading.setVisibility(GONE);

            holder.dua.setTextColor(ContextCompat.getColor(mContext, R.color.gold));

            if (SELECTED_LANGUAGE.equals("Urdu")) {
                holder.dua.setText(Model.HAJJ_AQDAMAT[7].getHAJJ_PROCESS_URDU());

            } else if (SELECTED_LANGUAGE.equals("English")) {

                holder.dua.setTextSize(COMPLEX_UNIT_PX, mContext.getResources().getDimension(R.dimen._18sdp));
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    holder.dua.setTypeface(ResourcesCompat.getFont(mContext, R.font.dosis_medium));

                } else {
                    holder.dua.setTypeface(Typeface.SANS_SERIF);
                }

                holder.dua.setText(Model.HAJJ_AQDAMAT[7].getHAJJ_PROCESS_ENGLISH());
            }
        }
        if (CLICKED_ITEM_POSITION == 8) {
            holder.duaTransliteration.setVisibility(GONE);
            holder.duaMeaning.setVisibility(GONE);
            holder.first.setVisibility(GONE);
            holder.second.setVisibility(GONE);
            holder.duaHeading.setVisibility(GONE);

            holder.dua.setTextColor(ContextCompat.getColor(mContext, R.color.gold));

            if (SELECTED_LANGUAGE.equals("Urdu")) {
                holder.dua.setText(Model.HAJJ_AQDAMAT[8].getHAJJ_PROCESS_URDU());

            } else if (SELECTED_LANGUAGE.equals("English")) {

                holder.dua.setTextSize(COMPLEX_UNIT_PX, mContext.getResources().getDimension(R.dimen._18sdp));
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    holder.dua.setTypeface(ResourcesCompat.getFont(mContext, R.font.dosis_medium));

                } else {
                    holder.dua.setTypeface(Typeface.SANS_SERIF);
                }

                holder.dua.setText(Model.HAJJ_AQDAMAT[8].getHAJJ_PROCESS_ENGLISH());
            }
        }
        if (CLICKED_ITEM_POSITION == 9) {
            holder.duaTransliteration.setVisibility(GONE);
            holder.duaMeaning.setVisibility(GONE);
            holder.first.setVisibility(GONE);
            holder.second.setVisibility(GONE);
            holder.duaHeading.setVisibility(GONE);

            holder.dua.setTextColor(ContextCompat.getColor(mContext, R.color.gold));

            if (SELECTED_LANGUAGE.equals("Urdu")) {
                holder.dua.setText(Model.HAJJ_AQDAMAT[9].getHAJJ_PROCESS_URDU());

            } else if (SELECTED_LANGUAGE.equals("English")) {

                holder.dua.setTextSize(COMPLEX_UNIT_PX, mContext.getResources().getDimension(R.dimen._18sdp));
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    holder.dua.setTypeface(ResourcesCompat.getFont(mContext, R.font.dosis_medium));

                } else {
                    holder.dua.setTypeface(Typeface.SANS_SERIF);
                }

                holder.dua.setText(Model.HAJJ_AQDAMAT[9].getHAJJ_PROCESS_ENGLISH());
            }
        }
        if (CLICKED_ITEM_POSITION == 10) {
            holder.duaTransliteration.setVisibility(GONE);
            holder.duaMeaning.setVisibility(GONE);
            holder.first.setVisibility(GONE);
            holder.second.setVisibility(GONE);
            holder.duaHeading.setVisibility(GONE);

            holder.dua.setTextColor(ContextCompat.getColor(mContext, R.color.gold));

            if (SELECTED_LANGUAGE.equals("Urdu")) {
                holder.dua.setText(Model.HAJJ_AQDAMAT[10].getHAJJ_PROCESS_URDU());

            } else if (SELECTED_LANGUAGE.equals("English")) {

                holder.dua.setTextSize(COMPLEX_UNIT_PX, mContext.getResources().getDimension(R.dimen._18sdp));
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    holder.dua.setTypeface(ResourcesCompat.getFont(mContext, R.font.dosis_medium));

                } else {
                    holder.dua.setTypeface(Typeface.SANS_SERIF);
                }

                holder.dua.setText(Model.HAJJ_AQDAMAT[10].getHAJJ_PROCESS_ENGLISH());
            }
        }
        if (CLICKED_ITEM_POSITION == 11) {
            holder.duaTransliteration.setVisibility(GONE);
            holder.duaMeaning.setVisibility(GONE);
            holder.first.setVisibility(GONE);
            holder.second.setVisibility(GONE);
            holder.duaHeading.setVisibility(GONE);

            holder.dua.setTextColor(ContextCompat.getColor(mContext, R.color.gold));

            if (SELECTED_LANGUAGE.equals("Urdu")) {
                holder.dua.setText(Model.HAJJ_AQDAMAT[11].getHAJJ_PROCESS_URDU());

            } else if (SELECTED_LANGUAGE.equals("English")) {

                holder.dua.setTextSize(COMPLEX_UNIT_PX, mContext.getResources().getDimension(R.dimen._18sdp));
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    holder.dua.setTypeface(ResourcesCompat.getFont(mContext, R.font.dosis_medium));

                } else {
                    holder.dua.setTypeface(Typeface.SANS_SERIF);
                }

                holder.dua.setText(Model.HAJJ_AQDAMAT[11].getHAJJ_PROCESS_ENGLISH());
            }
        }
        if (CLICKED_ITEM_POSITION == 12) {
            holder.duaHeading.setGravity(Gravity.CENTER);
            holder.duaTransliteration.setGravity(Gravity.START);

            holder.duaHeading.setTextColor(ContextCompat.getColor(mContext, R.color.white));
            holder.dua.setTextColor(ContextCompat.getColor(mContext, R.color.gold));
            holder.duaMeaning.setTextColor(ContextCompat.getColor(mContext, R.color.white));
            holder.duaTransliteration.setTextColor(ContextCompat.getColor(mContext, R.color.gold));
            holder.duaTransliteration.setTextSize(COMPLEX_UNIT_PX, mContext.getResources().getDimension(R.dimen._18sdp));
            holder.duaTransliteration.setLineSpacing(0, (float) 1.0);

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                holder.duaHeading.setJustificationMode(JUSTIFICATION_MODE_INTER_WORD);
            }

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                holder.duaTransliteration.setTypeface(ResourcesCompat.getFont(mContext, R.font.dosis_medium));

            } else {
                holder.duaTransliteration.setTypeface(Typeface.SANS_SERIF);
            }

            if (SELECTED_LANGUAGE.equals("Urdu")) {

                holder.duaHeading.setText(Model.HAJJ_SUPPLICATION[position].getDUA_URDU());
                holder.dua.setText("دعا:  " + Model.HAJJ_SUPPLICATION[position].getDUA());
                holder.duaMeaning.setText("ترجمہ: " + Model.HAJJ_SUPPLICATION[position].getDUA_MEANING_URDU());
                holder.duaTransliteration.setText("Transliteration: " + Model.HAJJ_SUPPLICATION[position].getDUA_REFERENCE());

            } else if (SELECTED_LANGUAGE.equals("English")) {
                holder.duaMeaning.setTextSize(COMPLEX_UNIT_PX, mContext.getResources().getDimension(R.dimen._18sdp));

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    holder.duaHeading.setTypeface(ResourcesCompat.getFont(mContext, R.font.dosis_medium));
                    holder.duaMeaning.setTypeface(ResourcesCompat.getFont(mContext, R.font.dosis_medium));

                } else {
                    holder.duaHeading.setTypeface(Typeface.SANS_SERIF);
                    holder.duaMeaning.setTypeface(Typeface.SANS_SERIF);
                }

                holder.duaHeading.setText(Model.HAJJ_SUPPLICATION[position].getDUA_ENGLISH());
                holder.dua.setText("دعا: " + Model.HAJJ_SUPPLICATION[position].getDUA());
                holder.duaMeaning.setText("Translation: " + Model.HAJJ_SUPPLICATION[position].getDUA_MEANING_ENGLISH());
                holder.duaTransliteration.setText("Transliteration:  " + Model.HAJJ_SUPPLICATION[position].getDUA_REFERENCE());
            }
        }
    }

    @Override
    public int getItemCount() {

        if (CLICKED_ITEM_POSITION == 12) {
            return Model.HAJJ_SUPPLICATION.length;
        } else return 1;

    }

    public static class MyHajjDetailHolder extends RecyclerView.ViewHolder {

        TextView duaHeading, dua, duaMeaning, duaTransliteration;
        View first, second;

        public MyHajjDetailHolder(@NonNull View itemView) {
            super(itemView);


            duaHeading = itemView.findViewById(R.id.ramdan_count);
            dua = itemView.findViewById(R.id.ramadan_reference_arabic);
            duaMeaning = itemView.findViewById(R.id.ramadan_refernce_lang);
            duaTransliteration = itemView.findViewById(R.id.ramadan_detail_reference);
            first = itemView.findViewById(R.id.first);
            second = itemView.findViewById(R.id.second);
        }

    }
}
