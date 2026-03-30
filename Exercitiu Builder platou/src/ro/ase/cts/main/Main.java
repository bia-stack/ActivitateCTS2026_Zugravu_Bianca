package ro.ase.cts.main;

import ro.ase.cts.builders.AbstractBuilder;
import ro.ase.cts.builders.BuilderComandaPlatou;
import ro.ase.cts.clase.DimensiunePlatou;
import ro.ase.cts.clase.GamaVin;

public class Main {
    public static void main(String args[]){

        AbstractBuilder builder1 = new BuilderComandaPlatou();
        builder1.setMiereOrganica(true);
        builder1.setDimensiunePlatou(DimensiunePlatou.MARE);
        System.out.println(builder1.contruiesteComanda());

        AbstractBuilder builder2 = new BuilderComandaPlatou();
        builder2.setVin(GamaVin.ROZE);
        builder2.setDimensiunePlatou(DimensiunePlatou.MARE);
        builder2.setMiereOrganica(true);
        builder2.setNuciCaramelizate(true);
        System.out.println(builder2.contruiesteComanda());
    }
}