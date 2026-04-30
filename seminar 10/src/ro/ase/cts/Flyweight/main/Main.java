package ro.ase.cts.Flyweight.main;

import ro.ase.cts.Flyweight.clase.Autobuz;
import ro.ase.cts.Flyweight.clase.ManagerLinie;

public class Main {
    static void main(String[] args) {
        Autobuz autobuz1 = new Autobuz("Mercedes",2000,50);
        Autobuz autobuz2 = new Autobuz("Lada",2002,60);
        Autobuz autobuz3 = new Autobuz("Lamborghini",2026,45);

        ManagerLinie managerLinii = new ManagerLinie();
        managerLinii.getLinie(1,"Romana","Universitate").numarMaximPasageriPeLinie(autobuz1);
        managerLinii.getLinie(1,"Otopeni","Ferentari").descriereLinie(autobuz1);


    }
}
