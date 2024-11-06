package hu.petrik.szuperhosprojekt;

import java.text.MessageFormat;

public abstract class Bosszuallo implements Szuperhos{
    private float szuperero;
    private boolean vanEGyengesege;

    public Bosszuallo(float szuperero, boolean vanEGyengesege) {
        this.szuperero = szuperero;
        this.vanEGyengesege = vanEGyengesege;
    }

    public boolean isVanEGyengesege() {
        return vanEGyengesege;
    }

    public void setVanEGyengesege(boolean vanEGyengesege) {
        this.vanEGyengesege = vanEGyengesege;
    }

    public float getSzuperero() {
        return szuperero;
    }

    public void setSzuperero(float szuperero) {
        this.szuperero = szuperero;
    }

    public abstract boolean megmentiAVilagot();

    @Override
    public float mekkoraAzEreje() {
        return this.szuperero;
    }

    @Override
    public boolean legyoziE(Szuperhos ellenseg){
        if(ellenseg instanceof Bosszuallo){
            return ((Bosszuallo) ellenseg).vanEGyengesege && ellenseg.mekkoraAzEreje() < this.szuperero;
        }
        return ellenseg.mekkoraAzEreje() * 2 < this.szuperero;
    }

    @Override
    public String toString() {
        return MessageFormat.format("Szupererő: {0,number,#.##}; "+(vanEGyengesege ? "van gyengesége" : "nincs gyengesége"),this.szuperero);
    }
}
