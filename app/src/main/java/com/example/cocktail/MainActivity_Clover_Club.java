package com.example.cocktail;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity_Clover_Club extends AppCompatActivity
{

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clover_club);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle("Clover Club");
    }




}

