package com.example.myrecyclerview_a181617;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MovieDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);

        Intent intent = getIntent();
        TextView tvName = findViewById(R.id.tv_movie_name_detail);
        tvName.setText(intent.getStringExtra("movieName"));
    }
}