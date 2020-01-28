package com.company;

public class Motorflugzeug extends Flugzeug {

    private int anzahlMotoren;

    public Motorflugzeug(String bezeichnung, int hoechstgeschwindigkeit) {
        super(bezeichnung, hoechstgeschwindigkeit);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " 500 mit Hoechstgeschwindigkeit";
    }

    public int getAnzahlMotoren() {
        return anzahlMotoren;
    }

    public void setAnzahlMotoren(int anzahlMotoren) {
        this.anzahlMotoren = anzahlMotoren;
    }
}
