package ro.ase.cts.Proxy.main;

import ro.ase.cts.Proxy.clase.*;

public class Main{
    public static void main(String[] args){
        MijlocDeTransport autobuz1 = new Autobuz(24,128);

        Statie statie1 = new Statie("Piata Romana",12);
        Statie statie2 = new Statie("Universitate",6);

        MijlocDeTransport autobuz2 = new Autobuz(21,226);

        autobuz1.opresteInStatie(statie1);
        autobuz2.opresteInStatie(statie2);

        MijlocDeTransport autoNoapte123 = new AutobuzDeNoapte(autobuz2);
        MijlocDeTransport autoNoapte124 = new AutobuzDeNoapte(autobuz1);

        autoNoapte123.opresteInStatie(statie1);
        autoNoapte124.opresteInStatie(statie2);

        MijlocDeTransport autobuz3 =new Autobuz(12,6);
        MijlocDeTransport autoSpecial = new AutobuzCursaSpeciala(autobuz1);
        MijlocDeTransport autoSpecial126 = new AutobuzCursaSpeciala(autobuz2);
    }
}