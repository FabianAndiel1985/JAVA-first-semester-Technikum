package com.company;

public class Parrot extends Animal{
    public Parrot(String name, int age, float weight) {
        super(name, age, weight);
    }

    @Override
    public String talk() {
        return "Please, give me candy!";
    }
}
