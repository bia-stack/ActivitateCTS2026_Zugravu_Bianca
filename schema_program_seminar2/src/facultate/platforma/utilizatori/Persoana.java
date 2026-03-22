package facultate.platforma.utilizatori;

import facultate.platforma.interfete.IPersoana;

public abstract class Persoana implements IPersoana {
    private String nume;
    private int varsta;

    public Persoana(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    @Override
    public String getNume() {
        return nume;
    }

    @Override
    public int getVarsta() {
        return varsta;
    }

    @Override
    public String toString() {
        return nume + " are varsta de " + varsta;
    }


}
