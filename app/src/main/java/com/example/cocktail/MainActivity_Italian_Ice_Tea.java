package com.example.cocktail;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity_Italian_Ice_Tea extends AppCompatActivity
{

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_italian_ice_tea);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle("Italian Ice Tea");
    }




}

