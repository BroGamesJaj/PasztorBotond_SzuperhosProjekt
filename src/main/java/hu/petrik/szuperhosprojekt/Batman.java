package hu.petrik.szuperhosprojekt;

import java.text.MessageFormat;

public class Batman implements Szuperhos,Milliardos{
    private float lelemenyesseg;

    public Batman() {
        this.lelemenyesseg = 100;
    }

    @Override
    public float mekkoraAzEreje(){
        return lelemenyesseg*2;
    }

    @Override
    public boolean legyoziE(Szuperhos ellenseg){
        return this.lelemenyesseg > ellenseg.mekkoraAzEreje();
    }

    @Override
    public void kutyutKeszit(){
        this.lelemenyesseg += 50;
    }

    @Override
    public String toString() {
        return MessageFormat.format("Batman: leleményesség: {0,number,#.##}",this.lelemenyesseg);
    }
}
