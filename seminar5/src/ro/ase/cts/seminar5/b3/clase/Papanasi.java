package ro.ase.cts.seminar5.b3.clase;

public class Papanasi extends Desert{

    public Papanasi(int calorii, String denumire, float gramaj) {
        super(calorii, denumire, gramaj);
    }

    @Override
    public void afiseaza(){
        System.out.println("Papanasii cu " + super.denumire + " au " + super.gramaj + " grame si " + super.calorii + " calorii!");
    }
}
