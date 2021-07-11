package com.edu.pk.gulehri.meraallah.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.edu.pk.gulehri.meraallah.R;
import com.edu.pk.gulehri.meraallah.model.Model;
import com.edu.pk.gulehri.meraallah.ui.TasbeehDetailActivity;

public class TasbeehAdapter extends RecyclerView.Adapter<TasbeehAdapter.MyTasbeehHolder> {

    public static final String TASBEEH_POSITION = "Position";
    private final Context mContext;
    

    public TasbeehAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public TasbeehAdapter.MyTasbeehHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.single_item_view, parent, false);
        return new MyTasbeehHolder(view);
    }

    @SuppressLint("DefaultLocale")
    @Override
    public void onBindViewHolder(@NonNull TasbeehAdapter.MyTasbeehHolder holder, int position) {

        holder.count.setText(String.format("(%d)", position + 1));
        holder.tasbeehDua.setText(Model.TASBEEHAT[position].getTASBEEH());

        holder.itemView.setOnClickListener(v -> {
            String TasbeehDua = holder.tasbeehDua.getText().toString();
            Intent intent = new Intent(mContext, TasbeehDetailActivity.class);
            intent.putExtra(TASBEEH_POSITION, position);
            mContext.startActivity(intent);

        });
    }

    @Override
    public int getItemCount() {
        return Model.TASBEEHAT.length;
    }

    static class MyTasbeehHolder extends RecyclerView.ViewHolder {
        private final TextView count, tasbeehDua;

        public MyTasbeehHolder(@NonNull View itemView) {
            super(itemView);
            count = itemView.findViewById(R.id.count);
            tasbeehDua = itemView.findViewById(R.id.heading);
        }
    }
}
