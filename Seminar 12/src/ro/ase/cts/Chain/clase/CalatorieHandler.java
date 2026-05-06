package ro.ase.cts.Chain.clase;

public abstract class CalatorieHandler {
    CalatorieHandler succesor;

    public CalatorieHandler() {
        this.succesor = null;
    }

    public void setSuccesor(CalatorieHandler succesor) {
        this.succesor = succesor;
    }

    public abstract String recomandaCalatorie(double distanta);
}
