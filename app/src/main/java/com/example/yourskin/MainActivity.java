package com.example.yourskin;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.navigation.NavigationView;

import admin.login;
import cleanser.cleanser;
import cream.cream;
import essence.essence;
import moisturizer.moisturizer;
import serum.serum;
import sunscreen.sunscreen;
import toner.toner;

public class MainActivity extends AppCompatActivity {
    private Button Bcleanser;
    private Button Btoner;
    private Button Bessence;
    private Button Bserum;
    private Button Bmoisturizer;
    private Button Bcream;
    private Button Bsunscreen;
    DrawerLayout drawerLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("");
        setSupportActionBar(toolbar);

        NavigationView navigationView = findViewById(R.id.nav_view);
        drawerLayout = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,
                drawerLayout,
                toolbar,
                R.string.nav_open,
                R.string.nav_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.category:
                        Intent i = new Intent(getApplicationContext(),MainActivity.class); startActivity(i);
                        break;
                    case R.id.match:
                        Intent j = new Intent(getApplicationContext(),match.class); startActivity(j);
                        break;
                    case R.id.admin:
                        Intent k = new Intent(getApplicationContext(), login.class); startActivity(k);
                        break;
                }
                drawerLayout.closeDrawer(GravityCompat.START);
                return true;
            }
        });


        Bcleanser = (Button) findViewById(R.id.buttoncleanser);
        Bcleanser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToCleanser();

            }
        });

        Btoner = (Button) findViewById(R.id.buttontoner);
        Btoner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToToner();

            }
        });

        Bessence = (Button) findViewById(R.id.butttonessence);
        Bessence.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToEssence();

            }
        });

        Bserum = (Button) findViewById(R.id.buttonserum);
        Bserum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToSerum();

            }
        });

        Bmoisturizer = (Button) findViewById(R.id.buttonmoisturizer);
        Bmoisturizer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToMoisturizer();

            }
        });

        Bcream = (Button) findViewById(R.id.buttoncream);
        Bcream.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToCream();

            }
        });

        Bsunscreen = (Button) findViewById(R.id.buttonsunscreen);
        Bsunscreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToSunscreen();

            }
        });
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        }else{
            super.onBackPressed();
        }
    }

    public void goToCleanser() {
        Intent intent = new Intent(this, cleanser.class);
        startActivity(intent);
    }
    public void goToToner() {
        Intent intent = new Intent(this, toner.class);
        startActivity(intent);
    }
    public void goToEssence() {
        Intent intent = new Intent(this, essence.class);
        startActivity(intent);
    }
    public void goToSerum() {
        Intent intent = new Intent(this, serum.class);
        startActivity(intent);
    }
    public void goToMoisturizer() {
        Intent intent = new Intent(this, moisturizer.class);
        startActivity(intent);
    }
    public void goToCream() {
        Intent intent = new Intent(this, cream.class);
        startActivity(intent);
    }
    public void goToSunscreen() {
        Intent intent = new Intent(this, sunscreen.class);
        startActivity(intent);
    }



}