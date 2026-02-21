package ro.ase.seminar1.zoo;

import ro.ase.seminar1.animale.Animal;

public class Zookeper {
    private String nume;

    public Zookeper(String nume) {
        this.nume = nume;
    }

    public void feedAnimal(Animal animal){
        System.out.println("Zookeperul " + nume + " a hranit " + animal.toString());
        animal.eat("Mancare");
    }
}
