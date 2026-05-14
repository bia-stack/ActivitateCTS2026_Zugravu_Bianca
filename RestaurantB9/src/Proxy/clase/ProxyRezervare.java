package Proxy.clase;

public class ProxyRezervare implements IRezervare{
    private IRezervare rezervare;

    public ProxyRezervare(IRezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void realizeazaRezervare(Client client, int nrPers) {
        if(nrPers>=4){
            rezervare.realizeazaRezervare(client, nrPers);
        }else{
            System.out.println("Ne pare rau, rezervarea nu poate fi realizata!Va rugam sa va prezentati la restaurant!");
        }
    }
}
