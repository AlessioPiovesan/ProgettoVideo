package it.polimi.ingsw;

import java.util.ArrayList;
import java.util.List;

public class MyDatabase{
    private static MyDatabase instance = null;
    private final ArrayList<Episode> episodes;
    private final ArrayList<Movie> movies;

    private final ArrayList<Oav> oavs;

    private MyDatabase ( ){
        episodes = new ArrayList<>();
        movies = new ArrayList<>();
        oavs = new ArrayList<>();
    }

    public static MyDatabase getInstance ( ){
        if (instance == null) instance = new MyDatabase();
        return instance;
    }

    void addEpisode (Episode ep){
        episodes.add(ep);
    }

    void addMovie (Movie movie){
        movies.add(movie);
    }

    void addOav (Oav oav){
        oavs.add(oav);
    }

    public List<Episode> getEpisodes ( ){
        return episodes;
    }

    public List<Movie> getMovies ( ){
        return movies;
    }

    public List<Oav> getOavs ( ){
        return oavs;
    }
}
