package it.polimi.ingsw;

import java.util.List;

public class Serie{
    String title;

    public Serie (String title){
        this.title = title;
    }

    public static List<Serie> getByTitle (String title){
        return MySeries.getInstance().search(title);
    }

    public String getTitle ( ){
        return title;
    }
}
