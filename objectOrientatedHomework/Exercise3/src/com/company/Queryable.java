package com.company;

import java.util.ArrayList;

public interface Queryable {
    public abstract ArrayList<BibItem> sucheBeitragByAuthor(String param, String Param);
    public abstract ArrayList<BibItem> sucheBeitragVonBib(String Param);
    public abstract Buch  sucheBuchByISBN(String Param);
    public abstract ArrayList<Buch> sucheBuchByYear(int Param);

}
