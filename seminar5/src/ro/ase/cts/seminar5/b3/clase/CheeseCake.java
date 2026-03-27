package ro.ase.cts.seminar5.b3.clase;

public class CheeseCake extends Desert{

    public CheeseCake(int calorii, String denumire, float gramaj) {
        super(calorii, denumire, gramaj);
    }

    @Override
    public void afiseaza() {
        System.out.println("Cheesecake-ul " + super.denumire + " are " + super.gramaj + " grame si are " + super.calorii + " calorii!");


    }
}
