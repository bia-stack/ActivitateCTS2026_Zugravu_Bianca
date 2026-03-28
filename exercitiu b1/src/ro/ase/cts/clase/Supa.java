package ro.ase.cts.clase;

public abstract class Supa implements ISupa{
    String denumire;
    double grame;
    int calorii;

    public Supa(String denumire, double grame, int calorii) {
        this.denumire = denumire;
        this.grame = grame;
        this.calorii = calorii;
    }
}
