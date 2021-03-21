package com.example.studyclub;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;


import com.google.android.material.navigation.NavigationView;

public class BaseActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
//    static final float END_SCALE = 0.7f;
    DrawerLayout drawerLayout;
    Toolbar toolbar;
    NavigationView navView;
    ActionBarDrawerToggle toggle;
//    LinearLayout contentView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);

        drawerLayout = findViewById(R.id.drawer_layout);
        toolbar = findViewById(R.id.toolbar);
        navView = findViewById(R.id.navView);
        setSupportActionBar(toolbar);


        toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, 0, 0 );
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationDrawer();

        toolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(drawerLayout.isDrawerVisible(GravityCompat.START))
                    drawerLayout.closeDrawer(GravityCompat.START);
                else drawerLayout.openDrawer(GravityCompat.START);
            }
        });

//        animateNavigationDrawer();
    }

//    private void animateNavigationDrawer() {
//        //Add any color or remove it to use the default one!
//        //To make it transparent use Color.Transparent in side setScrimColor();
//        //drawerLayout.setScrimColor(Color.TRANSPARENT);
//        drawerLayout.setScrimColor(getResources().getColor(R.color.orange));
//        drawerLayout.addDrawerListener(new DrawerLayout.SimpleDrawerListener() {
//            @Override
//            public void onDrawerSlide(View drawerView, float slideOffset) {
//
//                // Scale the View based on current slide offset
//                final float diffScaledOffset = slideOffset * (1 - END_SCALE);
//                final float offsetScale = 1 - diffScaledOffset;
//                contentView.setScaleX(offsetScale);
//                contentView.setScaleY(offsetScale);
//
//                // Translate the View, accounting for the scaled width
//                final float xOffset = drawerView.getWidth() * slideOffset;
//                final float xOffsetDiff = contentView.getWidth() * diffScaledOffset / 2;
//                final float xTranslation = xOffset - xOffsetDiff;
//                contentView.setTranslationX(xTranslation);
//            }
//        });
//
//    }


    //Navigation Drawer Functions

    private void navigationDrawer() {
        navView.bringToFront();
        navView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        if(drawerLayout.isDrawerVisible(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }else
            super.onBackPressed();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return true;
    }

}
