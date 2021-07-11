package com.edu.pk.gulehri.meraallah.ui;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.res.ResourcesCompat;

import com.edu.pk.gulehri.meraallah.R;
import com.edu.pk.gulehri.meraallah.databinding.ActivityHijriCalenderBinding;
import com.github.eltohamy.materialhijricalendarview.CalendarDay;
import com.github.eltohamy.materialhijricalendarview.MaterialHijriCalendarView;
import com.github.eltohamy.materialhijricalendarview.OnDateSelectedListener;
import com.github.eltohamy.materialhijricalendarview.OnMonthChangedListener;
import com.github.msarhan.ummalqura.calendar.UmmalquraCalendar;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Objects;

public class HijriCalender extends AppCompatActivity implements OnDateSelectedListener,
        OnMonthChangedListener, OnClickListener {

    @SuppressLint(value = "SimpleDateFormat")
    private static final DateFormat FORMATTER = new SimpleDateFormat("d, MMMM,  y");
    String Year, Month, Date;
    private ActivityHijriCalenderBinding binding;
    private Calendar cal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHijriCalenderBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setToolBar();
        setCurrentDate();
        setListeners();
    }

    private void setListeners() {
        binding.calendarView.setOnDateChangedListener(this);
        binding.calendarView.setOnMonthChangedListener(this);
        binding.dateShowerLayout.setOnClickListener(this);
        binding.toolbarIncludeHijri.toolbarImageFirst.setOnClickListener(this);
    }

    private void setCurrentDate() {
        cal = new UmmalquraCalendar();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM y", Locale.ENGLISH);
        dateFormat.setCalendar(cal);
        binding.calendarView.setSelectedDate(cal.getTime());

        dateFormat.applyPattern("y");
        Year = dateFormat.format(cal.getTime());

        dateFormat.applyPattern("MMMM");
        Month = dateFormat.format(cal.getTime());

        dateFormat.applyPattern("dd");
        Date = dateFormat.format(cal.getTime());

        binding.dateHijriTxt.setText(Date);
        binding.monthHijriTxt.setText(Month);
        binding.yearHijriTxt.setText(Year);

    }

    private void setToolBar() {
        try {
            setSupportActionBar(binding.toolbarIncludeHijri.mToolbar);
            binding.toolbarIncludeHijri.mToolbar.setElevation(0);
            binding.toolbarIncludeHijri.toolbarImageFirst.setImageResource(R.drawable.ic_info);
            binding.toolbarIncludeHijri.toolbarImageFirst.setVisibility(View.VISIBLE);
            binding.toolbarIncludeHijri.toolbarImageSecond.setVisibility(View.GONE);
            binding.toolbarIncludeHijri.toolbarText.setText(R.string.hijri_calender);

            Toolbar.LayoutParams params = new Toolbar.LayoutParams(Toolbar.LayoutParams.WRAP_CONTENT, Toolbar.LayoutParams.WRAP_CONTENT);
            params.gravity = Gravity.CENTER;
            binding.toolbarIncludeHijri.toolbarText.setLayoutParams(params);
            Objects.requireNonNull(getSupportActionBar()).setDisplayShowTitleEnabled(false);
            final Drawable drawable = ResourcesCompat.getDrawable(getResources(), R.drawable.back_arrow, null);
            getSupportActionBar().setHomeAsUpIndicator(drawable);
            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        super.onOptionsItemSelected(item);

        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return true;
    }

    @Override
    public void onDateSelected(@NonNull MaterialHijriCalendarView widget, @NonNull CalendarDay date, boolean selected) {

        String[] selectedDatesString = getSelectedDatesString();
        binding.dateHijriTxt.setText(selectedDatesString[0]);
        binding.monthHijriTxt.setText(selectedDatesString[1]);
        binding.yearHijriTxt.setText(selectedDatesString[2]);

    }

    @Override
    public void onMonthChanged(MaterialHijriCalendarView widget, CalendarDay date) {

        FORMATTER.setCalendar(date.getCalendar());
        setCurrentDate();
    }

    private String[] getSelectedDatesString() {
        CalendarDay date = binding.calendarView.getSelectedDate();

        FORMATTER.setCalendar(date.getCalendar());

        String Month = date.getCalendar().getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault());
        int currentDate = date.getCalendar().get(Calendar.DAY_OF_MONTH);
        int year = date.getYear();

        return new String[]{String.valueOf(currentDate), Month, String.valueOf(year)};
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.dateShowerLayout) {
            setCurrentDate();
            binding.calendarView.setCurrentDate(cal.getTime());
        }
        else if (v.getId() == R.id.toolbarImageFirst){
            startActivity(new Intent(this,HijriCalenderInformation.class));
        }
    }
}