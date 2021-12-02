package ru.netology;

public class Movie {
    private int id;
    private String movieName;
    private String genre;
    private String imgUrl;


    public Movie(int id, String movieName, String genre, String imgUrl) {
        this.id = id;
        this.movieName = movieName;
        this.genre = genre;
        this.imgUrl = imgUrl;
    }
}
