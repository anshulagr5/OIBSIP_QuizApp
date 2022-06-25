package com.anshul.quizapp;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.anshul.quizapp.databinding.ActivityPlayBinding;

public class PlayActivity extends AppCompatActivity {

    ActivityPlayBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityPlayBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bioIntent = new Intent(PlayActivity.this, JavaActivity.class);
                startActivity(bioIntent);
            }
        });

        binding.python.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phyIntent = new Intent(PlayActivity.this, PythonActivity.class);
                startActivity(phyIntent);
            }
        });

        binding.kotlin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chemIntent = new Intent(PlayActivity.this, KotlinActivity.class);
                startActivity(chemIntent);
            }
        });

    }
}