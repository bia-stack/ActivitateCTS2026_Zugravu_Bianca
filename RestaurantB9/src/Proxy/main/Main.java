package Proxy.main;

import Proxy.clase.Client;
import Proxy.clase.IRezervare;
import Proxy.clase.ProxyRezervare;
import Proxy.clase.Rezervare;

public class Main{
    public static void main(String[] args) {
        Client client1 = new Client("Maria");
        Client client2 = new Client("Viorel");
        IRezervare rezervare1 = new Rezervare();
        IRezervare rezervare2 = new Rezervare();

        ProxyRezervare proxyRezervare1 = new ProxyRezervare(rezervare1);
        ProxyRezervare proxyRezervare2 = new ProxyRezervare(rezervare2);

        proxyRezervare1.realizeazaRezervare(client1,6);
        proxyRezervare2.realizeazaRezervare(client2,2);
    }
}