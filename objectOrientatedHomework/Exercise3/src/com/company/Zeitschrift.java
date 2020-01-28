package com.company;

public class Zeitschrift extends BibItem {
    private Person herausgeber;
    private String reihe;

    public Zeitschrift(String bibid, String titel, Position position, int veroeffentlichungsjahr) {
        super(bibid, titel, position, veroeffentlichungsjahr);
    }

    public Person getHerausgeber() {
        return herausgeber;
    }

    public void setHerausgeber(Person herausgeber) {
        this.herausgeber = herausgeber;
    }

    public String getReihe() {
        return reihe;
    }

    public void setReihe(String reihe) {
        this.reihe = reihe;
    }

    @Override
    public String toString() {
        return this.herausgeber + " " + this.reihe;
    }
}
