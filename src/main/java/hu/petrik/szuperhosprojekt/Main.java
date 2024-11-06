package hu.petrik.szuperhosprojekt;

public class Main {

    public static void main(String[] args) {
        Kepregeny kepregeny = new Kepregeny();
        Kepregeny.szereplok("szuperhos.txt");
        Kepregeny.szuperhosok();
    }
}