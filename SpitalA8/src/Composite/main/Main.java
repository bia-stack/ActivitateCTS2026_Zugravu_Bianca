package Composite.main;

import Composite.clase.Departament;
import Composite.clase.IStructura;
import Composite.clase.Sectie;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        IStructura departament1 = new Departament("Medicina interna");
        IStructura departament2 = new Departament("Chirurgie generala");
        IStructura departament3 = new Departament("Cardiologie");
        IStructura departament4 = new Departament("ORL");

        IStructura sectie1 = new Sectie("ATI");
        IStructura sectie2 = new Sectie("Boli infectioase");
        IStructura sectie3 = new Sectie("Reumatologie");
        IStructura sectie4 = new Sectie("Gastroenterologie");


        ((Departament) departament2).adaugaNod(sectie1);
        ((Departament) departament3).adaugaNod(sectie4);
        ((Departament) departament4).adaugaNod(sectie1);
        ((Departament) departament1).adaugaNod(sectie2);
        ((Departament) departament3).adaugaNod(sectie4);
        ((Departament) departament2).adaugaNod(sectie1);

        List<IStructura> depSpital = new ArrayList<>();
        depSpital.add(departament1);
        depSpital.add(departament2);
        depSpital.add(departament3);
        for (IStructura structura : depSpital) {
            structura.afiseazaDetaliiStructura();

        }

        ((Departament) departament1).stergeNod(sectie2);
        ((Departament) departament2).stergeNod(sectie1);
        for (IStructura structura : depSpital) {
            structura.afiseazaDetaliiStructura();
        }
    }
}