package com.company;

public class LegoFigur {
    Arm armLinks;
    Arm armRechts;
    Bein beinLinks;
    Bein beinRechts;
    String bezeichnung;
    Kopf kopf;
    String lage;

    public LegoFigur(Arm armLinks, Arm armRechts, Bein beinLinks, Bein beinRechts, String bezeichnung, Kopf kopf, String lage) {
        this.armLinks = armLinks;
        this.armRechts = armRechts;
        this.beinLinks = beinLinks;
        this.beinRechts = beinRechts;
        this.bezeichnung = bezeichnung;
        this.kopf = kopf;
        this.lage = lage;
    }

    @Override
    public String toString() {
        return "Lage:" + lage;
    }

    void armBewegen(int winkel, int arm) {

    }

    void aufsetzen(Kopfbedeckung hut) {

    }

     void beineBewegen(int winkel, int bein) {

    }

    void halten(Werkzeug equip, int hand) {

    }

    void handLinksBewegen(int winkel, int arm) {

    }

    void handRechtsBewegen(int winkel, int arm) {

    }

    void kopfDrehen(int winkel) {

    }

    void lageAendern(String neueLage) {

    }

    void zerlegen() {

    }

    public Arm getArmLinks() {
        return armLinks;
    }

    public void setArmLinks(Arm armLinks) {
        this.armLinks = armLinks;
    }

    public Arm getArmRechts() {
        return armRechts;
    }

    public void setArmRechts(Arm armRechts) {
        this.armRechts = armRechts;
    }

    public Bein getBeinLinks() { return beinLinks; }

    public void setBeinLinks(Bein beinLinks) {
        this.beinLinks = beinLinks;
    }

    public Bein getBeinRechts() {
        return beinRechts;
    }

    public void setBeinRechts(Bein beinRechts) {
        this.beinRechts = beinRechts;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public Kopf getKopf() {
        return kopf;
    }

    public void setKopf(Kopf kopf) {
        this.kopf = kopf;
    }

    public String getLage() {
        return lage;
    }

    public void setLage(String lage) {
        this.lage = lage;
    }
}
