package com.company;

public class Segelflugzeug extends Flugzeug{

    public Segelflugzeug(String bezeichnung, int hoechstgeschwindigkeit) {
        super(bezeichnung, hoechstgeschwindigkeit);
    }

    @Override
    public String toString() {
            return this.getClass().getSimpleName() + " mit 200 Hoechstgeschwindigkeit";
    }
}
