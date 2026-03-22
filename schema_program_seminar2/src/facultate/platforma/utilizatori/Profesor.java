package facultate.platforma.utilizatori;

import facultate.platforma.interfete.IPredabil;

public class Profesor extends Persoana implements IPredabil {
    private String idAngajat;

    public Profesor(String nume, int varsta, String idProfesor) {
        super(nume, varsta);
        this.idAngajat = idProfesor;
    }

    public String getIdAngajat() {
        return idAngajat;
    }


    @Override
    public String toString() {
        return "Profesorul(oara) " + super.toString() + " ani si id angajat " + idAngajat;
    }

    @Override
    public void preda() {
        System.out.println("Profesorul(oara) " + getNume() + " preda cursul!");
    }
}
