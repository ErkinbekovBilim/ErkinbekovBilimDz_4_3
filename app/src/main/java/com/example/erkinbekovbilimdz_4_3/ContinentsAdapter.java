package com.example.erkinbekovbilimdz_4_3;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import androidx.recyclerview.widget.RecyclerView;

import com.example.erkinbekovbilimdz_4_3.databinding.ItemContinentsBinding;

import java.util.ArrayList;

public class ContinentsAdapter extends RecyclerView.Adapter<ContinentsViewHolder> {

    private ArrayList<Continent> continentsList;
    private OnClick onItemClick;

    public ContinentsAdapter(ArrayList<Continent> continentsList, OnClick onItemClick) {
        this.continentsList = continentsList;
        this.onItemClick = onItemClick;
    }

    @NonNull
    @Override
    public ContinentsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContinentsViewHolder(ItemContinentsBinding
                .inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContinentsViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.bind(continentsList.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClick.onClick(position);

            }
        });
    }

    @Override
    public int getItemCount() {
        return continentsList.size();
    }
}
