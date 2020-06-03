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


        Button daiquiri = (Button) findViewById(R.id.button_daiquiri);
        daiquiri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Daiquiri.class);
                startActivity(intent);
            }
        });


        Button daiquiriUp = (Button) findViewById(R.id.button_daiquiri_up);
        daiquiriUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Daiquiri_Up.class);
                startActivity(intent);
            }
        });


        Button darknStormy = (Button) findViewById(R.id.button_darkn_storm);
        darknStormy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Darkn_Stormy.class);
                startActivity(intent);
            }
        });


        Button derby = (Button) findViewById(R.id.button_derby);
        derby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Derby.class);
                startActivity(intent);
            }
        });


        Button dirtyMartini = (Button) findViewById(R.id.button_dirty_martini);
        dirtyMartini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Dirty_Martini.class);
                startActivity(intent);
            }
        });


        Button dryMartini = (Button) findViewById(R.id.button_dry_martini);
        dryMartini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Dry_Martini.class);
                startActivity(intent);
            }
        });


        Button espressoMartini = (Button) findViewById(R.id.button_espresso_martini);
        espressoMartini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Espresso_Martini.class);
                startActivity(intent);
            }
        });


        Button florida = (Button) findViewById(R.id.button_florida);
        florida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Florida.class);
                startActivity(intent);
            }
        });


        Button french75 = (Button) findViewById(R.id.button_french75);
        french75.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_French75.class);
                startActivity(intent);
            }
        });


        Button frenchConn = (Button) findViewById(R.id.button_french_connection);
        frenchConn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_French_Connection.class);
                startActivity(intent);
            }
        });


        Button frenchMartini = (Button) findViewById(R.id.button_french_martini);
        frenchMartini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_French_Martini.class);
                startActivity(intent);
            }
        });


        Button frozenDaiquiri = (Button) findViewById(R.id.button_frozen_daiquiri);
        frozenDaiquiri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Frozen_Daiquiri.class);
                startActivity(intent);
            }
        });


        Button fruitFM = (Button) findViewById(R.id.button_fruit_frozen_margarita);
        fruitFM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Fruit_Frozen_Margarita.class);
                startActivity(intent);
            }
        });


        Button garibaldi = (Button) findViewById(R.id.button_garibaldi);
        garibaldi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Garibaldi.class);
                startActivity(intent);
            }
        });


        Button gibson = (Button) findViewById(R.id.button_gibson);
        gibson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Gibson.class);
                startActivity(intent);
            }
        });


        Button ginAF = (Button) findViewById(R.id.button_gin_and_french);
        ginAF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Gin_And_French.class);
                startActivity(intent);
            }
        });


        Button ginAI = (Button) findViewById(R.id.button_gin_and_it);
        ginAI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Gin_And_It.class);
                startActivity(intent);
            }
        });


        Button ginFizz = (Button) findViewById(R.id.button_gin_fizz);
        ginFizz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Gin_Fizz.class);
                startActivity(intent);
            }
        });


        Button godFather = (Button) findViewById(R.id.button_god_father);
        godFather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_God_Father.class);
                startActivity(intent);
            }
        });


        Button godMother = (Button) findViewById(R.id.button_god_mother);
        godMother.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_God_Mother.class);
                startActivity(intent);
            }
        });


        Button goldenCad = (Button) findViewById(R.id.button_golden_cadillac);
        goldenCad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Golden_Cadillac.class);
                startActivity(intent);
            }
        });


        Button goldenDream = (Button) findViewById(R.id.button_golden_dream);
        goldenDream.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Golden_Dream.class);
                startActivity(intent);
            }
        });


        Button grassHopper = (Button) findViewById(R.id.button_grasshopper);
        grassHopper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Grasshopper.class);
                startActivity(intent);
            }
        });


        Button harvey = (Button) findViewById(R.id.button_harvey_wallbanger);
        harvey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Harvey_Wallbanger.class);
                startActivity(intent);
            }
        });


        Button hemingway = (Button) findViewById(R.id.button_hemingway_special);
        hemingway.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Hemingway_Special.class);
                startActivity(intent);
            }
        });


        Button horses = (Button) findViewById(R.id.button_horses_neck);
        horses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Horses_Neck.class);
                startActivity(intent);
            }
        });


        Button hugo = (Button) findViewById(R.id.button_hugo);
        hugo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Hugo.class);
                startActivity(intent);
            }
        });


        Button irish = (Button) findViewById(R.id.button_irish_coffee);
        irish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Irish_Coffee.class);
                startActivity(intent);
            }
        });


        Button italianIT = (Button) findViewById(R.id.button_italian_ice_tea);
        italianIT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Italian_Ice_Tea.class);
                startActivity(intent);
            }
        });


        Button japIT = (Button) findViewById(R.id.button_japanese_ice_tea);
        japIT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Japanese_Ice_Tea.class);
                startActivity(intent);
            }
        });


        Button japSlipper = (Button) findViewById(R.id.button_japanese_slipper);
        japSlipper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Japanese_Slipper.class);
                startActivity(intent);
            }
        });


        Button johnCollins = (Button) findViewById(R.id.button_john_collins);
        johnCollins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_John_Collins.class);
                startActivity(intent);
            }
        });


        Button kamikaze = (Button) findViewById(R.id.button_kamikaze);
        kamikaze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Kamikaze.class);
                startActivity(intent);
            }
        });


        Button kir = (Button) findViewById(R.id.button_kir);
        kir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Kir.class);
                startActivity(intent);
            }
        });


        Button kirRoyal = (Button) findViewById(R.id.button_kir_royal);
        kirRoyal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Kir_Royal.class);
                startActivity(intent);
            }
        });


        Button lemonDM = (Button) findViewById(R.id.button_lemon_drop_martini);
        lemonDM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Lemon_Drop_Martini.class);
                startActivity(intent);
            }
        });


        Button londonIT = (Button) findViewById(R.id.button_london_ice_tea);
        londonIT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_London_Ice_tea.class);
                startActivity(intent);
            }
        });


        Button longIIT = (Button) findViewById(R.id.button_long_island_ice_tea);
        longIIT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Long_Island_Iced_Tea.class);
                startActivity(intent);
            }
        });


        Button maiTai = (Button) findViewById(R.id.button_mai_tai);
        maiTai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Mai_Tai.class);
                startActivity(intent);
            }
        });


        Button manhattan = (Button) findViewById(R.id.button_manhattan);
        manhattan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Manhattan.class);
                startActivity(intent);
            }
        });


        Button manhattanDry = (Button) findViewById(R.id.button_manhattan_dry);
        manhattanDry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Manhattan_Dry.class);
                startActivity(intent);
            }
        });


        Button manhattanMOP = (Button) findViewById(R.id.button_manhattan_medium_o_perfect);
        manhattanMOP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Manhattan_Medium_o_Perfect.class);
                startActivity(intent);
            }
        });


        Button margarita = (Button) findViewById(R.id.button_margarita);
        margarita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Margarita.class);
                startActivity(intent);
            }
        });


        Button martiniCocktail = (Button) findViewById(R.id.button_martini_cocktail);
        martiniCocktail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Martini_Cocktail.class);
                startActivity(intent);
            }
        });


        Button martiniRB = (Button) findViewById(R.id.button_martini_royal_bianco);
        martiniRB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Martini_Royal_Bianco.class);
                startActivity(intent);
            }
        });


        Button martiniRR = (Button) findViewById(R.id.button_martini_royal_rosato);
        martiniRR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Martini_Royal_Rosato.class);
                startActivity(intent);
            }
        });


        Button maryPickford = (Button) findViewById(R.id.button_mary_pickford);
        maryPickford.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Mary_Pickford.class);
                startActivity(intent);
            }
        });


        Button miamiIT = (Button) findViewById(R.id.button_miami_ice_tea);
        miamiIT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Miami_Ice_Tea.class);
                startActivity(intent);
            }
        });


        Button mimosa = (Button) findViewById(R.id.button_mimosa);
        mimosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Mimosa.class);
                startActivity(intent);
            }
        });


        Button mintJulep= (Button) findViewById(R.id.button_mint_julep);
        mintJulep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Mint_Julep.class);
                startActivity(intent);
            }
        });


        Button mojito = (Button) findViewById(R.id.button_mojito);
        mojito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Mojito.class);
                startActivity(intent);
            }
        });


        Button mojitoFidel = (Button) findViewById(R.id.button_mojito_fidel);
        mojitoFidel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Mojito_Fidel.class);
                startActivity(intent);
            }
        });


        Button monkeyGland = (Button) findViewById(R.id.button_monkey_gland);
        monkeyGland.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Monkey_Gland.class);
                startActivity(intent);
            }
        });


        Button moscowRule = (Button) findViewById(R.id.button_moscow_rule);
        moscowRule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Moscow_Mule.class);
                startActivity(intent);
            }
        });


        Button negroni = (Button) findViewById(R.id.button_negroni);
        negroni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Negroni.class);
                startActivity(intent);
            }
        });


        Button negrosky = (Button) findViewById(R.id.button_negrosky);
        negrosky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Negrosky.class);
                startActivity(intent);
            }
        });


        Button oldFashioned = (Button) findViewById(R.id.button_old_fashioned);
        oldFashioned.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Old_Fashioned.class);
                startActivity(intent);
            }
        });


        Button oldPal = (Button) findViewById(R.id.button_old_pal);
        oldPal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Old_Pal.class);
                startActivity(intent);
            }
        });


        Button orgasm = (Button) findViewById(R.id.button_orgasm);
        orgasm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Orgasm.class);
                startActivity(intent);
            }
        });


        Button paradise = (Button) findViewById(R.id.button_paradise);
        paradise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Paradise.class);
                startActivity(intent);
            }
        });


        Button perfectMartini = (Button) findViewById(R.id.button_perfect_martini);
        perfectMartini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Perfect_Martini.class);
                startActivity(intent);
            }
        });


        Button pinaColada = (Button) findViewById(R.id.button_pina_colada);
        pinaColada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Pina_Colada.class);
                startActivity(intent);
            }
        });


        Button piscoSour = (Button) findViewById(R.id.button_pisco_sour);
        piscoSour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Pisco_Sour.class);
                startActivity(intent);
            }
        });


        Button plantersPunch = (Button) findViewById(R.id.button_planters_punch);
        plantersPunch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Planters_Punch.class);
                startActivity(intent);
            }
        });


        Button portoFlip = (Button) findViewById(R.id.button_porto_flip);
        portoFlip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Porto_Flip.class);
                startActivity(intent);
            }
        });


        Button punchCubano = (Button) findViewById(R.id.button_punch_cubano);
        punchCubano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Punch_Cubano.class);
                startActivity(intent);
            }
        });


        Button ramosFizz = (Button) findViewById(R.id.button_ramos_fizz);
        ramosFizz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Ramos_Fizz.class);
                startActivity(intent);
            }
        });


        Button robRoy = (Button) findViewById(R.id.button_rob_roy);
        robRoy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Rob_Roy.class);
                startActivity(intent);
            }
        });


        Button rose = (Button) findViewById(R.id.button_rose);
        rose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Rose.class);
                startActivity(intent);
            }
        });


        Button rumCooler = (Button) findViewById(R.id.button_rum_cooler);
        rumCooler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Rum_Cooler.class);
                startActivity(intent);
            }
        });


        Button russianSP = (Button) findViewById(R.id.button_russian_spring_punch);
        russianSP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Russian_Spring_Punch.class);
                startActivity(intent);
            }
        });


        Button rustyNail = (Button) findViewById(R.id.button_rusty_nail);
        rustyNail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Rusty_Nail.class);
                startActivity(intent);
            }
        });


        Button saltyDog = (Button) findViewById(R.id.button_salty_dog);
        saltyDog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Salty_Dog.class);
                startActivity(intent);
            }
        });


        Button sazerac = (Button) findViewById(R.id.button_sazerac);
        sazerac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Sazerac.class);
                startActivity(intent);
            }
        });


        Button screwDriver = (Button) findViewById(R.id.button_screwdriver);
        screwDriver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Screwdriver.class);
                startActivity(intent);
            }
        });


        Button seaBreeze = (Button) findViewById(R.id.button_sea_breeze);
        seaBreeze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Sea_Breeze.class);
                startActivity(intent);
            }
        });


        Button sexOTB = (Button) findViewById(R.id.button_sex_on_the_beach);
        sexOTB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Sex_On_The_Beach.class);
                startActivity(intent);
            }
        });


        Button shirleyTemple = (Button) findViewById(R.id.button_shirley_temple);
        shirleyTemple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Shirley_Temple.class);
                startActivity(intent);
            }
        });


        Button singSling = (Button) findViewById(R.id.button_singapore_sling);
        singSling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Singapore_Sling.class);
                startActivity(intent);
            }
        });


        Button spritzVen = (Button) findViewById(R.id.button_spritz_veneziano);
        spritzVen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Spritz_Veneziano.class);
                startActivity(intent);
            }
        });


        Button stinger = (Button) findViewById(R.id.button_stinger);
        stinger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Stinger.class);
                startActivity(intent);
            }
        });


        Button sweetMartini = (Button) findViewById(R.id.button_sweet_martini);
        sweetMartini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Sweet_Martini.class);
                startActivity(intent);
            }
        });


        Button tequilaSunrise = (Button) findViewById(R.id.button_tequila_sunrise);
        tequilaSunrise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Tequila_Sunrise.class);
                startActivity(intent);
            }
        });


        Button tommys = (Button) findViewById(R.id.button_tommys_margarita);
        tommys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Tommys_Margarita.class);
                startActivity(intent);
            }
        });


        Button tuxedo = (Button) findViewById(R.id.button_tuxedo);
        tuxedo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Tuxedo.class);
                startActivity(intent);
            }
        });


        Button vampiro = (Button) findViewById(R.id.button_vampiro);
        vampiro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Vampiro.class);
                startActivity(intent);
            }
        });


        Button vesper = (Button) findViewById(R.id.button_vesper);
        vesper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Vesper.class);
                startActivity(intent);
            }
        });


        Button vodkaCooler = (Button) findViewById(R.id.button_vodka_cooler);
        vodkaCooler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Vodka_Cooler.class);
                startActivity(intent);
            }
        });


        Button vodkaMartini = (Button) findViewById(R.id.button_vodka_martini);
        vodkaMartini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Vodka_Martini.class);
                startActivity(intent);
            }
        });


        Button whiskeySour = (Button) findViewById(R.id.button_whiskey_sour);
        whiskeySour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Whiskey_Sour.class);
                startActivity(intent);
            }
        });


        Button whiteLady = (Button) findViewById(R.id.button_B52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_B52.class);
                startActivity(intent);
            }
        });


        Button whiteRussian = (Button) findViewById(R.id.button_white_russian);
        whiteRussian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_White_Russian.class);
                startActivity(intent);
            }
        });


        Button whiteSpider = (Button) findViewById(R.id.button_white_spider);
        whiteSpider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_White_Spider.class);
                startActivity(intent);
            }
        });


        Button yellowBird = (Button) findViewById(R.id.button_yellow_bird);
        yellowBird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Yellow_Bird.class);
                startActivity(intent);
            }
        });


    }
}
