package com.example.cocktail;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity_Bloody_Mary extends AppCompatActivity
{

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bloody_mary);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle("Bloody Mary");
    }




}

