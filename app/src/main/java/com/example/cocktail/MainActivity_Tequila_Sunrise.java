package com.example.cocktail;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity_Tequila_Sunrise extends AppCompatActivity
{

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tequila_sunrise);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle("Tequila Sunrise");
    }




}

