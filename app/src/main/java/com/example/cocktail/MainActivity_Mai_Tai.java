package com.example.cocktail;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity_Mai_Tai extends AppCompatActivity
{

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mai_tai);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle("Mai Tai");
    }




}

