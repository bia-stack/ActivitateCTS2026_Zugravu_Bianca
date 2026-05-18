package Chain;

public abstract class CalatorieHandler {
    private CalatorieHandler succesor;

    public CalatorieHandler(CalatorieHandler succesor) {
        this.succesor = null;
    }

    public abstract String recomandaCalatorie(double distanta);
}
