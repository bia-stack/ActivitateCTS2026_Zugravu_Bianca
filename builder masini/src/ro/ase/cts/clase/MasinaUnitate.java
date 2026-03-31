package ro.ase.cts.clase;

public class MasinaUnitate {
    private static int nrUnitate = 0;
    private int nrUnitateMasina;
    private TipCombustibil combustibil;
    private TipCaroserie caroserie;
    private boolean scaunIncalzit;
    private boolean plafonPanoramic;
    private boolean sistemAsistentaParcare;

    public MasinaUnitate(int nrUnitateMasina, TipCombustibil combustibil, TipCaroserie caroserie, boolean scaunIncalzit, boolean plafonPanoramic, boolean sistemAsistentaParcare) {
        this.nrUnitateMasina = nrUnitateMasina;
        this.combustibil = combustibil;
        this.caroserie = caroserie;
        this.scaunIncalzit = scaunIncalzit;
        this.plafonPanoramic = plafonPanoramic;
        this.sistemAsistentaParcare = sistemAsistentaParcare;
    }

    public MasinaUnitate(){
        nrUnitateMasina = ++nrUnitate;
        combustibil = TipCombustibil.BENZINA;
        caroserie = TipCaroserie.SEDAN;
        scaunIncalzit = false;
        plafonPanoramic = false;
        sistemAsistentaParcare = false;
    }

    public void setNrUnitateMasina(int nrUnitateMasina) {
        this.nrUnitateMasina = nrUnitateMasina;
    }
    public static void setNrUnitate(int nrUnitate) {
        MasinaUnitate.nrUnitate = nrUnitate;
    }
    public void setCombustibil(TipCombustibil combustibil) {
        this.combustibil = combustibil;
    }
    public void setCaroserie(TipCaroserie caroserie) {
        this.caroserie = caroserie;
    }
    public void setScaunIncalzit(boolean scaunIncalzit) {
        this.scaunIncalzit = scaunIncalzit;
    }
    public void setPlafonPanoramic(boolean plafonPanoramic) {
        this.plafonPanoramic = plafonPanoramic;
    }
    public void setSistemAsistentaParcare(boolean sistemAsistentaParcare) {
        this.sistemAsistentaParcare = sistemAsistentaParcare;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Masina nr ").append(nrUnitateMasina).append('\n');
        sb.append("Motorizare: ").append(combustibil).append('\n');
        sb.append("Caroserie: ").append(caroserie).append('\n');
        sb.append("Scaune incalzite: ").append(scaunIncalzit).append('\n');
        sb.append("Plafon panoramic: ").append(plafonPanoramic).append('\n');
        sb.append("Sistem asistenta parcare: ").append(sistemAsistentaParcare).append('\n');
        return sb.toString();
    }
}
