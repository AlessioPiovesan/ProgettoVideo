package it.polimi.ingsw;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

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

    public List<Object> search (String title){
        LinkedList<Object> response = new LinkedList<>();
        new Thread(( ) -> {
            for (Movie movie: movies){
                if (Objects.equals(movie.getTitle(), title)) response.add(movie);
            }
        });
        new Thread(( ) -> {
            for (Episode episode: episodes){
                if (Objects.equals(episode.getTitle(), title)) response.add(episode);
            }
        });
        new Thread(( ) -> {
            for (Oav oav: oavs){
                if (Objects.equals(oav.getTitle(), title)) response.add(oav);
            }
        });
        return response;
    }
}
