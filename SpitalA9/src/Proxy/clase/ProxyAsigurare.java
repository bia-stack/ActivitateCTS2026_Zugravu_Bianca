package Proxy.clase;

public class ProxyAsigurare implements ISpital{
    private ISpital spital;

    public ProxyAsigurare(ISpital spital) {
        this.spital = spital;
    }

    @Override
    public void interneazaPacient(Pacient pacient) {
        if(pacient.isAreAsigurare()){
            spital.interneazaPacient(pacient);
        }else{
            System.out.println("Pacientul nu poate fi internat deoarece nu are asigurare medicala!");
        }
    }
}
