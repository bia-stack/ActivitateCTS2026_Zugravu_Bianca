package ro.ase.seminar1.animale;

public abstract class Animal {
    String nume;
    private int varsta;
    public abstract void eat(String mancare);

    public Animal(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                '}';
    }
}
