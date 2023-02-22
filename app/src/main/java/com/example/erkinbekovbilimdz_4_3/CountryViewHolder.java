package com.example.erkinbekovbilimdz_4_3;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import com.example.erkinbekovbilimdz_4_3.databinding.ItemCountryBinding;

public class CountryViewHolder extends RecyclerView.ViewHolder {

    private ItemCountryBinding binding;

    public CountryViewHolder(ItemCountryBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    void bind(Country Country){
        binding.tvCountry.setText(Country.getName());
        Glide.with(binding.imgFlag).load(Country.getFlag()).into(binding.imgFlag);
    }
}
