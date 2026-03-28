package masini.fabrici;

import masini.clase.*;

public class AutomobilFabrica {
    public IAutomobil getCaroserieAutomobil(CaroserieAutomobil caroserie,String marca, String model, Motorizare tipCombustibil, int rulaj, int anFabricatie, boolean istoricAccident){
        switch(caroserie){
            case SUV -> {
                return new SUV(marca, model, tipCombustibil, rulaj, anFabricatie, istoricAccident);
            }
            case HATCHBACK -> {
                return new Hatchback(marca, model, tipCombustibil, rulaj, anFabricatie, istoricAccident);
            }
            case SEDAN -> {
                return new Sedan(marca, model, tipCombustibil, rulaj, anFabricatie, istoricAccident);
            }
            default -> {return null;}
        }
    }
}
