package com.example.studyclub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class QuizSchedulePage extends BaseActivity implements View.OnClickListener{

    FloatingActionButton createQuiz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LayoutInflater inflater = LayoutInflater.from(this);
        View myview = inflater.inflate(R.layout.activity_quiz_schedule_page, null, false);
        drawerLayout.addView(myview, 2);
        getSupportActionBar().setTitle("Quiz uaqyty");
        createQuiz = findViewById(R.id.createQuiz);
    }

    @Override
    public void onClick(View view) {
       if (view == createQuiz){
           goToCreateQuizActivity();
       }
    }

    private void goToCreateQuizActivity() {
        Intent intent = new Intent(QuizSchedulePage.this, CreateQuiz.class);
        startActivity(intent);
    }
}