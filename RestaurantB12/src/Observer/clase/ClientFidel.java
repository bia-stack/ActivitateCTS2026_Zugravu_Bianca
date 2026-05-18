package Observer.clase;

public class ClientFidel implements Client{
    private String nume;

    public ClientFidel(String nume) {
        this.nume = nume;
    }


    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println(this.nume+ " a primit noua oferta!");
    }

}
