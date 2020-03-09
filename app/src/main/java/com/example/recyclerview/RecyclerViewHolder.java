package com.example.recyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewHolder extends RecyclerView.ViewHolder {

    TextView bcsTitle;
    TextView bcsSubTitle;
    ImageView bcsImageView;

    public RecyclerViewHolder(@NonNull View itemView) {
        super(itemView);

        bcsTitle = itemView.findViewById(R.id.bcsTitle);
        bcsSubTitle = itemView.findViewById(R.id.bcsSubTitle);
        bcsImageView = itemView.findViewById(R.id.bcsCircleImage);

    }
}
