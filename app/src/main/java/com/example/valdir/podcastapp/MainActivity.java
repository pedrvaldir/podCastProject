package com.example.valdir.podcastapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Defina o conteúdo da atividade para usar o arquivo de layout activity_main.xml
        setContentView(R.layout.activity_main);

        /*Encontre a Exibição que mostra cada categoria
        */
        Button buttonPlay =  findViewById(R.id.button_playing);
        ImageView imageSearch = findViewById(R.id.image_search);
        ImageView imageAlbums = findViewById(R.id.image_albums);
        ImageView imagePay = findViewById(R.id.image_payment);

        buttonPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, PlayingPodcastActivity.class);
                startActivity(i);
            }
        });

        imageSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, BuscaActivity.class);
                startActivity(i);
            }
        });

        imageAlbums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, AlbumsActivity.class);
                startActivity(i);
            }
        });

        imagePay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, PaymentActivity.class);
                startActivity(i);
            }
        });
    }
}