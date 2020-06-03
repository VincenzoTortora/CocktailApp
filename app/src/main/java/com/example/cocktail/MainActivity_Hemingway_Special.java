package com.example.cocktail;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity_Hemingway_Special extends AppCompatActivity
{

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hemingway_special);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle("Hemingway Special");
    }




}

