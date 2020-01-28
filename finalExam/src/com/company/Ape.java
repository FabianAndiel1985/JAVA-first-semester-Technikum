package com.company;

public class Ape extends Animal {

    public Ape(String name, int age, float weight) {
        super(name, age, weight);
    }

    @Override
    public String talk() {
        return "UgaAga-UgaAga";
    }
}
