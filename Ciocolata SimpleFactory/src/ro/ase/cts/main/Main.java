package ro.ase.cts.main;

import ro.ase.cts.clase.ICiocolata;
import ro.ase.cts.clase.SortimentCiocolata;
import ro.ase.cts.fabrici.CiocolataFabrica;

public class Main{
    public static void main(String[] args){

        CiocolataFabrica fabrica = new CiocolataFabrica();

        ICiocolata ciocolata1 = fabrica.getSortimentCiocolata(SortimentCiocolata.NEAGRA,"Milka",560);
        ICiocolata ciocolata2 = fabrica.getSortimentCiocolata(SortimentCiocolata.ALBA,"Decora",400);
        ICiocolata ciocolata3 = fabrica.getSortimentCiocolata(SortimentCiocolata.CAPSUNI,"Africana",390);

        ciocolata1.afiseazaCiocolata();
        ciocolata2.afiseazaCiocolata();
        ciocolata3.afiseazaCiocolata();

    }
}