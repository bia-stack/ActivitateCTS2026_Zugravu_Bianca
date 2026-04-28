package Spital.clase;

public class Pacient {
    private String nume;
    private int gravitateStare;

    public Pacient(String nume, int gravitateStare) {
        this.nume = nume;
        this.gravitateStare = gravitateStare;
    }

    public String getNume() {
        return nume;
    }

    public int getGravitateStare() {
        return gravitateStare;
    }
}
