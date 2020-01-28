package com.company;

public class Main {

    public static void main(String[] args) {
	    Ape ape1 = new Ape("ape1",10,24.25f);
	    Ape ape2 = new Ape("ape2",12,27.25f);

        Elephant elephant1 = new Elephant("elephant1",10,24.25f);
        Elephant elephant2 = new Elephant("elephant2",12,27.25f);
        Elephant elephant3 = new Elephant("elephant3",14,30.25f);

        Parrot parrot1 = new Parrot("parrot1",14,30.25f);
        Parrot parrot2 = new Parrot("parrot2",17,30.25f);
        Parrot parrot3 = new Parrot("parrot3",22,30.25f);
        Parrot parrot4 = new Parrot("parrot4",27,30.25f);

        Position position1 = new Position(1.1f,1.1f);
        Position position2 = new Position(2.1f,2.1f);
        Position position3 = new Position(3.1f,3.1f);

        Enclosure enclosure1 = new Enclosure("enclosure1",position1);
        Enclosure enclosure2 = new Enclosure("enclosure2",position2);
        Enclosure enclosure3 = new Enclosure("enclosure3",position3);

        enclosure1.addAnimal(ape1);
        enclosure1.addAnimal(ape2);

        enclosure2.addAnimal(elephant1);
        enclosure2.addAnimal(elephant2);
        enclosure2.addAnimal(elephant3);

        enclosure3.addAnimal(parrot1);
        enclosure3.addAnimal(parrot2);
        enclosure3.addAnimal(parrot3);
        enclosure3.addAnimal(parrot4);

        Zoo zoo1 = new Zoo("zoo1");

        zoo1.addEnclosure(enclosure1);
        zoo1.addEnclosure(enclosure2);
        zoo1.addEnclosure(enclosure3);

        System.out.println("Zoo " + zoo1.getName() + " owns " + zoo1.getEnclosures().size() + " enclosures!");
        System.out.println("Enclosure of name " + enclosure1.getName() + " houses " + enclosure1.getAnimals().size() + " animals!");
        System.out.println("Ape " + ape1.getName() + " is " + ape1.getAge() + " years old, weighs" + ape1.getWeight() + " kilos and says: " + ape1.talk());
        System.out.println("Ape " + ape2.getName() + " is " + ape2.getAge() + " years old, weighs" + ape2.getWeight() + " kilos and says: " + ape2.talk());


        System.out.println("Enclosure of name " + enclosure2.getName() + " houses " + enclosure2.getAnimals().size() + " animals!");
        System.out.println("Elephant " + elephant1.getName() + " is " + elephant1.getAge() + " years old, weighs " + elephant1.getWeight() + " kilos and says: " + elephant1.talk());
        System.out.println("Elephant " + elephant2.getName() + " is " + elephant2.getAge() + " years old, weighs " + elephant2.getWeight() + " kilos and says: " + elephant2.talk());
        System.out.println("Elephant " + elephant3.getName() + " is " + elephant3.getAge() + " years old, weighs " + elephant3.getWeight() + " kilos and says: " + elephant3.talk());


        System.out.println("Enclosure of name " + enclosure3.getName() + " houses " + enclosure3.getAnimals().size() + " animals!");
        System.out.println("Parrot " + parrot1.getName() + " is " + parrot1.getAge() + " years old, weighs " + parrot1.getWeight() + " kilos and says: " + parrot1.talk());
        System.out.println("Parrot " + parrot2.getName() + " is " + parrot2.getAge() + " years old, weighs " + parrot2.getWeight() + " kilos and says: " + parrot2.talk());
        System.out.println("Parrot " + parrot3.getName() + " is " + parrot3.getAge() + " years old, weighs " + parrot3.getWeight() + " kilos and says: " + parrot3.talk());
        System.out.println("Parrot " + parrot4.getName() + " is " + parrot4.getAge() + " years old, weighs " + parrot4.getWeight() + " kilos and says: " + parrot4.talk());

    }
}
