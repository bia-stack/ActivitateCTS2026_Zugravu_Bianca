package ro.ase.cts.Command.comenzi;

import ro.ase.cts.Command.pacient.Pacient;
import ro.ase.cts.Command.personalMedical.PersonalSpital;

public class Tratare implements Command {
    private PersonalSpital asistenta;
    private Pacient pacient;

    public Tratare(PersonalSpital asistenta, Pacient pacient) {
        this.asistenta = asistenta;
        this.pacient = pacient;
    }

    @Override
    public void executa() {
        asistenta.preluarePacient(pacient);
    }
}
