package com.example.cocktail;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity_Cosmopolitan extends AppCompatActivity
{

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cosmopolitan);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle("Cosmopolitan");
    }




}

