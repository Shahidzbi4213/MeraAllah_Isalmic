package com.edu.pk.gulehri.meraallah.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.edu.pk.gulehri.meraallah.R;
import com.edu.pk.gulehri.meraallah.databinding.VideoShowerBinding;
import com.edu.pk.gulehri.meraallah.model.Videos;
import com.edu.pk.gulehri.meraallah.ui.VideoPlayActivity;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class VideoAdapter extends FirebaseRecyclerAdapter<Videos, VideoAdapter.VideosHolder> {

    private final Context mContext;

    public VideoAdapter(@NonNull FirebaseRecyclerOptions<Videos> options, Context mContext) {
        super(options);
        this.mContext = mContext;
    }


    @Override
    protected void onBindViewHolder(@NonNull VideosHolder holder, int position, @NonNull Videos model) {

        String url = "https://img.youtube.com/vi/" + model.getUrl() + "/0.jpg";

        Glide.with(mContext).asBitmap().load(url).placeholder(R.drawable.film).into(holder.binding.videoThumb);


        holder.binding.videoName.setText(model.getTitle());

        holder.itemView.setOnClickListener(v -> {

            Intent intent = new Intent(mContext, VideoPlayActivity.class);
            intent.putExtra("title", model.getTitle());
            intent.putExtra("url", model.getUrl());
            mContext.startActivity(intent);

        });

    }

    @NonNull
    @Override
    public VideosHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new VideosHolder(VideoShowerBinding.inflate(LayoutInflater.from(mContext), parent, false));
    }

    public static class VideosHolder extends RecyclerView.ViewHolder {
        private final VideoShowerBinding binding;

        public VideosHolder(@NonNull VideoShowerBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }
    }
}
