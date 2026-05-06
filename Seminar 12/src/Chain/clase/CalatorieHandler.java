package Chain.clase;

public abstract class CalatorieHandler {
    CalatorieHandler succesor;

    public CalatorieHandler() {
        this.succesor = null;
    }

    public void setSuccesor(CalatorieHandler succesor) {
        this.succesor = succesor;
    }

    public String recomandaCalatorie(double distanta){
        if(distanta<3){
            return "Troleibuz";
        }
        return succesor.recomandaCalatorie(distanta);
    }
}
