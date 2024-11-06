package hu.petrik.szuperhosprojekt;

import java.text.MessageFormat;
import java.util.Random;

public class Vasember extends Bosszuallo implements Milliardos{
    public Vasember() {
        super(150, true);


    }

    @Override
    public void kutyutKeszit(){
        float rand = new Random().nextFloat()*10;
        setSzuperero(getSzuperero()+rand);
    };

    @Override
    public boolean megmentiAVilagot(){
        return getSzuperero()>1000;
    }

    @Override
    public String toString() {
        return MessageFormat.format("Vasember: Szupererő: {0,number,#.##}; "+(isVanEGyengesege() ? "van gyengesége" : "nincs gyengesége"),getSzuperero());
    }
}
