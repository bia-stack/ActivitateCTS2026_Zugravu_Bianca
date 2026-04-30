package ro.ase.cts.Proxy.clase;

public class Autobuz implements MijlocDeTransport {
    private int nrPasageri;
    private int nrLinie;
    private TipCursa cursa;

    public Autobuz(int nrPasageri, int nrLinie) {
        this.nrPasageri = nrPasageri;
        this.nrLinie = nrLinie;
        this.cursa = TipCursa.CURSA_NORMALA;
    }

    public Autobuz(int nrPasageri, int nrLinie, TipCursa cursa) {
        this.nrPasageri = nrPasageri;
        this.nrLinie = nrLinie;
        this.cursa = cursa;
    }


    public int getNrPasageri() {
        return nrPasageri;
    }

    public TipCursa getCursa() {
        return cursa;
    }

    @Override
    public void opresteInStatie(Statie statie) {
        System.out.println("Autobuzul de pe linia "+ this.nrLinie+" a oprit in statia "+statie.getNume());
    }


}
