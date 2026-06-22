package com.example.cocktail;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity_Lemon_Drop_Martini extends AppCompatActivity
{

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lemon_drop_martini);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle("Lemon Drop Martini");
    }




}

