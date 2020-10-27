package ro.mta.facc.selab;

import java.util.ArrayList;
import java.util.Collections;

public class Biblioteca {
    private ArrayList<Carte> carti;

    public void sort()
    {
        Collections.sort(this.carti);
    }

    public Biblioteca(ArrayList<Carte> carti) {
        carti = new ArrayList<Carte>();
        for (Carte c : carti)
        {
            this.carti.add(c);
        }
    }

    public void add(Carte c){
        this.carti.add(c);
    }

    public Biblioteca() {
        carti = new ArrayList<Carte>();
    }

    @Override
    public String toString() {
        StringBuilder builder= new StringBuilder();
        builder.append("Biblioteca contine:\n");
        for(Carte c : carti)
        {
            builder.append(c.toString());
            builder.append("\n");
        }

        return builder.toString();
    }
}
