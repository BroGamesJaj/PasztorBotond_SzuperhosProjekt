package hu.petrik.szuperhosprojekt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Kepregeny {
    public static List<Szuperhos> szuperhosLista = new ArrayList<>();

    public static void szereplok(String fajl){
        try(BufferedReader br = new BufferedReader(new FileReader(fajl))){
            String sor;
            while((sor = br.readLine()) != null){
                Szuperhos hos;
                switch(sor.split(" ")[0]){
                    case "Batman":
                        hos = new Batman();
                        break;
                    case "Vasember":
                        hos = new Vasember();
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + sor.split(" ")[0]);
                }
                for (int i = 0; i < Integer.parseInt(sor.split(" ")[1]); i++) {
                    ((Milliardos) hos).kutyutKeszit();
                }
                szuperhosLista.add(hos);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void szuperhosok(){
        for (Szuperhos hos : szuperhosLista) {
            System.out.println(hos);
        }
    }
}
