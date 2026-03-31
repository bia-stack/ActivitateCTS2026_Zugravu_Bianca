package ro.ase.cts.main;

import ro.ase.cts.builders.AbstractBuilder;
import ro.ase.cts.builders.MasinaUnitateBuilder;
import ro.ase.cts.clase.MasinaUnitate;
import ro.ase.cts.clase.TipCaroserie;

public class Main{
    public static void main(String[] args){

        AbstractBuilder builder1 = new MasinaUnitateBuilder();
        builder1.setCaroserie(TipCaroserie.SUV);
        builder1.setSistemAsistentaParcare(true);
        System.out.println(builder1.construieste());


    }
}