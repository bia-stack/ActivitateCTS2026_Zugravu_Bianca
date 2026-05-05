package ro.ase.cts.Command.main;

import ro.ase.cts.Command.comenzi.Command;
import ro.ase.cts.Command.comenzi.Internare;
import ro.ase.cts.Command.comenzi.Tratare;
import ro.ase.cts.Command.pacient.Pacient;
import ro.ase.cts.Command.personalMedical.Asistenta;
import ro.ase.cts.Command.personalMedical.Medic;
import ro.ase.cts.Command.personalMedical.Operator;
import ro.ase.cts.Command.personalMedical.PersonalSpital;

public class Main {
    public static void main() {
    PersonalSpital medic = new Medic("Popescu");
    PersonalSpital asistenta = new Asistenta("Avram");

    Pacient pacient1 = new Pacient("Grigorescu");
    Pacient pacient2= new Pacient("Popovici");

    Command comanda1 = new Internare(medic,pacient1);
    Command comanda2 = new Tratare(asistenta,pacient2);

    Operator operator = new Operator();

    operator.inregistreaza(comanda1);
    operator.inregistreaza(comanda2);

    operator.executaComanda();

    operator.inregistreaza(new Tratare(asistenta,new Pacient("Gigel")));

    }
}
