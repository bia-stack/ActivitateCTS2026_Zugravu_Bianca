package ro.ase.seminar1.zoo;

import ro.ase.seminar1.animale.Animal;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private String nume;
    List<Animal> animale;
    Zookeper zookeper;

    public Zoo(String gradinaZoologicaBucurestiAse, Zookeper zookeper) {
        this.nume = nume;
        this.animale = new ArrayList<>();
        this.zookeper = zookeper;

    }

    public void feedAllAnimals(){
        for(Animal animal:animale){
            zookeper.feedAnimal(animal);
        }
    }

    public Zoo(String nume, List<Animal> animale, Zookeper zookeper) {
        this.nume = nume;
        this.animale = animale;
        this.zookeper = zookeper;
    }

    public void adaugaAnimal(Animal animal) {
        animale.add(animal);
    }
}
