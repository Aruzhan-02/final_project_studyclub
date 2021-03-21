package com.example.studyclub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

public class LessonFilesPage extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LayoutInflater inflater = LayoutInflater.from(this);
        View myview = inflater.inflate(R.layout.activity_lesson_files_page, null, false);
        drawerLayout.addView(myview, 2);
        getSupportActionBar().setTitle("Sabaq faildary");
    }
}