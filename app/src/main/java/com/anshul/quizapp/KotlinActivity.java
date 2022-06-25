package com.anshul.quizapp;


import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;

import androidx.appcompat.app.AppCompatActivity;

import com.anshul.quizapp.databinding.ActivityKotlinBinding;

public class KotlinActivity extends AppCompatActivity {

    ActivityKotlinBinding binding;

    int final_score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityKotlinBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().setTitle("Kotlin");

        ScrollView view = findViewById(R.id.scroll_view);
        view.setDescendantFocusability(ViewGroup.FOCUS_BEFORE_DESCENDANTS);
        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
        view.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                v.requestFocusFromTouch();
                return false;
            }
        });
        binding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (binding.question1Choice2.isChecked())
                    final_score++;
                if (binding.question2Choice1.isChecked())
                    final_score++;
                if (binding.question3Choice4.isChecked())
                    final_score++;
                if (binding.question4Answer.getText().toString().toLowerCase().equals("true"))
                    final_score++;
                if (binding.question5Choice2.isChecked())
                    final_score++;
                if (binding.question6Answer.getText().toString().toLowerCase().equals("final"))
                    final_score++;
                if (binding.question7Choice4.isChecked())
                    final_score++;
                if (binding.question8Answer.getText().toString().toLowerCase().equals("false"))
                    final_score++;
                if (binding.question9Choice4.isChecked())
                    final_score++;
                if (binding.question10Choice3.isChecked())
                    final_score++;

                Intent intent = new Intent(KotlinActivity.this,ResultActivity.class);
                intent.putExtra("result",Integer.toString(final_score));
                intent.putExtra("topic","Kotlin");
                startActivity(intent);
            }
        });
    }
}