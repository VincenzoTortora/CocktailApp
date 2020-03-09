package com.example.cocktail;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity_Bacardi_Cocktail extends AppCompatActivity
{

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bacardi_cocktail);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle("Bacardi Cocktail");

    }




}

