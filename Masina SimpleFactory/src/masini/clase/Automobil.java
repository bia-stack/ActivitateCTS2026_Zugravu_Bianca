package masini.clase;

public abstract class Automobil implements IAutomobil{
    String marca;
    String model;
    Motorizare tipCombustibil;
    int rulaj;
    int anFabricatie;
    boolean istoricAccident;

    public Automobil(String marca, String model, Motorizare tipCombustibil, int rulaj, int anFabricatie, boolean istoricAccident) {
        this.marca = marca;
        this.model = model;
        this.tipCombustibil = tipCombustibil;
        this.rulaj = rulaj;
        this.anFabricatie = anFabricatie;
        this.istoricAccident = istoricAccident;
    }

    public String isIstoricAccident() {
        return this.istoricAccident ? "NU" : "DA";
    }
}
