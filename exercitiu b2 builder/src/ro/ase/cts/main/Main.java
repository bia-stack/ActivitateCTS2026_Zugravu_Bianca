package ro.ase.cts.main;

import ro.ase.cts.builder.AbstractBuilder;
import ro.ase.cts.builder.BuilderRezervare;
import ro.ase.cts.clase.GenMuzica;
import ro.ase.cts.clase.Rezervare;

public class Main {
        public static void main(String[] args) {

                AbstractBuilder abstractBuilder1 = new BuilderRezervare();
                abstractBuilder1.setnumeClient("Gheorge Andreea");
                abstractBuilder1.setAsezareLaGeam(true);
                Rezervare r1 = abstractBuilder1.creaazaRezervare();
                System.out.println(r1.toString());

                AbstractBuilder abstractBuilder2 = new BuilderRezervare();
                abstractBuilder2.setnumeClient("Andrei Mihnea");
                abstractBuilder2.setScaunErgonomic(true);
                abstractBuilder2.setStil(GenMuzica.POP);
                Rezervare r2 = abstractBuilder2.creaazaRezervare();
                System.out.println(r2.toString());

                AbstractBuilder abstractBuilder3 = new BuilderRezervare();
                abstractBuilder3.setnumeClient("Denisa Beatrice");
                abstractBuilder3.setMasaDecorare(true);
                abstractBuilder3.setScaunErgonomic(true);
                abstractBuilder3.setAsezareLaGeam(true);
                System.out.println(abstractBuilder3.creaazaRezervare());


        }
}