package ro.ase.cts.clase;

import ro.ase.cts.builders.AbstractBuilder;

public class ComandaPlatou{
    private static int comanda = 0;
    private int IDComanda;
    private GamaVin vin;
    private DimensiunePlatou dimensiunePlatou;
    private boolean miereOrganica;
    private boolean nuciCaramelizate;
    private boolean struguriProaspeti;

    public ComandaPlatou(int IDComanda, GamaVin vin, DimensiunePlatou dimensiunePlatou, boolean miereOrganica, boolean nuciCaramelizate, boolean struguriProaspeti) {
        this.IDComanda = comanda++;
        this.vin = vin;
        this.dimensiunePlatou = dimensiunePlatou;
        this.miereOrganica = miereOrganica;
        this.nuciCaramelizate = nuciCaramelizate;
        this.struguriProaspeti = struguriProaspeti;
    }

    public ComandaPlatou(){
        comanda++;
        vin = GamaVin.ALB;
        dimensiunePlatou = DimensiunePlatou.MEDIU;
        miereOrganica = false;
        nuciCaramelizate = false;
        struguriProaspeti = false;
    }

    public static void setComanda(int comanda) {
        ComandaPlatou.comanda = comanda;
    }
    public void setIDComanda(int IDComanda) {
        this.IDComanda = IDComanda;
    }
    public void setVin(GamaVin vin) {
        this.vin = vin;
    }
    public void setDimensiunePlatou(DimensiunePlatou dimensiunePlatou) {
        this.dimensiunePlatou = dimensiunePlatou;
    }
    public void setMiereOrganica(boolean miereOrganica) {
        this.miereOrganica = miereOrganica;
    }
    public void setNuciCaramelizate(boolean nuciCaramelizate) {
        this.nuciCaramelizate = nuciCaramelizate;
    }
    public void setStruguriProaspeti(boolean struguriProaspeti) {
        this.struguriProaspeti = struguriProaspeti;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Comanda ID ").append(comanda).append('\n');
        sb.append("Vin: ").append(vin).append('\n');
        sb.append("Dimensiune platou: ").append(dimensiunePlatou).append('\n');
        sb.append("Miere organica: ").append(miereOrganica).append('\n');
        sb.append("Nuci caramelizate: ").append(nuciCaramelizate).append('\n');
        sb.append("Struguri proaspeti: ").append(struguriProaspeti).append('\n');
        return sb.toString();
    }
}
