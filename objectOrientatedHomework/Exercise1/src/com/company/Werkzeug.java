package com.company;

public class Werkzeug {
    protected String bezeichnung;

    public Werkzeug(String bezeichnung) {
        this.bezeichnung=bezeichnung;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }
}
