package ro.ase.cts.Command.comenzi;

import ro.ase.cts.Command.pacient.Pacient;
import ro.ase.cts.Command.personalMedical.PersonalSpital;

public class Internare implements Command {
    private PersonalSpital medic;
    private Pacient pacient;

    public Internare(PersonalSpital medic, Pacient pacient) {
        this.medic = medic;
        this.pacient = pacient;
    }

    @Override
    public void executa() {
        medic.preluarePacient(pacient);
    }
}
