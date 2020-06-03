package com.example.cocktail;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity_Monkey_Gland extends AppCompatActivity
{

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monkey_gland);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle("Monkey Gland");
    }




}

