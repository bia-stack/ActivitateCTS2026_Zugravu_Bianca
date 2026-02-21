package ro.ase.seminar1.main;

import ro.ase.seminar1.animale.Lion;
import ro.ase.seminar1.animale.Tiger;
import ro.ase.seminar1.animale.Zebra;
import ro.ase.seminar1.zoo.Zoo;
import ro.ase.seminar1.zoo.Zookeper;

public class Main {
    public static void main(String args[]){
        Zookeper zookeper = new Zookeper("Ion");
        Lion leu = new Lion("Alex",3, 150);
        Zebra zebra = new Zebra("Marty", 2, 160);
        Zoo gradinaZoo = new Zoo("Gradina Zoologica Bucuresti ASE",zookeper);

        gradinaZoo.adaugaAnimal(leu);
        gradinaZoo.adaugaAnimal(zebra);
        gradinaZoo.adaugaAnimal(new Tiger("Titan", 6, "siberian"));

        gradinaZoo.feedAllAnimals();
    }
}
