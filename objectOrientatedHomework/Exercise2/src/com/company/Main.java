package com.company;

public class Main {

    public static void main(String[] args) {
//	 write your code here

        Skill skill = new Skill("Airbus","Airbus");
        Skill skill1 = new Skill("Jet","Jet");

        Pilot iceman = new Pilot(skill);
        Pilot maverick= new Pilot(skill1);

        Flugzeug airbus = new Motorflugzeug("Airbus",300);
        airbus.setPilot(iceman);
        airbus.setMaxSpeed(700);

        Flugzeug jet = new Segelflugzeug("Jet",400);
        jet.setPilot(maverick);
        jet.setMaxSpeed(900);

        Fluggesellschaft newAir = new Fluggesellschaft("Airbase");
        newAir.addFlugzeuge(airbus);
        newAir.addFlugzeuge(jet);

//        System.out.println(newAir.flugzeuge);

//        System.out.println(newAir.getFlugzeug(0));
//        System.out.println(newAir.getFlugzeug(1));
    }
}
