package com.company;

import java.util.ArrayList;

public class BibSystem implements BibQueryAble{
    public ArrayList<Bibliothek> bibliothekenverbund = new ArrayList<Bibliothek>();

    public BibSystem(ArrayList<Bibliothek> bibliothekenverbund) {
        this.bibliothekenverbund = bibliothekenverbund;
    }

    @Override
    public ArrayList<Bibliothek> sucheBib(String param) {
        return null;
    }

    @Override
    public ArrayList<BibItem> sucheBeitragByAuthor(String param, String Param) {
        return null;
    }

    @Override
    public ArrayList<BibItem> sucheBeitragVonBib(String Param) {
        return null;
    }

    @Override
    public ArrayList<Buch> sucheBuchByYear(int param) {
        ArrayList<Buch> queryResult = new ArrayList<Buch>();
        for (int i=0; i< this.bibliothekenverbund.size();i++) {
            Bibliothek aktuelleBib = this.bibliothekenverbund.get(i);
            queryResult.addAll(aktuelleBib.sucheBuchByYear(param));
        }
        return queryResult;
    }


    @Override
    public Buch sucheBuchByISBN(String param) {
        for (int i=0; i< this.bibliothekenverbund.size();i++) {
            Bibliothek aktuelleBib = this.bibliothekenverbund.get(i);
            if(aktuelleBib.sucheBuchByISBN(param).getIsbn().equals(param)) {
                return aktuelleBib.sucheBuchByISBN(param);
            }
        }
        return null;
    }


}
