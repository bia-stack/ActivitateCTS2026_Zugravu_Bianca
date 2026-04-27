package ProgramSpital;

public class Medicament {
    private String nume;
    private float pret;

    public Medicament(String nume, float pret) {
        this.nume = nume;
        this.pret = pret;
    }

    public boolean prezintaReteta(){
        return nume.length()>10;
    }

    public void achizitioneazaMedicament(){
        if(prezintaReteta()){
            System.out.println("Medicamentul " + nume + " a fost achizitionat la pretul de " + pret + " lei!");
        } else {
            System.out.println("Clientul nu a prezentat reteta!");
        }
    }

    public String getNume() {
        return nume;
    }
}
