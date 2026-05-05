package ro.ase.cts.Observer.main;

import ro.ase.cts.Observer.clase.ISpital;
import ro.ase.cts.Observer.clase.Pacient;
import ro.ase.cts.Observer.clase.PacientAbonat;
import ro.ase.cts.Observer.clase.Spital;

public class Main{
    static void main() {
        Pacient pacient1 = new PacientAbonat("Ionescu", 30);
        Pacient pacient2 = new PacientAbonat("Georgescu",20);
        Pacient pacient3 = new PacientAbonat("Popescu",49);

        ISpital spital = new Spital("Cantacuzino");
        spital.aboneazaPacient(pacient1);
        spital.aboneazaPacient(pacient2);
        spital.aboneazaPacient(pacient3);

        ((Spital)spital).notificaVirus();
        ((Spital)spital).notificaEpidemie();



    }
}