package ro.ase.cts.builders;

import ro.ase.cts.clase.ComandaPlatou;
import ro.ase.cts.clase.DimensiunePlatou;
import ro.ase.cts.clase.GamaVin;

public interface AbstractBuilder {
    ComandaPlatou contruiesteComanda();
    AbstractBuilder setVin(GamaVin vin);
    AbstractBuilder setDimensiunePlatou(DimensiunePlatou dimensiunePlatou);
    AbstractBuilder setMiereOrganica(boolean miereOrganica);
    AbstractBuilder setNuciCaramelizate(boolean nuciCaramelizate);
    AbstractBuilder setStruguriProaspeti(boolean struguriProaspeti);
}
