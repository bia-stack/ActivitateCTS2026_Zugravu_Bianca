package Flyweight.clase;

public class Rezervare {
    private int nrMasa;
    private int nrPers;
    private String oraRezervare;

    public Rezervare(int nrMasa, int nrPers, String oraRezervare) {
        this.nrMasa = nrMasa;
        this.nrPers = nrPers;
        this.oraRezervare = oraRezervare;
    }

    public int getNrPers() {
        return nrPers;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nr masa:").append(nrMasa).append("\n").append("Nr pers:").append(nrPers).append("\n");
        sb.append("Ora rezervare:").append(oraRezervare).append("\n");
        return sb.toString();
    }
}
