package com.company;

import java.util.ArrayList;

public class Enclosure implements Describable {
    private String name;
    private Position position;
    private ArrayList<Animal> animals = new ArrayList<>();

    public Enclosure(String name, Position position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public String getDescription() {
        return "Name des Geheges" + this.getName() + "Anzahl Tiere" + this.animals.size();
    }

    public Animal getAnimalByIndex(int param) {
        return this.animals.get(param);
    }

    public Animal getAnimalByName(String param) {
            for(int i=0;i<this.animals.size();i++) {
                if(this.animals.get(i).getName().equals(param)) {
                    return this.animals.get(i);
                }
            }
            return null;
    }

    public void addAnimal(Animal param) {
        this.animals.add(param);
    }

    public void removeAnimalByIndex(int param) {
        this.animals.remove(param);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public ArrayList<Animal> getAnimals() {
        return this.animals;
    }

}
