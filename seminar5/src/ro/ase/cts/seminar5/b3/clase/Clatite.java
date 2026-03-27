package ro.ase.cts.seminar5.b3.clase;

public class Clatite extends Desert{
    public Clatite(int calorii, String denumire, float gramaj) {
        super(calorii, denumire, gramaj);
    }

    @Override
    public void afiseaza() {
        System.out.println("Clatitele " + super.denumire + " au " + super.gramaj + " grame si " + super.calorii + " calorii!");
    }
}
