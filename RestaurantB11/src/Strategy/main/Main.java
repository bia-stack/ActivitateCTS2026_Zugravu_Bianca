package Strategy.main;

import Strategy.clase.Client;
import Strategy.clase.ModDePlata;
import Strategy.clase.PlataCard;
import Strategy.clase.PlataCash;


public class Main{
    public static void main(String[] args) {
        Client client1 = new Client("Marcela", new PlataCard());

        ModDePlata modDePlata1 = new PlataCard();
        client1.setModDePlata(modDePlata1);
        client1.platesteSuma();

        Client client2 = new Client("Andrei");
        ModDePlata modDePlata2 = new PlataCash();
        client2.setModDePlata(modDePlata2);
        client2.platesteSuma();

    }
}