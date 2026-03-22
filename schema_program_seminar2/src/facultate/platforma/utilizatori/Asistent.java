package facultate.platforma.utilizatori;

import facultate.platforma.interfete.IPredabil;

public class Asistent extends Persoana implements IPredabil {

    private String idAsistent;

    public Asistent(String nume, int varsta, String idAsistent) {
        super(nume, varsta);
        this.idAsistent = idAsistent;
    }

    public String getIdAsistent() {
        return idAsistent;
    }

    @Override
    public String toString() {
        return "Asistentul(a) " + super.toString() + " de ani si are id asistent " + idAsistent;
    }

    @Override
    public void preda() {
        System.out.println("Asistentul(a) " + getNume() + " ajuta la predarea cursul!");
    }
}
