package ro.ase.cts.Chain.clase;

public class CalatorieAutobuz extends CalatorieHandler {

    @Override
    public String recomandaCalatorie(double distanta) {
        if (distanta < 5) {
            return "Autobuz";
        }
        return succesor.recomandaCalatorie(distanta);
    }
}
