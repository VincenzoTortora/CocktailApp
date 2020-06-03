package com.example.cocktail;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


public class MainActivity_Perfect_Martini extends AppCompatActivity
{

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfect_martini);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle("Perfect Martini");
    }




}
