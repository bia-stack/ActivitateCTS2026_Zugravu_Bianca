package ro.ase.cts.seminar5.b3.main;

import ro.ase.cts.seminar5.b3.clase.FeldeMancare;
import ro.ase.cts.seminar5.b3.fabrici.*;

public class Main {
    public static void main(String[] args) {

        FelDeMancareFabrica fabrica1 = new SupaFabrica();
        FeldeMancare supaCrema = fabrica1.getFelDeMancare(TipSupa.SUPA_CREMA,100, "de burta");
        FeldeMancare ciorba = fabrica1.getFelDeMancare(TipSupa.CIORBA,100,"de porc");

        FelDeMancareFabrica fabrica2 = new DesertFabrica();
        FeldeMancare papanasi = fabrica2.getFelDeMancare(TipDesert.PAPANASI,250,"dulceata",350);
        FeldeMancare clatite = fabrica2.getFelDeMancare(TipDesert.CLATITE,150,"Nutella",200);
        FeldeMancare cheesecake = fabrica2.getFelDeMancare(TipDesert.CHEESECAKE,150,"capsuni",480);

        supaCrema.afiseaza();
        ciorba.afiseaza();
        papanasi.afiseaza();
        clatite.afiseaza();
        cheesecake.afiseaza();
    }
}