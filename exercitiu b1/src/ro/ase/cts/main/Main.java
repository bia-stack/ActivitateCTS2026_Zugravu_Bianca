package ro.ase.cts.main;

import ro.ase.cts.clase.ISupa;
import ro.ase.cts.clase.TipSupa;
import ro.ase.cts.fabrici.SupaFabrica;

public class Main {
    public static void main(String[] args) {

        SupaFabrica fabrica = new SupaFabrica();
        ISupa supaPui = fabrica.getTipSupa(TipSupa.PUI,"de pui",100.5,50);
        ISupa supaPorc = fabrica.getTipSupa(TipSupa.PORC,"de porc",150.1,87);
        ISupa supaPerisoare = fabrica.getTipSupa(TipSupa.PERISOARE,"de perisoare",120.3,60);

        supaPui.afiseazaSupa();
        supaPorc.afiseazaSupa();
        supaPerisoare.afiseazaSupa();
    }
}
