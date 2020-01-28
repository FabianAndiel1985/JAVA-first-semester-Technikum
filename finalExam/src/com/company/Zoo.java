package com.company;

import java.util.ArrayList;

public class Zoo implements Describable {
    private String name;
    private ArrayList<Enclosure> enclosures = new ArrayList<>();

    public Zoo(String name) {
        this.name = name;
    }

    @Override
    public String getDescription() {
        return "Name des Zoos" + this.getName() + "Anzahl Gehegen" + this.enclosures.size();
    }

    public Enclosure getEnclosureByIndex(int param) {
        return this.enclosures.get(param);
    }

    public Enclosure getEnclosureByName(String param) {
        for(int i=0;i<this.enclosures.size();i++) {
            if(this.enclosures.get(i).getName().equals(param)) {
                return this.enclosures.get(i);
            }
        }
        return null;
    }

    public void addEnclosure(Enclosure param) {
        this.enclosures.add(param);
    }

    public void removeEnclosureByIndex(int param) {
        this.enclosures.remove(param);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Enclosure> getEnclosures() {
        return this.enclosures;
    }
}
