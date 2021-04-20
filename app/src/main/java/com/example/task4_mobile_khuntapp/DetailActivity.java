package com.example.task4_mobile_khuntapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private TextView tvTitle, tvGenre, tvTipe, tvSinopsis;
    private ImageView ivPoster, ivBanner;
    String title, sinopsis, genre, tipe;
    int poster;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        tvTitle = findViewById(R.id.tv_title);
        tvGenre = findViewById(R.id.tv_genre);
        tvTipe = findViewById(R.id.tv_tipe);
        tvSinopsis = findViewById(R.id.tv_sinopsis);
        ivPoster = findViewById(R.id.iv_poster);
        ivBanner = findViewById(R.id.iv_banner);

        title = getIntent().getStringExtra("title");
        sinopsis = getIntent().getStringExtra("sinopsis");
        poster = getIntent().getIntExtra("poster", 0);
        genre = getIntent().getStringExtra("genre");
        tipe = getIntent().getStringExtra("tipe");

        ivPoster.setImageResource(poster);
        ivBanner.setImageResource(poster);
        tvTitle.setText(title);
        tvGenre.setText(genre);
        tvTipe.setText(tipe);
        tvSinopsis.setText(sinopsis);
    }

    public void back(View view) {
        Intent i = new Intent(this, MainActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }
}