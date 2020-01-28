package com.company;

public abstract class BibItem {
    private String bibid,titel;
    private Position position;
    private int veroeffentlichungsjahr;

    public BibItem(String bibid, String titel, Position position, int veroeffentlichungsjahr) {
        this.bibid = bibid;
        this.titel = titel;
        this.position = position;
        this.veroeffentlichungsjahr = veroeffentlichungsjahr;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public int getVeroeffentlichungsjahr() {
        return veroeffentlichungsjahr;
    }

    public void setVeroeffentlichungsjahr(int veroeffentlichungsjahr) {
        this.veroeffentlichungsjahr = veroeffentlichungsjahr;
    }
}
