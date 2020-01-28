package com.company;

import java.util.ArrayList;

public class Bibliothek implements Queryable {
    private String bezeichnung;
    private ArrayList<BibItem> Bibliothek = new ArrayList<BibItem>();

    public Bibliothek(String bezeichnung, ArrayList<BibItem> bibliothek) {
        this.bezeichnung = bezeichnung;
        Bibliothek = bibliothek;
    }

    public ArrayList<Buch> sucheBuchByYear(int param) {
        ArrayList<Buch> queryResult = new ArrayList<Buch>();
        for (int i = 0; i < this.Bibliothek.size(); i++) {
        if (this.Bibliothek.get(i) instanceof Buch) {
                if (this.Bibliothek.get(i).getVeroeffentlichungsjahr() == param) {
                    Buch queryElement = (Buch) this.Bibliothek.get(i);
                    queryResult.add(queryElement);
                }
            }
        }
        return queryResult;
    }

    public Buch sucheBuchByISBN(String ISBN) {
        for (int i=0;i< this.Bibliothek.size();i++) {
          Buch checkOne = (Buch) this.Bibliothek.get(i);
          if(checkOne.getIsbn().equals(ISBN)) {
              return checkOne;
          }
        }
        return null;
    }


    public ArrayList<BibItem> sucheBeitragByAuthor (String param1,String param2) {
        ArrayList<BibItem> queryResult = new ArrayList<BibItem>();
        ArrayList<BibItem> queryResult1 = new ArrayList<BibItem>();

        for(int i=0; i< this.Bibliothek.size();i++) {

            if (this.Bibliothek.get(i) instanceof Buch) {
                Buch buchAktuell = (Buch) this.Bibliothek.get(i);
                if(buchAktuell.getAutor().getVorname().equals(param1) && buchAktuell.getAutor().getNachname().equals(param2)) {
                    queryResult.add(buchAktuell);
                }
            }
            else if (this.Bibliothek.get(i) instanceof Zeitschrift) {
                Zeitschrift zeitschriftAktuell = (Zeitschrift) this.Bibliothek.get(i);
                if(zeitschriftAktuell.getHerausgeber().getVorname().equals(param1) && zeitschriftAktuell.getHerausgeber().getNachname().equals(param2)) {
                    queryResult.add(zeitschriftAktuell);
                }
            }
        }
        return queryResult;
    }

    @Override
    public ArrayList<BibItem> sucheBeitragVonBib(String Param) {
        return null;
    }


    public ArrayList<BibItem> getBibliothek() {
        return Bibliothek;
    }
}
