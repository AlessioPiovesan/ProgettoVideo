package it.polimi.ingsw;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Episode{
    DateTimeFormatter dayFormatter = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
    DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    String type;
    String res;
    Serie nameSerie;
    int s;
    int e;
    int dim;
    int w;
    int h;
    int diff;
    float mbs;
    LocalDateTime view;
    LocalDateTime len;
    LocalDateTime prime;
    Languages lang;
    Languages sub;
    ExtensionType exten;

    Episode ( ){
    }
}
