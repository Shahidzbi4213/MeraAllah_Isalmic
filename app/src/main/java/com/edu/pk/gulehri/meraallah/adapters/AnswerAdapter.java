package com.edu.pk.gulehri.meraallah.adapters;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.edu.pk.gulehri.meraallah.databinding.ShowanswerBackgroundBinding;
import com.edu.pk.gulehri.meraallah.model.Question;

import java.util.List;

public class AnswerAdapter extends RecyclerView.Adapter<AnswerAdapter.MyAnswerHolder> {

    private ShowanswerBackgroundBinding binding;
    private final List<Question> questionList ;

    public AnswerAdapter(List<Question> questionList) {
        this.questionList = questionList;
    }

    @NonNull
    @Override
    public MyAnswerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = ShowanswerBackgroundBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new MyAnswerHolder(binding);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull MyAnswerHolder holder, int position) {
        holder.binding.answersCount.setText("(" + (position + 1) + ")");
        holder.binding.showQuestion.setText("Question: "+questionList.get(position).getQuestion());

        int answerId = questionList.get(position).getAnswer();

        if (answerId == 1) {
            holder.binding.answer.setText("Answer: "+questionList.get(position).getOption1());
        } else if (answerId == 2) {
            holder.binding.answer.setText("Answer: "+questionList.get(position).getOption2());
        } else if (answerId == 3) {
            holder.binding.answer.setText("Answer: "+questionList.get(position).getOption3());
        } else if (answerId == 4) {
            holder.binding.answer.setText("Answer: "+questionList.get(position).getOption4());
        }
    }

    @Override
    public int getItemCount() {
        return questionList.size();
    }

    public class MyAnswerHolder extends RecyclerView.ViewHolder {
        ShowanswerBackgroundBinding binding;

        public MyAnswerHolder(ShowanswerBackgroundBinding backgroundBinding) {
            super(backgroundBinding.getRoot());
            this.binding = backgroundBinding;
        }
    }
}
