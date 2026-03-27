package ro.ase.cts.main;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Elev;
import ro.ase.cts.clase.readers.AngajatiReader;
import ro.ase.cts.clase.readers.ReaderAplicanti;

public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		Aplicant.setPrag(85);
		try {
			ReaderAplicanti readerAplicanti = new AngajatiReader("angajati.txt");
			listaAngajati = readerAplicanti.readAplicanti();
			for(Aplicant aplicant:listaAngajati) {
				System.out.println(aplicant.toString());
				aplicant.afisareVenit();
				aplicant.afisareStatut();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
