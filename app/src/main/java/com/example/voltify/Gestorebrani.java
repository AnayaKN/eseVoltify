package com.example.voltify;

import java.util.ArrayList;

public class Gestorebrani {
    ArrayList<Brano> listaBrani;
    public Gestorebrani ()
    {
        listaBrani = new ArrayList<Brano>();
    }

    public void addBrano(String titolo, int durata)
    {
        Brano b= new Brano(titolo,durata);
        listaBrani.add(b);
    }

}