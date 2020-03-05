package com.example.cocktail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_activity_main);

        Button alabama = (Button) findViewById(R.id.button_Alabama_Slammer);
        alabama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this,MainActivity_Alabama.class);
                startActivity(intent);
            }
        });


        Button alexander = (Button) findViewById(R.id.button_Alexander);
        alexander.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Alexander.class);
                startActivity(intent);
            }
        });

        Button americano = (Button) findViewById(R.id.button_Americano);
        americano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Americano.class);
                startActivity(intent);
            }
        });


        Button angelFace = (Button) findViewById(R.id.button_Angel_Face);
        angelFace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_AngelFace.class);
                startActivity(intent);
            }
        });

        Button angeloAzzurro = (Button) findViewById(R.id.button_Angelo_Azzurro);
        angeloAzzurro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_AngeloAzzurro.class);
                startActivity(intent);
            }
        });

        Button appleMartini = (Button) findViewById(R.id.button_Apple_Martini);
        appleMartini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_AppleMartini.class);
                startActivity(intent);
            }
        });

        Button aviation = (Button) findViewById(R.id.button_Aviaton);
        aviation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Aviaton.class);
                startActivity(intent);
            }
        });

        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button bacardi_cocktail = (Button) findViewById(R.id.button_Bacardi_Cocktail);
        bacardi_cocktail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Bacardi_Cocktail.class);
                startActivity(intent);
            }
        });


        Button barracuda = (Button) findViewById(R.id.button_Barracuda);
        barracuda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Barracuda.class);
                startActivity(intent);
            }
        });


        Button bellini = (Button) findViewById(R.id.button_Bellini);
        bellini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Bellini.class);
                startActivity(intent);
            }
        });


        Button between_the_sheets = (Button) findViewById(R.id.button_Between_The_Sheets);
        between_the_sheets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Between_The_Sheets.class);
                startActivity(intent);
            }
        });

/**
        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button b52 = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });

*/
    }
}
