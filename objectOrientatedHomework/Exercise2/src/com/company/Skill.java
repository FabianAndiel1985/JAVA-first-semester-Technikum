package com.company;

public class Skill {
    private String beschreibung;
    private String flugzeug;

    public Skill(String beschreibung, String flugzeug) {
        this.beschreibung=beschreibung;
        this.flugzeug=flugzeug;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public String getFlugzeug() {
        return flugzeug;
    }

}
