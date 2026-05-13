package Flyweight.clase;

public class Client implements IClient {
   private String nume;
   private String nrTelefon;
   private String email;

    public Client(String nume, String nrTelefon, String email) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.email = email;
    }

    @Override
    public String afiseazaDetaliiRezervare(Rezervare rezervare) {
        StringBuilder sb = new StringBuilder();
        sb.append("Nume Client:").append(this.nume).append("\n").append("Nr telefon:").append(nrTelefon);
        sb.append("\n").append("Email:").append(email).append("\n");
        sb.append(rezervare.toString());
        return sb.toString();
    }
}
