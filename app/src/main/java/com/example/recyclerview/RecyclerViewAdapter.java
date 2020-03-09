package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {

    private List<ItemModel> itemModelList;
    private Context context;

    public RecyclerViewAdapter(List<ItemModel> itemModelList, Context context) {
        this.itemModelList = itemModelList;
        this.context = context;
    }




    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.simple,parent,false);
        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(layoutView);

        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {

        holder.bcsTitle.setText(itemModelList.get(position).getBcsTitle());
        holder.bcsSubTitle.setText(itemModelList.get(position).getBcsSubTitle());
        holder.bcsImageView.setImageResource(itemModelList.get(position).getBcsPhoto());



    }

    @Override
    public int getItemCount() {
        return itemModelList.size();
    }
}
