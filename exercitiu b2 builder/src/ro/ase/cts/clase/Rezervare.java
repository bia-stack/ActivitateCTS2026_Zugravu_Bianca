package ro.ase.cts.clase;

public class Rezervare {
    private String numeClient;
    private boolean asezareLaGeam;
    private boolean scaunErgonomic;
    private boolean masaDecorare;
    private boolean muzicaAmbientalaPersonalizata;
    private GenMuzica stil;

    public Rezervare(String numeClient, boolean asezareLaGeam, boolean scaunErgonomic, boolean masaDecorare, boolean muzicaAmbientala, GenMuzica stil) {
        this.numeClient = numeClient;
        this.asezareLaGeam = asezareLaGeam;
        this.scaunErgonomic = scaunErgonomic;
        this.masaDecorare = masaDecorare;
        this.muzicaAmbientalaPersonalizata = muzicaAmbientala;
        this.stil = stil;
    }

    public Rezervare(){
        numeClient = "";
        asezareLaGeam = false;
        scaunErgonomic = false;
        masaDecorare = false;
        muzicaAmbientalaPersonalizata = false;
        stil = GenMuzica.NEPRECIZAT;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }
    public void setAsezareLaGeam(boolean asezareLaGeam) {
        this.asezareLaGeam = asezareLaGeam;
    }
    public void setScaunErgonomic(boolean scaunErgonomic) {
        this.scaunErgonomic = scaunErgonomic;
    }
    public void setMasaDecorare(boolean masaDecorare) {
        this.masaDecorare = masaDecorare;
    }
    public void setMuzicaAmbientalaPersonalizata(boolean muzicaAmbientalaPersonalizata) {
        this.muzicaAmbientalaPersonalizata = muzicaAmbientalaPersonalizata;
    }
    public void setStil(GenMuzica stil) {
        if(stil != GenMuzica.NEPRECIZAT){
            this.muzicaAmbientalaPersonalizata=true;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Client: ").append(numeClient).append('\n');
        sb.append("Asezare la geam: ").append(asezareLaGeam).append('\n');
        sb.append("Scaune ergonomice: ").append(scaunErgonomic).append('\n');
        sb.append("Masa decorata: ").append(masaDecorare).append('\n');
        sb.append("Muzica ambientala personalizata: ").append(muzicaAmbientalaPersonalizata).append('\n');
        sb.append("Stil muzica: ").append(stil).append('\n');
        return sb.toString();
    }
}
