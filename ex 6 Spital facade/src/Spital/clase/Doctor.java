package Spital.clase;

public class Doctor {
    public boolean areTrimitere(Pacient pacient) {
        return pacient.getGravitateStare()>5;
    }
}
