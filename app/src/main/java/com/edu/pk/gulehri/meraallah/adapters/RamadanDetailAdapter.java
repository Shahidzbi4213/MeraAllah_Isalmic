package com.edu.pk.gulehri.meraallah.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

import com.edu.pk.gulehri.meraallah.R;
import com.edu.pk.gulehri.meraallah.model.Model;

import static android.graphics.text.LineBreaker.JUSTIFICATION_MODE_INTER_WORD;
import static android.graphics.text.LineBreaker.JUSTIFICATION_MODE_NONE;
import static android.os.Build.VERSION.SDK_INT;
import static android.os.Build.VERSION_CODES.O;
import static com.edu.pk.gulehri.meraallah.adapters.RamadanDetailAdapter.RamadanDetailHolder;

public class RamadanDetailAdapter extends RecyclerView.Adapter<RamadanDetailHolder> {

    private static String SELECTED_LANGUAGE;
    private static int CLICKED_ITEM_POSITION;
    private final Context context;

    public RamadanDetailAdapter(Context context, String lang, int pos) {
        this.context = context;
        SELECTED_LANGUAGE = lang;
        CLICKED_ITEM_POSITION = pos;
    }

    @NonNull
    @Override
    public RamadanDetailHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ramadan_detail_bg, parent, false);
        return new RamadanDetailHolder(view);
    }

    @SuppressLint({"SetTextI18n", "InlinedApi"})
    @Override
    public void onBindViewHolder(@NonNull RamadanDetailHolder holder, int position) {

        if (SDK_INT >= O) {
            holder.ramadan_reference_arabic.setJustificationMode(JUSTIFICATION_MODE_INTER_WORD);
            holder.ramadan_refernce_lang.setJustificationMode(JUSTIFICATION_MODE_INTER_WORD);
            holder.ramadan_detail_reference.setJustificationMode(JUSTIFICATION_MODE_INTER_WORD);
        }

        if (SELECTED_LANGUAGE.equals("Urdu") && CLICKED_ITEM_POSITION == 0) {
            holder.ramdan_count.setText("(" + (position + 1) + ")");
            holder.ramadan_reference_arabic.setText(Model.RAMADAN_QURANIC_DETAIL[position].getRAMADAN_QURAN_REFERENCE_ARABIC());
            holder.ramadan_refernce_lang.setText(Model.RAMADAN_QURANIC_DETAIL[position].getRAMADAN_QURAN_REFERENCE_TRANSLATION_URDU());
            holder.ramadan_detail_reference.setText(Model.RAMADAN_QURANIC_DETAIL[position].getRAMADAN_QURAN_AYAH_REFERENCE());

        } else if (SELECTED_LANGUAGE.equals("English") && CLICKED_ITEM_POSITION == 0) {

            holder.ramadan_refernce_lang.setTextSize(TypedValue.COMPLEX_UNIT_PX, context.getResources().getDimension(R.dimen._18sdp));
            if (SDK_INT >= O) {
                holder.ramadan_refernce_lang.setTypeface(ResourcesCompat.getFont(context, R.font.dosis_medium));
            } else {
                holder.ramadan_refernce_lang.setTypeface(Typeface.SANS_SERIF);
            }

            holder.ramdan_count.setText("(" + (position + 1) + ")");
            holder.ramadan_reference_arabic.setText(Model.RAMADAN_QURANIC_DETAIL[position].getRAMADAN_QURAN_REFERENCE_ARABIC());
            holder.ramadan_refernce_lang.setText(Model.RAMADAN_QURANIC_DETAIL[position].getRAMADAN_QURAN_REFERENCE_TRANSLATION_ENGLISH());
            holder.ramadan_detail_reference.setText(Model.RAMADAN_QURANIC_DETAIL[position].getRAMADAN_QURAN_AYAH_REFERENCE());
        }

        if (SELECTED_LANGUAGE.equals("Urdu") && CLICKED_ITEM_POSITION == 1) {
            holder.ramdan_count.setText("(" + (position + 1) + ")");
            holder.ramadan_reference_arabic.setText(Model.RAMADAN_HADITH_DETAIL[position].getRAMADAN_HADITH_REFERENCE_ARABIC());
            holder.ramadan_refernce_lang.setText(Model.RAMADAN_HADITH_DETAIL[position].getRAMADAN_HADITH_REFERENCE_TRANSLATION_URDU());
            holder.ramadan_detail_reference.setText(Model.RAMADAN_HADITH_DETAIL[position].getRAMADAN_HADITH_REFERENCE());
        } else if (SELECTED_LANGUAGE.equals("English") && CLICKED_ITEM_POSITION == 1) {
            holder.ramdan_count.setText("(" + (position + 1) + ")");
            holder.ramadan_refernce_lang.setTextSize(TypedValue.COMPLEX_UNIT_PX, context.getResources().getDimension(R.dimen._18sdp));
            if (SDK_INT >= O) {
                holder.ramadan_refernce_lang.setTypeface(ResourcesCompat.getFont(context, R.font.dosis_medium));
            } else {
                holder.ramadan_refernce_lang.setTypeface(Typeface.SANS_SERIF);
            }

            holder.ramadan_reference_arabic.setText(Model.RAMADAN_HADITH_DETAIL[position].getRAMADAN_HADITH_REFERENCE_ARABIC());
            holder.ramadan_refernce_lang.setText(Model.RAMADAN_HADITH_DETAIL[position].getRAMADAN_HADITH_REFERENCE_TRANSLATION_ENGLISH());
            holder.ramadan_detail_reference.setText(Model.RAMADAN_HADITH_DETAIL[position].getRAMADAN_HADITH_REFERENCE());
        }

        if (SELECTED_LANGUAGE.equals("Urdu") && CLICKED_ITEM_POSITION == 2) {

            holder.first.setVisibility(View.GONE);
            holder.second.setVisibility(View.GONE);
            holder.ramadan_detail_reference.setVisibility(View.GONE);
            holder.ramadan_refernce_lang.setVisibility(View.GONE);

            holder.ramdan_count.setText("(" + (position + 1) + ")");
            holder.ramadan_reference_arabic.setText(Model.FAST_KEEPING_PROCEDURE[position].getRAMADAN_HEADING_URDU());


        } else if (SELECTED_LANGUAGE.equals("English") && CLICKED_ITEM_POSITION == 2) {

            holder.first.setVisibility(View.GONE);
            holder.second.setVisibility(View.GONE);
            holder.ramadan_detail_reference.setVisibility(View.GONE);
            holder.ramadan_refernce_lang.setVisibility(View.GONE);

            holder.ramdan_count.setText("(" + (position + 1) + ")");
            holder.ramadan_reference_arabic.setTextSize(TypedValue.COMPLEX_UNIT_PX, context.getResources().getDimension(R.dimen._18sdp));

            if (SDK_INT >= O) {
                holder.ramadan_reference_arabic.setTypeface(ResourcesCompat.getFont(context, R.font.dosis_medium));
            } else {
                holder.ramadan_reference_arabic.setTypeface(Typeface.SANS_SERIF);
            }


            holder.ramadan_reference_arabic.setText(Model.FAST_KEEPING_PROCEDURE[position].getRAMADAN_HEADING_ENGLISH());
        }


        if (SELECTED_LANGUAGE.equals("Urdu") && CLICKED_ITEM_POSITION == 3) {
            holder.ramdan_count.setText(Model.RAMADAN_SUPPLICATION[position].getDUA_URDU());
            holder.ramadan_reference_arabic.setText(Model.RAMADAN_SUPPLICATION[position].getDUA());
            holder.ramadan_refernce_lang.setText(Model.RAMADAN_SUPPLICATION[position].getDUA_MEANING_URDU());
            holder.ramadan_detail_reference.setText(Model.RAMADAN_SUPPLICATION[position].getDUA_REFERENCE());

        } else if (SELECTED_LANGUAGE.equals("English") && CLICKED_ITEM_POSITION == 3) {

            holder.ramdan_count.setTextSize(TypedValue.COMPLEX_UNIT_PX, context.getResources().getDimension(R.dimen._20sdp));
            holder.ramadan_refernce_lang.setTextSize(TypedValue.COMPLEX_UNIT_PX, context.getResources().getDimension(R.dimen._18sdp));

            if (SDK_INT >= O) {
                holder.ramdan_count.setTypeface(ResourcesCompat.getFont(context, R.font.dosis_medium));
                holder.ramadan_refernce_lang.setTypeface(ResourcesCompat.getFont(context, R.font.dosis_medium));
            } else {
                holder.ramdan_count.setTypeface(Typeface.SANS_SERIF, Typeface.BOLD);
                holder.ramadan_refernce_lang.setTypeface(Typeface.SANS_SERIF);
            }


            holder.ramdan_count.setText(Model.RAMADAN_SUPPLICATION[position].getDUA_ENGLISH());
            holder.ramadan_reference_arabic.setText(Model.RAMADAN_SUPPLICATION[position].getDUA());
            holder.ramadan_refernce_lang.setText(Model.RAMADAN_SUPPLICATION[position].getDUA_MEANING_ENGLISH());
            holder.ramadan_detail_reference.setText(Model.RAMADAN_SUPPLICATION[position].getDUA_REFERENCE());
        }

        if (SELECTED_LANGUAGE.equals("Urdu") && CLICKED_ITEM_POSITION == 4) {
            holder.ramdan_count.setText("(" + (position + 1) + ")");
            holder.ramadan_reference_arabic.setText(Model.RAMADAN_TRAWEEH_VIRTUE[position].getRAMADAN_HADITH_REFERENCE_ARABIC());
            holder.ramadan_refernce_lang.setText(Model.RAMADAN_TRAWEEH_VIRTUE[position].getRAMADAN_HADITH_REFERENCE_TRANSLATION_URDU());
            holder.ramadan_detail_reference.setText(Model.RAMADAN_TRAWEEH_VIRTUE[position].getRAMADAN_HADITH_REFERENCE());

        } else if (SELECTED_LANGUAGE.equals("English") && CLICKED_ITEM_POSITION == 4) {
            holder.ramdan_count.setText("(" + (position + 1) + ")");
            holder.ramadan_detail_reference.setTextSize(TypedValue.COMPLEX_UNIT_PX, context.getResources().getDimension(R.dimen._18sdp));

            if (SDK_INT >= O) {
                holder.ramadan_detail_reference.setTypeface(ResourcesCompat.getFont(context, R.font.dosis_medium));
            } else {
                holder.ramadan_detail_reference.setTypeface(Typeface.SANS_SERIF);
            }


            holder.ramadan_reference_arabic.setText(Model.RAMADAN_TRAWEEH_VIRTUE[position].getRAMADAN_HADITH_REFERENCE_ARABIC());
            holder.ramadan_refernce_lang.setText(Model.RAMADAN_TRAWEEH_VIRTUE[position].getRAMADAN_HADITH_REFERENCE_TRANSLATION_ENGLISH());
            holder.ramadan_detail_reference.setText(Model.RAMADAN_TRAWEEH_VIRTUE[position].getRAMADAN_HADITH_REFERENCE());
        }


        if (SELECTED_LANGUAGE.equals("Urdu") && CLICKED_ITEM_POSITION == 5) {

            holder.ramdan_count.setVisibility(View.GONE);
            holder.ramadan_refernce_lang.setVisibility(View.GONE);
            holder.first.setVisibility(View.GONE);
            holder.ramadan_reference_arabic.setGravity(Gravity.CENTER);
            holder.ramadan_reference_arabic.setTextColor(Color.WHITE);
            holder.ramadan_detail_reference.setLineSpacing(0, (float) 1.5);


            if (SDK_INT >= O) {
                holder.ramadan_reference_arabic.setJustificationMode(JUSTIFICATION_MODE_NONE);
            }


            holder.ramadan_reference_arabic.setText(Model.RAMADAN_TRAWEEH_PROCEDURE[position].getRAMADAN_HADITH_REFERENCE_ARABIC());
            holder.ramadan_detail_reference.setText(Model.RAMADAN_TRAWEEH_PROCEDURE[position].getRAMADAN_HADITH_REFERENCE());

        } else if (SELECTED_LANGUAGE.equals("English") && CLICKED_ITEM_POSITION == 5) {

            holder.ramdan_count.setVisibility(View.GONE);
            holder.ramadan_reference_arabic.setGravity(Gravity.CENTER);
            holder.ramadan_detail_reference.setVisibility(View.GONE);
            holder.second.setVisibility(View.GONE);

            holder.ramadan_reference_arabic.setTextSize(TypedValue.COMPLEX_UNIT_PX, context.getResources().getDimension(R.dimen._20sdp));
            holder.ramadan_refernce_lang.setTextSize(TypedValue.COMPLEX_UNIT_PX, context.getResources().getDimension(R.dimen._18sdp));

            if (SDK_INT >= O) {
                holder.ramadan_reference_arabic.setJustificationMode(JUSTIFICATION_MODE_NONE);
                holder.ramadan_reference_arabic.setTypeface(ResourcesCompat.getFont(context, R.font.dosis_medium));
                holder.ramadan_refernce_lang.setTypeface(ResourcesCompat.getFont(context, R.font.dosis_medium));
            } else {
                holder.ramadan_reference_arabic.setTypeface(Typeface.SANS_SERIF, Typeface.BOLD);
                holder.ramadan_refernce_lang.setTypeface(Typeface.SANS_SERIF);
            }

            holder.ramadan_reference_arabic.setText(Model.RAMADAN_TRAWEEH_PROCEDURE[position].getRAMADAN_HADITH_REFERENCE_TRANSLATION_ENGLISH());
            holder.ramadan_refernce_lang.setText(Model.RAMADAN_TRAWEEH_PROCEDURE[position].getRAMADAN_HADITH_REFERENCE_TRANSLATION_URDU());
        }


    }

    @Override
    public int getItemCount() {

        if (CLICKED_ITEM_POSITION == 0) {
            return Model.RAMADAN_QURANIC_DETAIL.length;
        } else if (CLICKED_ITEM_POSITION == 1) {
            return Model.RAMADAN_HADITH_DETAIL.length;
        } else if (CLICKED_ITEM_POSITION == 2) {
            return Model.FAST_KEEPING_PROCEDURE.length;
        } else if (CLICKED_ITEM_POSITION == 3) {
            return Model.RAMADAN_SUPPLICATION.length;
        } else if (CLICKED_ITEM_POSITION == 4) {
            return Model.RAMADAN_TRAWEEH_VIRTUE.length;
        } else if (CLICKED_ITEM_POSITION == 5) {
            return Model.RAMADAN_TRAWEEH_PROCEDURE.length;
        } else return 0;

    }

    public static class RamadanDetailHolder extends ViewHolder {
        final TextView ramdan_count, ramadan_reference_arabic, ramadan_refernce_lang, ramadan_detail_reference;
        View first, second;

        public RamadanDetailHolder(@NonNull View itemView) {
            super(itemView);
            ramdan_count = itemView.findViewById(R.id.ramdan_count);
            ramadan_reference_arabic = itemView.findViewById(R.id.ramadan_reference_arabic);
            ramadan_refernce_lang = itemView.findViewById(R.id.ramadan_refernce_lang);
            ramadan_detail_reference = itemView.findViewById(R.id.ramadan_detail_reference);
            first = itemView.findViewById(R.id.first);
            second = itemView.findViewById(R.id.second);

        }
    }
}
