package Proxy.main;

import Proxy.clase.ISpital;
import Proxy.clase.Pacient;
import Proxy.clase.ProxyAsigurare;
import Proxy.clase.Spital;

public class Main {
    public static void main(String[] args) {
        ISpital spital1 = new Spital("Elias");
        Pacient pacient1 = new Pacient("Grigore",false);

        ISpital spital2 = new Spital("Regina Maria");
        Pacient pacient2 = new Pacient("Mariana",true);

        ProxyAsigurare proxyAsigurare1=new ProxyAsigurare(spital1);
        proxyAsigurare1.interneazaPacient(pacient1);

        ProxyAsigurare proxyAsigurare2=new ProxyAsigurare(spital2);
        proxyAsigurare2.interneazaPacient(pacient2);
    }
}