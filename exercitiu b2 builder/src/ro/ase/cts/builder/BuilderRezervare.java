package ro.ase.cts.builder;

import ro.ase.cts.clase.GenMuzica;
import ro.ase.cts.clase.Rezervare;

public class BuilderRezervare implements AbstractBuilder {
    private String numeClient;
    private boolean asezareLaGeam;
    private boolean scaunErgonomic;
    private boolean masaDecorare;
    private boolean muzicaAmbientalaPersonalizata;
    private GenMuzica stil;

    public BuilderRezervare(){
        asezareLaGeam = false;
        scaunErgonomic = false;
        masaDecorare = false;
        muzicaAmbientalaPersonalizata = false;
        stil = GenMuzica.NEPRECIZAT;
    }


    @Override
    public Rezervare creaazaRezervare() {
        return new Rezervare(numeClient,asezareLaGeam,scaunErgonomic,masaDecorare,muzicaAmbientalaPersonalizata,stil);
    }

    @Override
    public AbstractBuilder setnumeClient(String numeClient) {
        this.numeClient = numeClient;
        return this;
    }

    @Override
    public AbstractBuilder setAsezareLaGeam(boolean asezareLaGeam) {
        this.asezareLaGeam = asezareLaGeam;
        return this;
    }

    @Override
    public AbstractBuilder setScaunErgonomic(boolean scaunErgonomic) {
        this.scaunErgonomic = scaunErgonomic;
        return this;
    }

    @Override
    public AbstractBuilder setMasaDecorare(boolean masaDecorare) {
        this.masaDecorare = masaDecorare;
        return this;
    }

    @Override
    public AbstractBuilder setMuzicaAmbientalaPersonalizata(boolean muzicaAmbientalaPersonalizata) {
        this.muzicaAmbientalaPersonalizata = muzicaAmbientalaPersonalizata;
        return this;
    }

    @Override
    public AbstractBuilder setStil(GenMuzica stil) {
        this.stil = stil;
        this.muzicaAmbientalaPersonalizata = true;
        return this;
    }
}
