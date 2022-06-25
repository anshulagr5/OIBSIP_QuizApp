package com.anshul.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ScrollView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.anshul.quizapp.databinding.ActivityPythonBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class PythonActivity extends AppCompatActivity {

    ActivityPythonBinding binding;

    int final_score = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityPythonBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().setTitle("Python");

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
                if (binding.question1Choice4.isChecked()) final_score++;
                if (binding.question2Choice2.isChecked())
                    final_score++;
                if (binding.question3Choice4.isChecked())
                    final_score++;
                if (binding.question4Answer.getText().toString().toLowerCase().equals("c"))
                    final_score++;
                if (binding.question5Choice1.isChecked())
                    final_score++;
                if (binding.question6Answer.getText().toString().toLowerCase().trim().equals("indentation"))
                    final_score++;
                if (binding.question7Choice3.isChecked())
                    final_score++;
                if (binding.question8Answer.getText().toString().toLowerCase().equals("5"))
                    final_score++;
                if (binding.question9Choice2.isChecked())
                    final_score++;
                if (binding.question10Choice2.isChecked())
                    final_score++;

                Intent intent = new Intent(PythonActivity.this,ResultActivity.class);
                intent.putExtra("result",Integer.toString(final_score));
                intent.putExtra("topic","Python");
                startActivity(intent);
            }
        });
    }
}