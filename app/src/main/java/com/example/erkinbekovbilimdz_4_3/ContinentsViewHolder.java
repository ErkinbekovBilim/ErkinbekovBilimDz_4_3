package com.example.erkinbekovbilimdz_4_3;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.erkinbekovbilimdz_4_3.databinding.ItemContinentsBinding;

public class ContinentsViewHolder extends RecyclerView.ViewHolder {

    private ItemContinentsBinding binding;

    public ContinentsViewHolder(ItemContinentsBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    void bind(Continent Continents){
        binding.tvContinents.setText(Continents.getName());
        Glide.with(binding.imgBackground).load(Continents.getBackground()).into(binding.imgBackground);
    }
}
