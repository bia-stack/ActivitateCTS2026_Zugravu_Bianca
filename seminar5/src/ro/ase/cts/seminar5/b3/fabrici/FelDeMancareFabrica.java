package ro.ase.cts.seminar5.b3.fabrici;

import ro.ase.cts.seminar5.b3.clase.FeldeMancare;

public interface FelDeMancareFabrica {

    FeldeMancare getFelDeMancare(TipFelDeMancare tipFelDeMancare, float gramaj, String denumire, int calorii);

    FeldeMancare getFelDeMancare(TipFelDeMancare tipFelDeMancare, float gramaj, String denumire);
}
