package Spital.clase;

public class ReceptieSpital {
    private Doctor medic;
    private Salon salon;

    public ReceptieSpital(Doctor medic, Salon salon) {
        this.medic = medic;
        this.salon = salon;
    }

    public void interneazaPacient (Pacient pacient) {
        if(medic.areTrimitere(pacient)) {

            int patLiber = salon.getPatLiber();

            if (patLiber != -1) {
                System.out.println("Pacientul " + pacient.getNume() + " va fi internat in patul " + patLiber);
                salon.ocupaPat(patLiber);
            } else {
                System.out.println("Capacitatea acestui salon a fost epuizata!Veti fi repartizat in alta camera!");
            }

        }
        System.out.println("Este necesar biletul de trimitere de la medic!");

    }
}
