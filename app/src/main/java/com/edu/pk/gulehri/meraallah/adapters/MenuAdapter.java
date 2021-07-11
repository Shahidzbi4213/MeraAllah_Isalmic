package com.edu.pk.gulehri.meraallah.adapters;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.edu.pk.gulehri.meraallah.R;
import com.edu.pk.gulehri.meraallah.model.Model;
import com.edu.pk.gulehri.meraallah.ui.AblutionActivity;
import com.edu.pk.gulehri.meraallah.ui.AllahNamesActivity;
import com.edu.pk.gulehri.meraallah.ui.HadithOfDay;
import com.edu.pk.gulehri.meraallah.ui.HajjActivity;
import com.edu.pk.gulehri.meraallah.ui.HijriCalender;
import com.edu.pk.gulehri.meraallah.ui.JanazaActivity;
import com.edu.pk.gulehri.meraallah.ui.KalimasActivity;
import com.edu.pk.gulehri.meraallah.ui.NamazActivity;
import com.edu.pk.gulehri.meraallah.ui.NewBornActivity;
import com.edu.pk.gulehri.meraallah.ui.PrayerTime;
import com.edu.pk.gulehri.meraallah.ui.ProphetNamesActivity;
import com.edu.pk.gulehri.meraallah.ui.QaidaActivity;
import com.edu.pk.gulehri.meraallah.ui.QuizActivity;
import com.edu.pk.gulehri.meraallah.ui.QuranVerse;
import com.edu.pk.gulehri.meraallah.ui.RamadanActivity;
import com.edu.pk.gulehri.meraallah.ui.ShahadatActivity;
import com.edu.pk.gulehri.meraallah.ui.SilentPhoneActivity;
import com.edu.pk.gulehri.meraallah.ui.SupplicationActivity;
import com.edu.pk.gulehri.meraallah.ui.SurahNamesActivity;
import com.edu.pk.gulehri.meraallah.ui.TasbeehActivity;
import com.edu.pk.gulehri.meraallah.ui.VideoActivity;
import com.edu.pk.gulehri.meraallah.ui.ZakkatActivity;
import com.hassanjamil.hqibla.CompassActivity;
import com.hassanjamil.hqibla.Constants;

import java.util.List;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MyHolder> {

    public static final String MENU_NAME = "Main_Menu";
    public static String getName;
    private final Context mContext;
    private final List<Model> menuData;
    private Intent intent;


    public MenuAdapter(Context mContext, List<Model> menuList) {
        this.mContext = mContext;
        this.menuData = menuList;
    }

    @NonNull
    @Override
    public MenuAdapter.MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.menu_view, parent, false);
        return new MyHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MenuAdapter.MyHolder holder, int position) {
        holder.image.setImageResource(menuData.get(position).getIMAGE_ID());
        holder.name.setText(menuData.get(position).getMENU_NAME());

        SharedPreferences sp = mContext.getSharedPreferences(null, Context.MODE_PRIVATE);
        boolean quranFlag = sp.getBoolean(SurahNamesActivity.CHECK_FILE_DOWNLOAD, false);
        boolean qaidaFlag = sp.getBoolean(QaidaActivity.CHECK_IS_FILE_DOWNLOAD, false);


        if ((holder.name.getText().toString().equals("Al Quran")) && (!quranFlag)) {
            holder.button.setVisibility(View.VISIBLE);
        } else if ((holder.name.getText().toString().equals("Qaida")) && (!qaidaFlag)) {
            holder.button.setVisibility(View.VISIBLE);
        } else {
            holder.button.setVisibility(View.GONE);
        }


        holder.itemView.setOnClickListener(v -> {
            getName = holder.name.getText().toString();

            switch (getName) {
                case "Supplications":
                    intent = new Intent(mContext, SupplicationActivity.class);
                    break;
                case "Tasbeeh":
                    intent = new Intent(mContext, TasbeehActivity.class);
                    break;
                case "Salah":
                    intent = new Intent(mContext, NamazActivity.class);
                    break;
                case "Ablution":
                    intent = new Intent(mContext, AblutionActivity.class);
                    break;
                case "Fasting":
                    intent = new Intent(mContext, RamadanActivity.class);
                    break;
                case "Silent Phone":
                    intent = new Intent(mContext, SilentPhoneActivity.class);
                    break;
                case "Shahada":
                    intent = new Intent(mContext, ShahadatActivity.class);
                    break;
                case "Hajj":
                    intent = new Intent(mContext, HajjActivity.class);
                    break;

                case "Quiz":
                    intent = new Intent(mContext, QuizActivity.class);
                    break;
                case "Zakat":
                    intent = new Intent(mContext, ZakkatActivity.class);
                    break;
                case "Find Qibla":
                    intent = new Intent(mContext, CompassActivity.class);
                    intent.putExtra(Constants.TOOLBAR_TITLE, "Qibla Compass");        // Toolbar Title
                    intent.putExtra(Constants.TOOLBAR_BG_COLOR, "#231539");        // Toolbar Background color
                    intent.putExtra(Constants.TOOLBAR_TITLE_COLOR, "#FFFFFFFF");    // Toolbar Title color
                    intent.putExtra(Constants.COMPASS_BG_COLOR, "#130b20");        // Compass background color
                    intent.putExtra(Constants.ANGLE_TEXT_COLOR, "#FFD700");        // Angle Text color
                    intent.putExtra(Constants.DRAWABLE_DIAL, R.drawable.dial);    // Your dial drawable resource
                    intent.putExtra(Constants.DRAWABLE_QIBLA, R.drawable.qibla);    // Your qibla indicator drawable resource
                    intent.putExtra(Constants.FOOTER_IMAGE_VISIBLE, View.VISIBLE);    // Footer World Image visibility
                    intent.putExtra(Constants.LOCATION_TEXT_VISIBLE, View.VISIBLE); // Location Text visibility
                    break;

                case "Salah Times":
                    intent = new Intent(mContext, PrayerTime.class);
                    break;

                case "Quran Verse":
                    intent = new Intent(mContext, QuranVerse.class);
                    break;

                case "Today's Hadith":
                    intent = new Intent(mContext, HadithOfDay.class);
                    break;

                case "Hijri Calender":
                    intent = new Intent(mContext, HijriCalender.class);
                    break;

                case "Janaza":
                    intent = new Intent(mContext, JanazaActivity.class);
                    break;

                case "Six Kalimas":
                    intent = new Intent(mContext, KalimasActivity.class);
                    break;

                case "Qaida":
                    intent = new Intent(mContext, QaidaActivity.class);
                    break;

                case "Al Quran":
                    intent = new Intent(mContext, SurahNamesActivity.class);
                    break;

                case "Newborn Child":
                    intent = new Intent(mContext, NewBornActivity.class);
                    break;

                case "Asma Ul Rasool":
                    intent = new Intent(mContext, ProphetNamesActivity.class);
                    break;

                case "Asma Ul Husna":
                    intent = new Intent(mContext, AllahNamesActivity.class);
                    break;

                case "Islamic Videos":
                    intent = new Intent(mContext, VideoActivity.class);
                    break;

                default:
                    intent = new Intent(mContext, AllahNamesActivity.class);
                    intent.putExtra(MENU_NAME, getName);
                    break;
            }

            mContext.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return menuData.size();
    }

    static class MyHolder extends RecyclerView.ViewHolder {
        final ImageView image;
        final TextView name;
        final ImageButton button;

        public MyHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.image);
            name = itemView.findViewById(R.id.name);
            button = itemView.findViewById(R.id.downloadBtn);

        }
    }
}
