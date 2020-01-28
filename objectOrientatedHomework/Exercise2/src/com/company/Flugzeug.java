package com.company;

public abstract class Flugzeug {
    private Pilot pilot;
    private String bezeichnung;
    private int hoechstgeschwindigkeit;
    private int maxSpeed;

    public Flugzeug(String bezeichnung, int hoechstgeschwindigkeit) {
        this.bezeichnung = bezeichnung;
        this.hoechstgeschwindigkeit = hoechstgeschwindigkeit;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public boolean setPilot(Pilot pilot) {
        if (pilot.getSkill().getBeschreibung().equals(this.bezeichnung)) {
            this.pilot = pilot;
            return true;
        }
        return false;
        }

        public int getMaxSpeed () {
            return maxSpeed;
        }

        public void setMaxSpeed ( int maxSpeed){
            if (maxSpeed > 199) {
                this.maxSpeed = maxSpeed;
            } else {
                System.out.println("invalid entry");
            }
        }

    public abstract String toString();

    }

