package ro.ase.cts.fabrici;

import ro.ase.cts.clase.*;

public class SupaFabrica {
    public ISupa getTipSupa(TipSupa tipSupa, String denumire, double grame, int calorii){
        switch(tipSupa){
            case TipSupa.PUI:
                return new SupaDePui(denumire, grame, calorii);
            case TipSupa.PORC:
                return new SupaDePorc(denumire, grame, calorii);
            case TipSupa.PERISOARE:
                return new SupaDePerisoare(denumire, grame, calorii);
            default:
                return null;
            }
        }
    }
