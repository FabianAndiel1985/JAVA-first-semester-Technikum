package com.company;

public class Hand {
    Werkzeug ausrüstung;

    Hand() {

    }

    Hand(Werkzeug ausrüstung) {
        this.ausrüstung = ausrüstung;
    }

    public Werkzeug getAusrüstung() {
        return ausrüstung;
    }

    public void setAusrüstung(Werkzeug ausrüstung) {
        this.ausrüstung = ausrüstung;
    }
}
