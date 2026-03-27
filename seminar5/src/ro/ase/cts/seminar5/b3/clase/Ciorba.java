package ro.ase.cts.seminar5.b3.clase;

public class Ciorba extends Supa{

    public Ciorba(float gramaj, String denumire) {
        super(gramaj, denumire);
    }

    @Override
    public void afiseaza() {
        System.out.println("Ciorba " + super.denumire + " are gramajul " + super.gramaj + " ! ");
    }
}
