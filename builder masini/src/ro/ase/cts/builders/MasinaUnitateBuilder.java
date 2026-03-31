package ro.ase.cts.builders;

import ro.ase.cts.clase.MasinaUnitate;
import ro.ase.cts.clase.TipCaroserie;
import ro.ase.cts.clase.TipCombustibil;

public class MasinaUnitateBuilder implements AbstractBuilder{
    private static int nrUnitate = 0;
    private int nrUnitateMasina;
    private TipCombustibil combustibil;
    private TipCaroserie caroserie;
    private boolean scaunIncalzit;
    private boolean plafonPanoramic;
    private boolean sistemAsistentaParcare;

    public MasinaUnitateBuilder(){
        nrUnitateMasina = ++nrUnitate;
        combustibil = TipCombustibil.BENZINA;
        caroserie = TipCaroserie.SEDAN;
        scaunIncalzit = false;
        plafonPanoramic = false;
        sistemAsistentaParcare = false;
    }

    @Override
    public MasinaUnitate construieste() {
        return new MasinaUnitate(nrUnitateMasina, combustibil, caroserie, scaunIncalzit, plafonPanoramic, sistemAsistentaParcare);
    }

    @Override
    public AbstractBuilder setCombustibil(TipCombustibil combustibil) {
        this.combustibil =combustibil;
        return this;
    }

    @Override
    public AbstractBuilder setCaroserie(TipCaroserie caroserie) {
        this.caroserie =caroserie;
        return this;
    }

    @Override
    public AbstractBuilder setScaunIncalzit(boolean scaunIncalzit) {
        this.scaunIncalzit = scaunIncalzit;
        return this;
    }

    @Override
    public AbstractBuilder setPlafonPanoramic(boolean plafonPanoramic) {
        this.plafonPanoramic = plafonPanoramic;
        return this;
    }

    @Override
    public AbstractBuilder setSistemAsistentaParcare(boolean sistemAsistentaParcare) {
        this.sistemAsistentaParcare = sistemAsistentaParcare;
        return this;
    }
}
