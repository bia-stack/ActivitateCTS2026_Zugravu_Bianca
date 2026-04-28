package Spital.main;

import Spital.clase.Doctor;
import Spital.clase.Pacient;
import Spital.clase.ReceptieSpital;
import Spital.clase.Salon;

public class Main {
    public static void main(String[] args) {

        Doctor doctor1 = new Doctor();
        Salon salon = new Salon();

        Pacient pacient1 = new Pacient("Popescu Mariana", 3);
        Pacient pacient2 = new Pacient("Bunea Costel", 4);
        Pacient pacient3 = new Pacient("Georgescu Loredana", 2);
        Pacient pacient4 = new Pacient("Florea Eduard", 5);

        ReceptieSpital receptieSpital1 = new ReceptieSpital(doctor1, salon);
        receptieSpital1.interneazaPacient(pacient2);
        receptieSpital1.interneazaPacient(pacient3);
        receptieSpital1.interneazaPacient(pacient4);

        if (doctor1.areTrimitere(pacient1)) {
            int patLiber = salon.getPatLiber();
            if (patLiber != -1) {
                System.out.println("Pacientul " + pacient1.getNume() + " va fi internat in patul " + patLiber);
                salon.ocupaPat(patLiber);
            }

        }

    }
}