package ro.ase.cts.seminar5.b3.clase;

public abstract class Desert implements FeldeMancare{
    protected float gramaj;
    protected String denumire;
    protected  int calorii;

    public Desert(int calorii, String denumire, float gramaj) {
        this.calorii = calorii;
        this.denumire = denumire;
        this.gramaj = gramaj;
    }
}


