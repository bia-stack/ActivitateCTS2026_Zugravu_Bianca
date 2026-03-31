package ro.ase.cts.builders;

import ro.ase.cts.clase.MasinaUnitate;
import ro.ase.cts.clase.TipCaroserie;
import ro.ase.cts.clase.TipCombustibil;

public interface AbstractBuilder {
    MasinaUnitate construieste();
    AbstractBuilder setCombustibil(TipCombustibil combustibil);
    AbstractBuilder setCaroserie(TipCaroserie caroserie);
    AbstractBuilder setScaunIncalzit(boolean scaunIncalzit);
    AbstractBuilder setPlafonPanoramic(boolean plafonPanoramic);
    AbstractBuilder setSistemAsistentaParcare(boolean sistemAsistentaParcare);
}
