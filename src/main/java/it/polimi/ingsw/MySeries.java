package it.polimi.ingsw;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class MySeries{
    private static MySeries instance = null;
    private static final LinkedList<Serie> seriesList = new LinkedList<>();

    private MySeries ( ){
    }

    public static MySeries getInstance ( ){
        if (instance == null) instance = new MySeries();
        return instance;
    }

    public List<Serie> search (String title){
        LinkedList<Serie> possibles = new LinkedList<>();
        for (Serie serie: seriesList)
            if (Objects.equals(serie.getTitle(), title)) possibles.add(serie);
        return possibles;
    }

    public void addSerie (String title){
        seriesList.add(new Serie(title));
    }
}
