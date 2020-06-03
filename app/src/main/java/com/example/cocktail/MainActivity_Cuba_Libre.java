package com.example.cocktail;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity_Cuba_Libre extends AppCompatActivity
{

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuba_libre);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle("Cuba Libre");
    }




}

