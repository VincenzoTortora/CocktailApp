package com.example.cocktail;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity_Bucks_Fizz extends AppCompatActivity
{

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bucks_fizz);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle("Buck's Fizz");
    }




}

