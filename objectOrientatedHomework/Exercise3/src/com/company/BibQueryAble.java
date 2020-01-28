package com.company;

import java.util.ArrayList;

public interface BibQueryAble extends Queryable {
    public abstract ArrayList<Bibliothek> sucheBib(String param);
}
