package com.example.erkinbekovbilimdz_4_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.erkinbekovbilimdz_4_3.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportFragmentManager().beginTransaction()
                .add(R.id.container, new ContinentsFragment()).commit();
    }
}