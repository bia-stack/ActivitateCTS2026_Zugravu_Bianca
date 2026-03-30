package ro.ase.cts.builder;

import ro.ase.cts.clase.GenMuzica;
import ro.ase.cts.clase.Rezervare;

public interface AbstractBuilder {
    Rezervare creaazaRezervare();
    AbstractBuilder setnumeClient(String numeClient);
    AbstractBuilder setAsezareLaGeam(boolean asezareLaGeam);
    AbstractBuilder setScaunErgonomic(boolean scaunErgonomic);
    AbstractBuilder setMasaDecorare(boolean masaDecorare);
    AbstractBuilder setMuzicaAmbientalaPersonalizata(boolean muzicaAmbientalaPersonalizata);
    AbstractBuilder setStil(GenMuzica stil);
}
