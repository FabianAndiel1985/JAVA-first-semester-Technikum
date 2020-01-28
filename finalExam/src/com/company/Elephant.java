package com.company;

public class Elephant extends Animal {
    public Elephant(String name, int age, float weight) {
        super(name, age, weight);
    }

    @Override
    String talk() {
        return "Töröh-Töröh-Töröh";
    }
}
