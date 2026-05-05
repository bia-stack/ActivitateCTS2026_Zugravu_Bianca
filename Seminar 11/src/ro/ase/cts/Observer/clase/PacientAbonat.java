package ro.ase.cts.Observer.clase;

public class PacientAbonat implements Pacient {

    private String nume;
    private int varsta;

    public PacientAbonat(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    @Override
    public void receptioneazaMesaj(String mesaj) {
        System.out.println("Pacientul " + nume +" a primit mesajul:" + mesaj);
    }
}
