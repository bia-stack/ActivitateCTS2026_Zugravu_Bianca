package ro.ase.cts.seminar5.b3.clase;

public class SupaCrema extends Supa{

    public SupaCrema(float gramaj, String denumire) {
        super(gramaj, denumire);
    }

    @Override
    public void afiseaza() {
        System.out.println("Supa crema " + super.denumire + " are " + super.gramaj + " gramaj ");;
    }
}
