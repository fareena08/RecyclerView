package com.example.myrecyclerview_a181617;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.myrecyclerview_a181617.adapter.MovieRecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);

        linearLayoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(linearLayoutManager);

        List<Movie> allMovieInfor = getAllMovieInfor();
        MovieRecyclerViewAdapter movieRecyclerViewAdapter = new MovieRecyclerViewAdapter(MainActivity.this, allMovieInfor);
        recyclerView.setAdapter(movieRecyclerViewAdapter);
    }

    private List<Movie> getAllMovieInfor()
    {
        List<Movie> allMovie = new ArrayList<Movie>();

        allMovie.add(new Movie("Action Movie", R.drawable.action_movie));
        allMovie.add(new Movie("Animated Movie", R.drawable.animated_movie));
        allMovie.add(new Movie("Comedy Movie", R.drawable.comedy_movie));
        allMovie.add(new Movie("Fantasy Movie", R.drawable.fantasy_movie));
        allMovie.add(new Movie("Historical Movie", R.drawable.historical_movie));
        allMovie.add(new Movie("Horror Movie", R.drawable.horror_movie));
        allMovie.add(new Movie("Romance Movie", R.drawable.romance_movie));
        allMovie.add(new Movie("Thriller Movie", R.drawable.thriller_movie));

        return allMovie;
    }
}