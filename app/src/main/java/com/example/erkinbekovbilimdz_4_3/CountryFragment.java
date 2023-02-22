package com.example.erkinbekovbilimdz_4_3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.erkinbekovbilimdz_4_3.databinding.FragmentCountryBinding;

import java.util.ArrayList;

public class CountryFragment extends Fragment {
    private FragmentCountryBinding binding;
    private ArrayList<Country> countryList;
    private CountryAdapter adapter;

    private Integer position;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCountryBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        position = getArguments().getInt("Country Key");
        checkPosition(position);
        adapter = new CountryAdapter(countryList);
        binding.rvCountry.setAdapter(adapter);
    }

    private void checkPosition(Integer Position) {
        if (Position == 0){
            loadAsia();
        } else if (Position == 1) {
            loadAfrica();
        } else if (Position == 2) {
            loadEurope();
        } else if (Position == 3) {
            loadNorthAmerica();
        } else if (Position == 4) {
            loadSouthAmerica();
        }
    }

    private void loadSouthAmerica() {
        countryList = new ArrayList<>();
        countryList.add(new Country("Brazil", "https://upload.wikimedia.org/wikipedia/en/thumb/0/05/Flag_of_Brazil.svg/640px-Flag_of_Brazil.svg.png"));
        countryList.add(new Country("Argentina", "https://cdn.britannica.com/69/5869-004-7D75CD05/Flag-Argentina.jpg"));
        countryList.add(new Country("Colombia", "https://cdn.britannica.com/68/7668-004-08492AB7/Flag-Colombia.jpg"));
        countryList.add(new Country("Peru", "https://cdn.britannica.com/48/3448-004-33B5D198/Flag-Peru.jpg"));
        countryList.add(new Country("Chile", "https://cdn.britannica.com/85/7485-004-00B07230/Flag-Chile.jpg"));
        countryList.add(new Country("Ecuador", "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e8/Flag_of_Ecuador.svg/2000px-Flag_of_Ecuador.svg.png"));
        countryList.add(new Country("Venezuela", "https://upload.wikimedia.org/wikipedia/commons/thumb/e/ef/Flag_of_Venezuela_%281930%E2%80%932006%29.svg/220px-Flag_of_Venezuela_%281930%E2%80%932006%29.svg.png"));
        countryList.add(new Country("Bolivia", "https://cdn.britannica.com/54/6754-004-AE3C4294/Flag-Bolivia.jpg"));
        countryList.add(new Country("Uruguay", "https://www.nationalflags.shop/WebRoot/vilkasfi01/Shops/2014080403/53E6/2F6A/5EBE/3F5A/0752/0A28/100B/04C1/Flag_of_Uruguay.png"));
        countryList.add(new Country("Guyana", "https://upload.wikimedia.org/wikipedia/commons/thumb/9/99/Flag_of_Guyana.svg/2560px-Flag_of_Guyana.svg.png"));
    }

    private void loadNorthAmerica() {
        countryList = new ArrayList<>();
        countryList.add(new Country("USA", "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/1200px-Flag_of_the_United_States.svg.png"));
        countryList.add(new Country("Canada", "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d9/Flag_of_Canada_%28Pantone%29.svg/250px-Flag_of_Canada_%28Pantone%29.svg.png"));
        countryList.add(new Country("Mexico", "https://www.flagistrany.ru/data/flags/ultra/mx.png"));
        countryList.add(new Country("Greenland", "https://upload.wikimedia.org/wikipedia/commons/thumb/0/09/Flag_of_Greenland.svg/320px-Flag_of_Greenland.svg.png"));
        countryList.add(new Country("Cuba", "https://upload.wikimedia.org/wikipedia/commons/thumb/b/bd/Flag_of_Cuba.svg/250px-Flag_of_Cuba.svg.png"));
        countryList.add(new Country("Panama", "https://upload.wikimedia.org/wikipedia/commons/thumb/a/ab/Flag_of_Panama.svg/250px-Flag_of_Panama.svg.png"));
        countryList.add(new Country("Jamaica", "https://upload.wikimedia.org/wikipedia/commons/thumb/0/0a/Flag_of_Jamaica.svg/250px-Flag_of_Jamaica.svg.png"));
        countryList.add(new Country("Costa Rica", "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f2/Flag_of_Costa_Rica.svg/250px-Flag_of_Costa_Rica.svg.png"));
        countryList.add(new Country("Guatemala", "https://upload.wikimedia.org/wikipedia/commons/thumb/e/ec/Flag_of_Guatemala.svg/1200px-Flag_of_Guatemala.svg.png"));
        countryList.add(new Country("Haiti", "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e5/Flag_of_Haiti_%28civil%29.svg/250px-Flag_of_Haiti_%28civil%29.svg.png"));
    }

    private void loadEurope() {
        countryList = new ArrayList<>();
        countryList.add(new Country("Germany", "https://upload.wikimedia.org/wikipedia/en/thumb/b/ba/Flag_of_Germany.svg/1200px-Flag_of_Germany.svg.png"));
        countryList.add(new Country("Great Britain", "https://cdn.britannica.com/25/4825-004-F1975B92/Flag-United-Kingdom.jpg"));
        countryList.add(new Country("Italy", "https://upload.wikimedia.org/wikipedia/en/thumb/0/03/Flag_of_Italy.svg/255px-Flag_of_Italy.svg.png"));
        countryList.add(new Country("France", "https://upload.wikimedia.org/wikipedia/en/thumb/c/c3/Flag_of_France.svg/800px-Flag_of_France.svg.png"));
        countryList.add(new Country("Ukraine", "https://upload.wikimedia.org/wikipedia/commons/thumb/4/49/Flag_of_Ukraine.svg/1200px-Flag_of_Ukraine.svg.png"));
        countryList.add(new Country("Netherlands", "https://upload.wikimedia.org/wikipedia/commons/thumb/2/20/Flag_of_the_Netherlands.svg/1200px-Flag_of_the_Netherlands.svg.png"));
        countryList.add(new Country("Switzerland", "https://cdn.britannica.com/43/4543-004-C0D5C6F4/Flag-Switzerland.jpg"));
        countryList.add(new Country("Greece", "https://cdn.britannica.com/49/1049-004-AE4BAD3E/Flag-Greece.jpg"));
        countryList.add(new Country("Poland", "https://upload.wikimedia.org/wikipedia/en/thumb/1/12/Flag_of_Poland.svg/1200px-Flag_of_Poland.svg.png"));
        countryList.add(new Country("Austria", "https://upload.wikimedia.org/wikipedia/commons/thumb/4/41/Flag_of_Austria.svg/255px-Flag_of_Austria.svg.png"));
    }

    private void loadAfrica() {
        countryList = new ArrayList<>();
        countryList.add(new Country("South Africa", "https://flagshub.com/images/flag-of-south-africa.png"));
        countryList.add(new Country("Nigeria", "https://upload.wikimedia.org/wikipedia/commons/7/79/Flag_of_Nigeria.svg"));
        countryList.add(new Country("Kenya", "https://pixnio.com/free-images/flags-of-the-world/flag-of-kenya.jpg"));
        countryList.add(new Country("Ghana", "https://upload.wikimedia.org/wikipedia/commons/thumb/1/19/Flag_of_Ghana.svg/1280px-Flag_of_Ghana.svg.png"));
        countryList.add(new Country("DR Congo", "https://upload.wikimedia.org/wikipedia/commons/thumb/6/6f/Flag_of_the_Democratic_Republic_of_the_Congo.svg/800px-Flag_of_the_Democratic_Republic_of_the_Congo.svg.png"));
        countryList.add(new Country("Morocco", "https://flagof.ru/wp-content/uploads/2018/10/Flag_of_Morocco_1slash6.svg_.png"));
        countryList.add(new Country("Tanzania", "https://upload.wikimedia.org/wikipedia/commons/thumb/3/38/Flag_of_Tanzania.svg/250px-Flag_of_Tanzania.svg.png"));
        countryList.add(new Country("mali", "https://cdn.britannica.com/62/5062-004-B45A3B5A/Flag-Mali.jpg"));
        countryList.add(new Country("Senegal", "https://www.flagistrany.ru/data/flags/ultra/sn.png"));
        countryList.add(new Country("Ethiopia", "https://upload.wikimedia.org/wikipedia/commons/thumb/7/71/Flag_of_Ethiopia.svg/800px-Flag_of_Ethiopia.svg.png"));
    }

    private void loadAsia() {
        countryList = new ArrayList<>();
        countryList.add(new Country("Kyrgyzstan", "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c7/Flag_of_Kyrgyzstan.svg/255px-Flag_of_Kyrgyzstan.svg.png"));
        countryList.add(new Country("kazakhstan", "https://upload.wikimedia.org/wikipedia/commons/thumb/2/2e/Flag_of_Kazakhstan_%283-2%29.svg/2560px-Flag_of_Kazakhstan_%283-2%29.svg.png"));
        countryList.add(new Country("Japan", "https://upload.wikimedia.org/wikipedia/en/thumb/9/9e/Flag_of_Japan.svg/1200px-Flag_of_Japan.svg.png"));
        countryList.add(new Country("China", "https://cdn.britannica.com/90/7490-004-BAD4AA72/Flag-China.jpg"));
        countryList.add(new Country("Indonesia", "https://cdn.britannica.com/48/1648-004-A33B72D8/Flag-Indonesia.jpg"));
        countryList.add(new Country("India", "https://upload.wikimedia.org/wikipedia/en/thumb/4/41/Flag_of_India.svg/1200px-Flag_of_India.svg.png"));
        countryList.add(new Country("South Korea", "https://upload.wikimedia.org/wikipedia/commons/thumb/0/09/Flag_of_South_Korea.svg/255px-Flag_of_South_Korea.svg.png"));
        countryList.add(new Country("Thailand", "https://cdn.britannica.com/38/4038-004-111388C2/Flag-Thailand.jpg"));
        countryList.add(new Country("Philippines", "https://cdn.britannica.com/73/3473-004-6E573BFA/Flag-Philippines.jpg"));
    }
}
