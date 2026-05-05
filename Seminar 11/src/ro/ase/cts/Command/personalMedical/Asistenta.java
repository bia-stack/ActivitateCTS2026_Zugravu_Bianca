package ro.ase.cts.Command.personalMedical;

import ro.ase.cts.Command.pacient.Pacient;

public class Asistenta implements PersonalSpital {
    private String nume;

    public Asistenta(String nume) {
        this.nume = nume;
    }

    @Override
    public void preluarePacient(Pacient pacient) {
        System.out.println("Asistenta "+nume+ " interneaza imediat pacientul "+pacient.getNume());
    }
}
