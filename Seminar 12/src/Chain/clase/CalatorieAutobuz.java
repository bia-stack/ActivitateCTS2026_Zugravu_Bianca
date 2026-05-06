package Chain.clase;

public class CalatorieAutobuz extends CalatorieHandler {

    @Override
    public String recomandaCalatorie(double distanta) {
        if (distanta < 5) {
            return super.succesor.recomandaCalatorie(distanta);
        }
        return "Autobuz";
    }
}
