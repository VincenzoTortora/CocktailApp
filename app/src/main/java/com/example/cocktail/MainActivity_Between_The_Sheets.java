package com.example.cocktail;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity_Between_The_Sheets extends AppCompatActivity
{

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_between_the_sheets);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle("Between The Sheets");
    }




}

