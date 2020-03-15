package com.example.cocktail;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity_Rusty_Nail extends AppCompatActivity
{

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rusty_nail);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle("Rusty Nail");
    }




}

