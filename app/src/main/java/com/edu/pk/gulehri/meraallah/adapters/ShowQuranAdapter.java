package com.edu.pk.gulehri.meraallah.adapters;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Build;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.edu.pk.gulehri.meraallah.R;
import com.edu.pk.gulehri.meraallah.databinding.QuranVerseShowerBinding;
import com.edu.pk.gulehri.meraallah.model.Arabic;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public class ShowQuranAdapter extends RecyclerView.Adapter<ShowQuranAdapter.QuranHolder> {

    private final String surahName;
    private final int surahNumber;
    private final ArrayList<Arabic> listArabic;
    private final ArrayList<String> listUrdu;
    private final ArrayList<String> listEnglish;
    private final Context mContext;


    public ShowQuranAdapter(Context mContext, String surahName, int surahNumber, ArrayList<Arabic> listArabic, ArrayList<String> listUrdu, ArrayList<String> listEnglish) {
        this.mContext = mContext;
        this.surahName = surahName;
        this.surahNumber = surahNumber;
        this.listArabic = listArabic;
        this.listUrdu = listUrdu;
        this.listEnglish = listEnglish;
    }

    @NonNull
    @Override
    public ShowQuranAdapter.QuranHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new QuranHolder(QuranVerseShowerBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull ShowQuranAdapter.QuranHolder holder, int position) {

        SharedPreferences sp = mContext.getApplicationContext().getSharedPreferences("QuranSetting", Context.MODE_PRIVATE);
        final boolean switchArabic = sp.getBoolean("switchArabic", false);
        final boolean checkArabic = sp.getBoolean("checkArabic", false);

        final boolean checkTranslation = sp.getBoolean("checkTranslation", false);
        final boolean switchTranslation = sp.getBoolean("switchTranslation", false);


        final boolean checkLang = sp.getBoolean("checkLang", false);
        final int radioId = sp.getInt("id", 0);

        final boolean checkSeekArabic = sp.getBoolean("checkSeekArabic", false);
        final boolean checkSeekTranslation = sp.getBoolean("checkSeekTranslation", false);

        final int seekArabic = sp.getInt("seekbarArabic", 0);
        final int seekTranslation = sp.getInt("seekbarTranslation", 0);


        if (radioId == R.id.radioUrdu || !checkLang || radioId == 0) {
            Typeface typeface = ResourcesCompat.getFont(mContext, R.font.jameel);
            holder.binding.tvTranslation.setTypeface(typeface);
            holder.binding.tvTranslation.setText(listUrdu.get(position));

            if (position == 0) {
                holder.binding.tvTasmia.setVisibility(View.VISIBLE);
                holder.binding.tvTasmiaTranslation.setVisibility(View.VISIBLE);
                holder.binding.tvTasmia.setText(R.string.bismiAllah);
                holder.binding.tvTasmiaTranslation.setText(R.string.tasmia_translation_urdu);
            } else {
                holder.binding.tvTasmia.setVisibility(View.GONE);
                holder.binding.tvTasmiaTranslation.setVisibility(View.GONE);
            }


        } else {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                Typeface typeface = ResourcesCompat.getFont(mContext, R.font.catamaran_medium);
                holder.binding.tvTranslation.setTypeface(typeface);
                holder.binding.tvTasmiaTranslation.setTypeface(typeface);
            } else {
                holder.binding.tvTranslation.setTypeface(Typeface.SERIF);
                holder.binding.tvTasmiaTranslation.setTypeface(Typeface.SERIF);
            }

            if (position == 0) {
                holder.binding.tvTasmia.setVisibility(View.VISIBLE);
                holder.binding.tvTasmiaTranslation.setVisibility(View.VISIBLE);
                holder.binding.tvTasmia.setText(R.string.bismiAllah);
                holder.binding.tvTasmiaTranslation.setText(R.string.tasmia_translation_english);
            } else {
                holder.binding.tvTasmia.setVisibility(View.GONE);
                holder.binding.tvTasmiaTranslation.setVisibility(View.GONE);
            }

            holder.binding.tvTranslation.setText(listEnglish.get(position));

        }


        if (switchArabic || !checkArabic) {
            holder.binding.tvAyah.setVisibility(View.VISIBLE);
        } else {
            holder.binding.tvAyah.setVisibility(View.GONE);
        }

        if (switchTranslation || !checkTranslation) {
            holder.binding.tvTranslation.setVisibility(View.VISIBLE);
        } else {
            holder.binding.tvTranslation.setVisibility(View.GONE);
        }


        if (!checkSeekArabic) {
            holder.binding.tvAyah.setTextSize(TypedValue.COMPLEX_UNIT_PX, 60);
            holder.binding.tvTasmia.setTextSize(TypedValue.COMPLEX_UNIT_PX, 60);
        } else {
            holder.binding.tvAyah.setTextSize(TypedValue.COMPLEX_UNIT_PX, seekArabic);
            holder.binding.tvTasmia.setTextSize(TypedValue.COMPLEX_UNIT_PX, seekArabic);

        }
        if (!checkSeekTranslation) {
            holder.binding.tvTranslation.setTextSize(TypedValue.COMPLEX_UNIT_PX, 50);
            holder.binding.tvTasmiaTranslation.setTextSize(TypedValue.COMPLEX_UNIT_PX, 50);
        } else {
            holder.binding.tvTranslation.setTextSize(TypedValue.COMPLEX_UNIT_PX, seekTranslation);
            holder.binding.tvTasmiaTranslation.setTextSize(TypedValue.COMPLEX_UNIT_PX, seekTranslation);
        }


        NumberFormat nf = NumberFormat.getInstance(Locale.forLanguageTag("AR"));
        holder.binding.tvSurah.setText(surahName);
        holder.binding.tvSurahNumber.setText("(" + (surahNumber + 1) + ":" + listArabic.get(position).getVerseNumber() + ")");
        holder.binding.tvAyah.setText(listArabic.get(position).getQuranArabic() + " " + "\u06DD" + nf.format(Integer.parseInt(listArabic.get(position).getVerseNumber())));

        holder.binding.btnCopySurah.setOnClickListener(v -> {
            ClipboardManager manager = (ClipboardManager) mContext.getSystemService(Context.CLIPBOARD_SERVICE);

            String verse = listArabic.get(position).getQuranArabic() + " \u06DD" + "\n\n" + holder.binding.tvTranslation.getText() + "\n\n" + "     " +
                    holder.binding.tvSurah.getText() + "| " + listArabic.get(position).getVerseNumber();

            ClipData clipData = ClipData.newPlainText("Quran Verse", verse);
            manager.setPrimaryClip(clipData);

            Toast.makeText(mContext, "Copied to Clipboard", Toast.LENGTH_SHORT).show();
        });

    }

    @Override
    public int getItemCount() {
        return listArabic.size();
    }

    public static class QuranHolder extends RecyclerView.ViewHolder {
        private final QuranVerseShowerBinding binding;

        public QuranHolder(@NonNull QuranVerseShowerBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }
    }
}
