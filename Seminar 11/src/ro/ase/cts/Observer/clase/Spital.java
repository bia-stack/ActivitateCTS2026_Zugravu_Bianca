package ro.ase.cts.Observer.clase;

import java.util.ArrayList;
import java.util.List;

public class Spital implements ISpital {
    private String nume;
    private List<Pacient> listaPacienti = new ArrayList<>();

    public Spital(String nume) {
        this.nume = nume;
    }

    @Override
    public void trimiteMesaj(String mesaj) {
        for(Pacient pacient:listaPacienti){
            pacient.receptioneazaMesaj(mesaj+" de la spitalul "+nume);
        }
    }

    @Override
    public void aboneazaPacient(Pacient pacient) {
        listaPacienti.add(pacient);
    }

    public void notificaVirus(){
        trimiteMesaj("Exista un nou tip de virus!");
    }

    public void notificaEpidemie(){
        trimiteMesaj("Exista o epidemie nationala!");
    }
}
