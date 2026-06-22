package com.example.cocktail;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity_Daiquiri_Up extends AppCompatActivity
{

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daiquiri_up);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle("Daiquiri Up");
    }




}

