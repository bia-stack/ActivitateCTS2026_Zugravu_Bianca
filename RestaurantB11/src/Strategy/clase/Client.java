package Strategy.clase;

public class Client {
    private String nume;
    private ModDePlata modDePlata;

    public Client(String nume, ModDePlata modDePlata) {
        this.nume = nume;
        this.modDePlata = modDePlata;
    }

    public Client(String nume){
        this.nume = nume;
        this.modDePlata = new PlataCash();
    }

    public void setModDePlata(ModDePlata modDePlata) {
        this.modDePlata = modDePlata;
    }

    public void platesteSuma(){
        modDePlata.plateste();
    }
}
