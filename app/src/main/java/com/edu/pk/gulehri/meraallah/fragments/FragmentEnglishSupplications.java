package com.edu.pk.gulehri.meraallah.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.edu.pk.gulehri.meraallah.R;
import com.edu.pk.gulehri.meraallah.adapters.SupplicationAdapter;
import com.edu.pk.gulehri.meraallah.model.Model;
import com.edu.pk.gulehri.meraallah.ui.SupplicationActivity;

import java.util.ArrayList;
import java.util.Arrays;

public class FragmentEnglishSupplications extends Fragment {

    public static SupplicationAdapter supplicationAdapter;
    public static ArrayList<Model> dua;

    public FragmentEnglishSupplications() {
        // Required empty public constructor
    }

    public static void catchData(ArrayList<Model> list) {
        dua = list;
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_english_supplications, container, false);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Context mContext = view.getContext();
        RecyclerView mRecyclerView = view.findViewById(R.id.englishRecyclerViewSupplication);

        ArrayList<Model> dua = new ArrayList<>(Arrays.asList(Model.SUPPLICATIONS));
        supplicationAdapter = new SupplicationAdapter(view.getContext(), "English", dua);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(mContext));
        mRecyclerView.setAdapter(supplicationAdapter);
    }

}