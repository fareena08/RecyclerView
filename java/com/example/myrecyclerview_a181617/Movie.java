package com.example.myrecyclerview_a181617;

public class Movie {
    String name; //movie genre
    int image;

    public Movie(String name, int image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {

        this.image = image;
    }
}
