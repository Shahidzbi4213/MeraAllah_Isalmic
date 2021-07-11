package com.edu.pk.gulehri.meraallah.fragments;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.text.format.DateFormat;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import java.util.Calendar;

public class FragmentTimePicker extends DialogFragment {

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        //getting Calender Instance to get Current Time
        Calendar calendar = Calendar.getInstance();
        //getting Current Hour
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        //getting Current Minute
        int minute = calendar.get(Calendar.MINUTE);

        return new TimePickerDialog(
                //Passing the activity which implement this dialog
                getActivity(),
                //Here we are passing the listener which is implement by our activity
                (TimePickerDialog.OnTimeSetListener) getActivity(),
                //Passing it current hour and minute so when dialog open its shows current time
                hour, minute,
                //This tell the device in which this dialog will open have 24 hour format of 12 hour
                DateFormat.is24HourFormat(getActivity()));

    }
}
