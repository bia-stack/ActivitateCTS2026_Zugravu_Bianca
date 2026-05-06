package Chain.clase;

public class CalatorieTramvai extends CalatorieHandler {
    @Override
    public String recomandaCalatorie(double distanta) {
        if(distanta<1){
            return "Tramvai";
        }
        return super.succesor.recomandaCalatorie(distanta);
    }
}
