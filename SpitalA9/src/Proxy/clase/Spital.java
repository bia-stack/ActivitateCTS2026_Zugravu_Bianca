package Proxy.clase;

public class Spital implements ISpital{
   private String denumire;

    public Spital(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void interneazaPacient(Pacient pacient) {
        System.out.println("Pacientul "+pacient.getNume()+" a fost internat la spitaulul "+this.denumire);
    }
}
