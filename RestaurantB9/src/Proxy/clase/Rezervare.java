package Proxy.clase;

public class Rezervare implements IRezervare{

    @Override
    public void realizeazaRezervare(Client client, int nrPers) {
        System.out.println("Rezervarea realizata!Client:"+client.getNume()+" si include "+nrPers+" persone!");
    }
}
