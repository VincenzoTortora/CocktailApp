package com.example.cocktail;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity_Yellow_Bird extends AppCompatActivity
{

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yellow_bird);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle("Yellow Bird");
    }




}

