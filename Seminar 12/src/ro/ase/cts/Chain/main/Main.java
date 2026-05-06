package ro.ase.cts.Chain.main;

import ro.ase.cts.Chain.clase.*;

public class Main {
    public static void main(String[] args) {

        CalatorieHandler calatorieMetrou= new CalatorieMetrou();
        CalatorieHandler calatorieTramvai= new CalatorieTramvai();
        CalatorieHandler calatorieAutobuz= new CalatorieAutobuz();
        CalatorieHandler calatorieTroleibuz= new CalatorieTroleibuz();


        calatorieTroleibuz.setSuccesor(calatorieAutobuz);
        calatorieAutobuz.setSuccesor(calatorieTramvai);
        calatorieTramvai.setSuccesor(calatorieMetrou);


        System.out.println(calatorieTroleibuz.recomandaCalatorie(2));
        System.out.println(calatorieTroleibuz.recomandaCalatorie(4));
        System.out.println(calatorieTroleibuz.recomandaCalatorie(7));
        System.out.println(calatorieTroleibuz.recomandaCalatorie(12));
    }
}