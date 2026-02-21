package ro.ase.seminar1.animale;

public class Zebra extends Animal{
    private int inaltime;

    public Zebra(String nume, int varsta, int inaltime) {
        super(nume, varsta);
        this.inaltime = inaltime;
    }

    @Override
    public void eat(String mancare) {
        System.out.println("Zebra a mancat " + mancare);
    }
}
