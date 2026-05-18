package Observer.main;


import Observer.clase.ClientFidel;
import Observer.clase.Restaurant;

public class Main {
    public static void main(String[] args) {
        ClientFidel client1 = new ClientFidel("Camelia");
        ClientFidel client2 = new ClientFidel("Ovidiu");
        ClientFidel client3 = new ClientFidel("Ioana");

        Restaurant restaurant1 = new Restaurant("Cherhana");
        restaurant1.aboneazaClient(client1);
        restaurant1.aboneazaClient(client2);
        restaurant1.aboneazaClient(client3);

        restaurant1.notificaClientMeniuNou();

    }
}