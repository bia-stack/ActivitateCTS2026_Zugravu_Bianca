package ro.ase.cts.seminar5.b3.fabrici;

import ro.ase.cts.seminar5.b3.clase.CheeseCake;
import ro.ase.cts.seminar5.b3.clase.Clatite;
import ro.ase.cts.seminar5.b3.clase.FeldeMancare;
import ro.ase.cts.seminar5.b3.clase.Papanasi;

public class DesertFabrica implements FelDeMancareFabrica {
    public FeldeMancare getFelDeMancare(TipFelDeMancare tip, float gramaj, String denumire, int calorii){
        switch (tip){
            case TipDesert.PAPANASI:
                return new Papanasi(calorii, denumire, gramaj);
            case TipDesert.CLATITE:
                return new Clatite(calorii, denumire, gramaj);
            case TipDesert.CHEESECAKE:
                return new CheeseCake(calorii, denumire, gramaj);
            default:
                return null;
        }
    }

    @Override
    public FeldeMancare getFelDeMancare(TipFelDeMancare tipFelDeMancare, float gramaj, String denumire) {
        return this.getFelDeMancare(tipFelDeMancare,gramaj,denumire,450);
    }


}
