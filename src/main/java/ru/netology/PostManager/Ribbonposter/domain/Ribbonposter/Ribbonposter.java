package ru.netology.PostManager.Ribbonposter.domain.Ribbonposter;

public class Ribbonposter {
    private String movieTitle;
    private int limitMovieTitle;

    public Ribbonposter (String movieTitle) {
        this.movieTitle = movieTitle;
        this.limitMovieTitle = limitMovieTitle;
    }
    public String getMovieTitle() {
        return movieTitle;
    }
}
