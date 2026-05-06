package ro.ase.cts.Chain.clase;

public class CalatorieTroleibuz extends CalatorieHandler {

    @Override
    public String recomandaCalatorie(double distanta) {
        if (distanta < 3) {
            return "Troleibuz";
        }
        return succesor.recomandaCalatorie(distanta);
    }
}
