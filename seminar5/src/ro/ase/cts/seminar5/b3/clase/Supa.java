package ro.ase.cts.seminar5.b3.clase;

public abstract class Supa implements FeldeMancare {
    protected float gramaj;
    protected String denumire;

    public Supa(float gramaj, String denumire) {
        this.gramaj = gramaj;
        this.denumire = denumire;
    }


}
