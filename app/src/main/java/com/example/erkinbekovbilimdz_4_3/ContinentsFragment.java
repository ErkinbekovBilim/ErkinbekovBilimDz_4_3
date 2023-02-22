package com.example.erkinbekovbilimdz_4_3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.erkinbekovbilimdz_4_3.databinding.ActivityMainBinding;
import com.example.erkinbekovbilimdz_4_3.databinding.FragmentContinentsBinding;

import java.util.ArrayList;

public class ContinentsFragment extends Fragment implements OnClick{

    private FragmentContinentsBinding binding;
    private ArrayList<Continent> continentsList;
    private ContinentsAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentContinentsBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        loadData();
        adapter = new ContinentsAdapter(continentsList, this);
        binding.rvContinents.setAdapter(adapter);
    }

    private void loadData() {
        continentsList = new ArrayList<>();
        continentsList.add(new Continent("Asia", "https://gisgeography.com/wp-content/uploads/2020/11/Asia-Map-Feature.jpg"));
        continentsList.add(new Continent("Africa", "https://gisgeography.com/wp-content/uploads/2020/11/Africa-Map-Feature.png"));
        continentsList.add(new Continent("Europe", "https://gisgeography.com/wp-content/uploads/2020/11/Europe-Map-Feature.jpg"));
        continentsList.add(new Continent("North America", "https://gisgeography.com/wp-content/uploads/2020/11/North-America-Map-Feature.png"));
        continentsList.add(new Continent("South America", "https://gisgeography.com/wp-content/uploads/2017/11/South-America-Map-Feature.png"));
    }

    @Override
    public void onClick(int position) {
        Bundle bundle = new Bundle();
        bundle.putInt("Country Key", position);
        CountryFragment countryFragment = new CountryFragment();
        countryFragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, countryFragment).addToBackStack(null).commit();
    }
}