package com.example.cocktail;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity_Alabama extends AppCompatActivity
{

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alabama_slammer);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle("Alabama Slammer");
    }




}

