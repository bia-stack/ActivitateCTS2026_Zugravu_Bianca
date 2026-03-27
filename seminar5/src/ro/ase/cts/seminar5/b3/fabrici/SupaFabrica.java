package ro.ase.cts.seminar5.b3.fabrici;

import ro.ase.cts.seminar5.b3.clase.Ciorba;
import ro.ase.cts.seminar5.b3.clase.FeldeMancare;
import ro.ase.cts.seminar5.b3.clase.SupaCrema;

public class SupaFabrica implements FelDeMancareFabrica {


    @Override
    public FeldeMancare getFelDeMancare(TipFelDeMancare tipFelDeMancare, float gramaj, String denumire, int calorii) {
        return this.getFelDeMancare(tipFelDeMancare,gramaj,denumire,calorii);
    }

    @Override
    public FeldeMancare getFelDeMancare(TipFelDeMancare tipFelDeMancare, float gramaj, String denumire) {
        switch (tipFelDeMancare) {
            case TipSupa.SUPA_CREMA:
                return new SupaCrema(gramaj, denumire);
            case TipSupa.CIORBA:
                return new Ciorba(gramaj, denumire);
                default:
                return null;
        }
    }
}


