package Observer.clase;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements IRestaurant{
    private String denunume;
    private List<ClientFidel> listaClienti = new ArrayList<>();

    public Restaurant(String denunume) {
        this.denunume = denunume;
    }

    @Override
    public void trimiteNotificare(String mesaj) {
        for(ClientFidel clientFidel: listaClienti){
            clientFidel.primesteNotificare(mesaj);
        }
    }

    @Override
    public void aboneazaClient(ClientFidel clientFidel) {
        listaClienti.add(clientFidel);
    }

    public void notificaClientMeniuNou(){
        trimiteNotificare("Avem un nou meniu!");
    }

    public void notificaClientOfertaNoua(){
        trimiteNotificare("A fost introdusa o noua oferta!");
    }
}
