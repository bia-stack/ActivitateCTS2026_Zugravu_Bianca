package ro.ase.cts.builders;

import ro.ase.cts.clase.ComandaPlatou;
import ro.ase.cts.clase.DimensiunePlatou;
import ro.ase.cts.clase.GamaVin;

public class BuilderComandaPlatou implements AbstractBuilder{
    private static int comanda = 1;
    private int IDComanda;
    private GamaVin vin;
    private DimensiunePlatou dimensiunePlatou;
    private boolean miereOrganica;
    private boolean nuciCaramelizate;
    private boolean struguriProaspeti;

    public BuilderComandaPlatou(){
        comanda++;
        vin = GamaVin.ALB;
        dimensiunePlatou = DimensiunePlatou.MEDIU;
        miereOrganica = false;
        nuciCaramelizate = false;
        struguriProaspeti = false;
    }

    @Override
    public ComandaPlatou contruiesteComanda() {
        return new ComandaPlatou();
    }


    @Override
    public AbstractBuilder setVin(GamaVin vin) {
        this.vin = vin;
        return null;
    }

    @Override
    public AbstractBuilder setDimensiunePlatou(DimensiunePlatou dimensiunePlatou) {
        this.dimensiunePlatou = dimensiunePlatou;
        return this;
    }

    @Override
    public AbstractBuilder setMiereOrganica(boolean miereOrganica) {
        this.miereOrganica = miereOrganica;
        return this;
    }

    @Override
    public AbstractBuilder setNuciCaramelizate(boolean nuciCaramelizate) {
        this.nuciCaramelizate = nuciCaramelizate;
        return this;
    }

    @Override
    public AbstractBuilder setStruguriProaspeti(boolean struguriProaspeti) {
        this.struguriProaspeti =struguriProaspeti;
        return this;
    }
}
