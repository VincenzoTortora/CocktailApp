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
                Intent intent = new Intent(MainActivity.this,MainActivity_Aviation.class);
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


        Button blackRussian = (Button) findViewById(R.id.button_black_russian);
        blackRussian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Black_Russian.class);
                startActivity(intent);
            }
        });


        Button bloodyMary = (Button) findViewById(R.id.button_bloody_mary);
        bloodyMary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Bloody_Mary.class);
                startActivity(intent);
            }
        });


        Button boulevardier = (Button) findViewById(R.id.button_boulevarder);
        boulevardier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Boulevardier.class);
                startActivity(intent);
            }
        });


        Button bramble = (Button) findViewById(R.id.button_bramble);
        bramble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Bramble.class);
                startActivity(intent);
            }
        });


        Button brandyEggNog = (Button) findViewById(R.id.button_brandy_egg_nog);
        brandyEggNog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Brandy_Egg_Nog.class);
                startActivity(intent);
            }
        });


        Button bronx = (Button) findViewById(R.id.button_bronx);
        bronx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Bronx.class);
                startActivity(intent);
            }
        });


        Button bucksFizz = (Button) findViewById(R.id.button_bucks_fizz);
        bucksFizz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Bucks_Fizz.class);
                startActivity(intent);
            }
        });


        Button bullShot = (Button) findViewById(R.id.button_bull_shot);
        bullShot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Bull_Shot.class);
                startActivity(intent);
            }
        });


        Button caipirinha = (Button) findViewById(R.id.button_caipirinha);
        caipirinha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Caipirinha.class);
                startActivity(intent);
            }
        });


        Button caipirissima = (Button) findViewById(R.id.button_caipirissima);
        caipirissima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Caipirissima.class);
                startActivity(intent);
            }
        });


        Button caipirissimaNegrita = (Button) findViewById(R.id.button_caipirissima_negrita);
        caipirissimaNegrita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Caipirissima_Negrita.class);
                startActivity(intent);
            }
        });


        Button caipiroska = (Button) findViewById(R.id.button_caipiroska);
        caipiroska.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Caipiroska.class);
                startActivity(intent);
            }
        });


        Button campariOP = (Button) findViewById(R.id.button_campari_orange_passion);
        campariOP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Campari_Orange_passion.class);
                startActivity(intent);
            }
        });


        Button campariSpritz = (Button) findViewById(R.id.button_campari_spritz);
        campariSpritz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Campari_Spritz.class);
                startActivity(intent);
            }
        });


        Button casino = (Button) findViewById(R.id.button_casino);
        casino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Casino.class);
                startActivity(intent);
            }
        });


        Button champagneCocktail = (Button) findViewById(R.id.button_champagne_cocktail);
        champagneCocktail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Champagne_Cocktail.class);
                startActivity(intent);
            }
        });


        Button cloverClub = (Button) findViewById(R.id.button_clover_club);
        cloverClub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Clover_Club.class);
                startActivity(intent);
            }
        });


        Button cosmopolitan = (Button) findViewById(R.id.button_cosmopolitan);
        cosmopolitan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Cosmopolitan.class);
                startActivity(intent);
            }
        });


        Button cubaLibre = (Button) findViewById(R.id.button_cuba_libre);
        cubaLibre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Cuba_Libre.class);
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

*/
    }
}
