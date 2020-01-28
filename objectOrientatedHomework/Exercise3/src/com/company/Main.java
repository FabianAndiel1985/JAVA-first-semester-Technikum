package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Max","Meier");
        Person person2 = new Person("Roland","Peter");
        Person person3 = new Person("Sarah","Wagenknecht");

        Person person4 = new Person("Lorenz","Mayer");
        Person person5 = new Person("Alex","Dumas");
        Person person6 = new Person("Sarah","Wagenknecht");

        Position position1 = new Position(1,1,1,1);
        Position position2 = new Position(2,2,2,2);
        Position position3 = new Position(3,3,3,3);


        Buch buch1 = new Buch("1","Bibitem 1",position1,1985);
        buch1.setAutor(person1);
        buch1.setIsbn("1234");

        Buch buch2 = new Buch("2","Bibitem 2",position2,1985);
        buch2.setAutor(person2);
        buch2.setIsbn("67");

        Buch buch3 = new Buch("3","Bibitem 3",position3,1987);
        buch3.setAutor(person3);
        buch3.setIsbn("89");

        Buch buch4 = new Buch("4","Bibitem 4",position1,1985);
        buch4.setAutor(person3);
        buch4.setIsbn("4384");


        Zeitschrift zeitschrift1 = new Zeitschrift("4","Zeitschrift1",position1,1990);
        zeitschrift1.setHerausgeber(person1);
        zeitschrift1.setReihe("Reihe1");


        Zeitschrift zeitschrift2 = new Zeitschrift("5","Zeitschrift2",position2,1990);
        zeitschrift2.setHerausgeber(person1);
        zeitschrift2.setReihe("Reihe2");

        Zeitschrift zeitschrift3 = new Zeitschrift("5","Zeitschrift2",position2,1990);
        zeitschrift3.setHerausgeber(person1);
        zeitschrift3.setReihe("Reihe3");


        ArrayList<BibItem> bücherListe = new ArrayList<BibItem>();

        bücherListe.add(buch1);
        bücherListe.add(buch2);
        bücherListe.add(buch3);
        bücherListe.add(zeitschrift1);
        bücherListe.add(zeitschrift2);
        bücherListe.add(zeitschrift3);

        ArrayList<BibItem> bücherListe1 = new ArrayList<BibItem>();
        bücherListe1.add(zeitschrift1);
        bücherListe1.add(zeitschrift2);
        bücherListe1.add(zeitschrift3);
        bücherListe1.add(buch4);

        Bibliothek bibliothek1 = new Bibliothek("Bibiothek1", bücherListe);

        Bibliothek bibliothek2 = new Bibliothek("Bibiothek2", bücherListe1);

        ArrayList<Bibliothek> bibListe = new ArrayList<Bibliothek>();

        bibListe.add(bibliothek1);
        bibListe.add(bibliothek2);

        BibSystem bibSystem1 = new BibSystem(bibListe);

//        System.out.println(bibliothek1.sucheBeitragByAuthor("Max","Meier"));

//        System.out.println(bibliothek1.sucheBuchByISBN("1234"));

//        System.out.println(bibliothek2.getBibliothek());

//        System.out.println(bibSystem1.sucheBuchByISBN("1234"));

//        System.out.println(bibSystem1.sucheBuchByYear(1985));





    }

}
