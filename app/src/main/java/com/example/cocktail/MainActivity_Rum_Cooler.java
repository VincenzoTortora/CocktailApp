package com.example.cocktail;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity_Rum_Cooler extends AppCompatActivity
{

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rum_cooler);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle("Rum Cooler");
    }




}

