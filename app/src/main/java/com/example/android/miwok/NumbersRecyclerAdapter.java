package com.example.android.miwok;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NumbersRecyclerAdapter extends RecyclerView.Adapter<NumbersRecyclerAdapter.ViewHolder> {
    private final Context context;
    private final LayoutInflater layoutInflater;
    private final List<String> numbers;

    public NumbersRecyclerAdapter(Context context, List<String> numbers) {
        this.context = context;
        layoutInflater = LayoutInflater.from(context);
        this.numbers = numbers;
    }

    @NonNull
    @Override
    public NumbersRecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = layoutInflater.inflate(R.layout.item_numbers_list, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull NumbersRecyclerAdapter.ViewHolder holder, int position) {
        holder.englishText.setText(numbers.get(position));
    }

    @Override
    public int getItemCount() {
        return numbers.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final TextView englishText;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            englishText = (TextView) itemView.findViewById(R.id.englishText);
        }
    }
}
