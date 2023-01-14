package ru.netology.PostManager.Ribbonposter.domain;

public class ProductManager {
    private Ribbonposter[] AllMovieTitles = new Ribbonposter[0];

    public void added(Ribbonposter movieTitle) {
        Ribbonposter[] tmp = new Ribbonposter[AllMovieTitles.length +1];
        for (int i = 0; i < AllMovieTitles.length; i++ ) {
            tmp[i] = AllMovieTitles[i];
        }
            tmp[tmp.length-1] = movieTitle;
            AllMovieTitles = tmp;
    }


    public void limit(Ribbonposter limitMovieTitle) {

        ///????
    }

     public Ribbonposter[] getAllMovieTitle() {
       return AllMovieTitles;

    }

}
