package com.example.voltify;

import java.util.Date;

public class Brano {
    private String titolo;
    private int durata;
    private String autore;
    private Date datacreazione;
    private String genere;

    public Brano (String titolo, int durata, String autore, Date datacreazione, String genere)
    {
        this.titolo=titolo;
        this.durata=durata;
        this.autore=autore;
        this.datacreazione=datacreazione;
        this.genere=genere;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }
    public String getTitolo() {
        return titolo;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }
    public String getAutore() {
        return autore;
    }

    public void setDatacreazione(Date datacreazione) {
        this.datacreazione = datacreazione;
    }
    public Date getDatacreazione() {
        return datacreazione;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }
    public int getDurata() {
        return durata;
    }

    public void setGenere(String genere){this.genere = genere;}
    public String getGenere(){return genere;}

    @Override
    public String toString() {
        return
                "titolo='" + titolo +
                ", durata=" + durata +
                ", autore='" + autore +
                ", datacreazione=" + datacreazione +
                ", genere=" + genere;
    }
}
