package it.polimi.ingsw;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Episode{
    String title;
    DateTimeFormatter dayFormatter = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
    DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    String type;
    String res;
    String nameSerie;
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

    public Episode (DateTimeFormatter dayFormatter, DateTimeFormatter timeFormatter, String type, String res, String nameSerie, int s, int e, int dim, int w, int h, int diff, float mbs, LocalDateTime view, LocalDateTime len, LocalDateTime prime, Languages lang, Languages sub, ExtensionType exten){
        title = makeTitle(nameSerie, s, e);
        this.dayFormatter = dayFormatter;
        this.timeFormatter = timeFormatter;
        this.type = type;
        this.res = res;
        this.nameSerie = nameSerie;
        this.s = s;
        this.e = e;
        this.dim = dim;
        this.w = w;
        this.h = h;
        this.diff = diff;
        this.mbs = mbs;
        this.view = view;
        this.len = len;
        this.prime = prime;
        this.lang = lang;
        this.sub = sub;
        this.exten = exten;
    }

    private String makeTitle (String nameSerie, int s, int e){
        String name;
        if (e < 10)
            if (s < 10) name = nameSerie + " - s0" + s + "e00" + e;
            else name = nameSerie + " - s" + s + "e00" + e;
        else if (e < 100)
            if (s < 10) name = nameSerie + " - s0" + s + "e0" + e;
            else name = nameSerie + " - s" + s + "e0" + e;
        else if (s < 10) name = nameSerie + " - s0" + s + "e" + e;
        else name = nameSerie + " - s" + s + "e" + e;
        return name;
    }

    public String getTitle ( ){
        return title;
    }
}
