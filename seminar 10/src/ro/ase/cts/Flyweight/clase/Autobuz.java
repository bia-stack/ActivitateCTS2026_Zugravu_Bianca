package ro.ase.cts.Flyweight.clase;

public class Autobuz {
    private String model;
    private int an;
    private int nrLocuri;

    public Autobuz(String model, int an, int nrLocuri) {
        this.model = model;
        this.an = an;
        this.nrLocuri = nrLocuri;
    }

    public int getNrLocuri() {
        return nrLocuri;
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "model='" + model + '\'' +
                ", an=" + an +
                ", nrLocuri=" + nrLocuri +
                '}';
    }


}
