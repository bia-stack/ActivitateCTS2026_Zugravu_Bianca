package Chain.clase;

public abstract class CalatorieTroleibuz extends CalatorieHandler {

    @Override
    public void setSuccesor(CalatorieHandler succesor) {
        super.setSuccesor(succesor);
    }

    public abstract String recomandaCalatorie(double distanta);
}
