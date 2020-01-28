package com.company;

import java.util.ArrayList;

public class Fluggesellschaft {
    private ArrayList<Flugzeug> flugzeuge= new ArrayList<>();
    private String name;

    public Fluggesellschaft(String name) {
        this.name=name;
    }

    public void addFlugzeuge(Flugzeug flugzeug)  {
        this.flugzeuge.add(flugzeug);
    }

    public Flugzeug getFlugzeug(int index) {
        return this.flugzeuge.get(index);
    }


}


