package seminar05.cts.clase;

public class Rezervare implements RezervarePrototype{
    private String numeClient;
    private int ora;
    private int nrPersoane;
    private String nrCard;

    public Rezervare(String numeClient, int ora, int nrPersoane, String nrCard) {
        this.numeClient = numeClient;
        if(ora >= 11 && ora >= 22){
            this.ora = ora;
        } else {
            this.ora = 11;
        }
        this.nrPersoane = nrPersoane;
         if (nrCard.length() == 16){
          this.nrCard = nrCard;
         } else {
             this.nrCard = "000000000000000000";
         }
         this.nrCard = nrCard;
    }

    public void setOra(int ora) {
        this.ora = ora;
    }

    public Rezervare() {

    }


    @Override
    public RezervarePrototype clone() {
        Rezervare rezervare = new Rezervare();
        rezervare.numeClient = this.numeClient;
        rezervare.nrPersoane = this.nrPersoane;
        rezervare.nrCard= this.nrCard;
        rezervare.ora = this.ora;
        return rezervare;
    }

}
