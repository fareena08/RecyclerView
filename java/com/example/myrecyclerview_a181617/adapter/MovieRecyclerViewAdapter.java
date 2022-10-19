package com.example.myrecyclerview_a181617.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.utils.widget.MockView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myrecyclerview_a181617.Movie;
import com.example.myrecyclerview_a181617.MovieDetailActivity;
import com.example.myrecyclerview_a181617.R;

import java.util.List;

public class MovieRecyclerViewAdapter extends RecyclerView.Adapter<MovieRecyclerViewAdapter.MovieViewHolder> {
    public List<Movie> movieList;
    private Context context;

    public MovieRecyclerViewAdapter(Context context, List<Movie> movieList) {

        this.context = context;
        this.movieList = movieList;
    }

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View movie_row = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_row, null);

        MovieViewHolder movieVH =new MovieViewHolder (movie_row);
        return movieVH;
    }

    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder holder, int position) {
        holder.tvMovieName.setText(movieList.get(position).getName());
        holder.imgViewMovieImage.setImageResource(movieList.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }

    public class MovieViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView tvMovieName;
        public ImageView imgViewMovieImage;

        public MovieViewHolder (View itemView) {
            super(itemView);
            tvMovieName = itemView.findViewById(R.id.tv_action);
            imgViewMovieImage = itemView.findViewById(R.id.img_action);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            Toast.makeText(view.getContext(), "Movie Genre " + movieList.get(getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(view.getContext(), MovieDetailActivity.class);
            intent.putExtra("movieName", movieList.get(getAdapterPosition()).getName());
            view.getContext().startActivity(intent);
        }
    }
}
