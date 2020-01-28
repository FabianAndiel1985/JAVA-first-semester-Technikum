package com.company;

public abstract class Animal implements Describable {
    private String name;
    private int age;
    private float weight;

    public Animal(String name, int age, float weight) {
        this.name = name;
        if(age >= 0) {
            this.age= age;
        }
        else if (age < 0) {
            System.out.println("Error invalid entry");
        }
        ;
        if(weight >= 0) {
            this.weight= weight;
        }
        else if (weight < 0) {
            System.out.println("Error invalid entry");
        };
    }

    public String getDescription() {
        return getClass().getSimpleName();
    };

    abstract String talk();

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getWeight() {
        return weight;
    }
}
