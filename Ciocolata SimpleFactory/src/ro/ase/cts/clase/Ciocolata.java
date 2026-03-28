package ro.ase.cts.clase;

public abstract class Ciocolata implements ICiocolata {
    String nume;
    int kcal;

    public Ciocolata(String nume, int kcal) {
        this.nume = nume;
        this.kcal = kcal;
    }
}
