package Flyweight.clase;

import java.util.HashMap;

public class RegistruClienti {
    HashMap<String, IClient> registru = new HashMap<>();

    public Client getClient(String nume, String nrTelefon, String email){
        if(registru.containsKey(nrTelefon)){
            return (Client) registru.get(nrTelefon);
        }else{
            registru.put((nrTelefon),new Client(nume, nrTelefon, email));
            return (Client) registru.get(nrTelefon);
        }
    }
}
