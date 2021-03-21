package com.example.studyclub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

public class TeachersPage extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LayoutInflater inflater = LayoutInflater.from(this);
        View myview = inflater.inflate(R.layout.activity_teachers_page, null, false);
        drawerLayout.addView(myview, 2);
        getSupportActionBar().setTitle("Mūğalіmder");
    }
}