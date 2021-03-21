package com.example.studyclub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

public class TimetablePage extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LayoutInflater inflater = LayoutInflater.from(this);
        View myview = inflater.inflate(R.layout.activity_timetable_page, null, false);
        drawerLayout.addView(myview, 1);
        getSupportActionBar().setTitle("Sabaq keste");
    }
}