package ro.ase.cts.Proxy.clase;

public class AutobuzDeNoapte implements MijlocDeTransport {
    private MijlocDeTransport mijlocDeTransport;

    public AutobuzDeNoapte(MijlocDeTransport mijlocDeTransport) {
        this.mijlocDeTransport = mijlocDeTransport;
    }

    @Override
    public void opresteInStatie(Statie statie) {
        if(this.mijlocDeTransport.getNrPasageri()>0 || statie.getNrCalatori()>0){
            this.mijlocDeTransport.opresteInStatie(statie);
        }else{
            System.out.println("Autobuzul nu opreste in statia "+ statie.getNume()+"!");
        }
    }

    @Override
    public int getNrPasageri() {
        return this.mijlocDeTransport.getNrPasageri();
    }

    @Override
    public TipCursa getCursa() {
        return this.mijlocDeTransport.getCursa();
    }
}
