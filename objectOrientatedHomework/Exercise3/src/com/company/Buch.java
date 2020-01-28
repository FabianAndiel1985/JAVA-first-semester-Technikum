package com.company;

public class Buch extends BibItem {
    private Person autor;
    private String isbn;

    public Buch(String bibid, String titel, Position position, int veroeffentlichungsjahr) {
        super(bibid,titel,position,veroeffentlichungsjahr);
    }

    public Person getAutor() {
        return autor;
    }

    public void setAutor(Person autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return " ISBN: " + this.isbn + " Autor: " + this.autor;
    }

}
