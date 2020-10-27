package ro.mta.facc.selab;

public class Carte implements Comparable<Carte>{
    private String titlu;
    private String autor;
    private int anPublicatie;

    @Override
    public int compareTo(Carte o) {
        if (this.nrPagini < o.nrPagini)
            return -1;
        if (this.nrPagini > o.nrPagini)
            return 1;

        return 0;
    }

    private int nrPagini;

    public Carte(String titlu, String autor, int anAparitie, int nrPagini) {
        this.titlu = titlu;
        this.autor = autor;
        this.anPublicatie = anAparitie;
        this.nrPagini = nrPagini;
    }


    @Override
    public String toString(){
        return this.titlu+"scrisa de " + this.autor+"a fost publicata in anul"+this.anPublicatie;
    }
}
