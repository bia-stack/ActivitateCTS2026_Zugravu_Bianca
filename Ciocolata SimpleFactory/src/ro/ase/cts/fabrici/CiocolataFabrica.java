package ro.ase.cts.fabrici;

import ro.ase.cts.clase.*;

public class CiocolataFabrica {
    public ICiocolata getSortimentCiocolata(SortimentCiocolata sortiment,String nume, int kcal){
        switch(sortiment){
            case SortimentCiocolata.NEAGRA:
                return new CiocolataNeagra(nume, kcal);
            case SortimentCiocolata.ALBA:
                return new CiocolataAlba(nume, kcal);
            case SortimentCiocolata.CAPSUNI:
                return new CiocolataCuCapsuni(nume, kcal);
            default:
                return null;
        }
    }
}
