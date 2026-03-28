package masini.main;

import masini.clase.CaroserieAutomobil;
import masini.clase.IAutomobil;
import masini.clase.Motorizare;
import masini.fabrici.AutomobilFabrica;

public class Main{
    public static void main(String[] args){

        AutomobilFabrica fabrica = new AutomobilFabrica();

        IAutomobil auto1 = fabrica.getCaroserieAutomobil(CaroserieAutomobil.SUV,"Citroen","C4"
        , Motorizare.BENZINA,97200,2022,false);
        IAutomobil auto2 = fabrica.getCaroserieAutomobil(CaroserieAutomobil.HATCHBACK,
                "Renault","Clio", Motorizare.HYBRID,50000,2020,true);
        IAutomobil auto3 = fabrica.getCaroserieAutomobil(CaroserieAutomobil.SEDAN,
                "Dacia","Logan", Motorizare.GPL,250000,2009,false);


        auto1.afiseazaDetaliiAuto();
        auto2.afiseazaDetaliiAuto();
        auto3.afiseazaDetaliiAuto();

    }
}