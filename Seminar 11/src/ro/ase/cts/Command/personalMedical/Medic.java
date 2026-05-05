package ro.ase.cts.Command.personalMedical;

import ro.ase.cts.Command.pacient.Pacient;

public class Medic implements PersonalSpital {
    private String nume;

    public Medic(String nume) {
        this.nume = nume;
    }

    @Override
    public void preluarePacient(Pacient pacient) {
        System.out.println("Medicul "+nume+" interneaza pacientul "+pacient.getNume());
    }
}
