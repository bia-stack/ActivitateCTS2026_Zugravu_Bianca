package ProgramFarmacie;

public class Medicament {
    private String nume;
    private float pret;

    public Medicament(String nume, float pret) {
        this.nume = nume;
        this.pret = pret;
    }

    public void cumparaMedicament(){
        System.out.println("Medicamentul " + nume + " a fost cumparat la pretul de " + pret + " lei!");
    }
}
