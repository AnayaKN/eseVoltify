package com.example.voltify;

import java.util.ArrayList;
import java.util.Date;

public class Gestorebrani {
    ArrayList<Brano> listaBrani;
    public Gestorebrani ()
    {
        listaBrani = new ArrayList<Brano>();
    }

    public void addBrano(String titolo, int durata, String autore, Date datacreazione, String genere)
    {
        Brano b= new Brano(titolo, durata,  autore, datacreazione, genere);
        listaBrani.add(b);
    }
    public String ListaBrani(){
        StringBuilder stbui= new StringBuilder();
        for(Brano Brv : listaBrani){
            stbui.append(Brv.toString());
            stbui.append(";");
        }
        stbui.deleteCharAt(-1);
        stbui.append(".");
        String s =stbui.toString();
        return s;
    }

}
