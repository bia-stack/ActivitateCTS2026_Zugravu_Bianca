package Flyweight.main;

import Flyweight.clase.Client;
import Flyweight.clase.IClient;
import Flyweight.clase.RegistruClienti;
import Flyweight.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        IClient client1 = new Client("Marcel","07123456","marcel@gmail.com");
        IClient client2 = new Client("Gigel","07987654","gigel@yahoo.com");

        RegistruClienti registruClienti = new RegistruClienti();

        Rezervare rezervare1 = new Rezervare(1,2,"12:00");
        Rezervare rezervare2 = new Rezervare(2,4,"16:30");

        System.out.println(client1.afiseazaDetaliiRezervare(rezervare1));
        System.out.println(client2.afiseazaDetaliiRezervare(rezervare2));

        Rezervare rezervare3 = new Rezervare(3,6,"17:30");
        System.out.println(registruClienti.getClient("Matei","071209837","matei@gmail.com").afiseazaDetaliiRezervare(rezervare3));

    }

}