package Composite.clase;

public class Sectie implements IStructura {
    private String sectie;

    public Sectie(String sectie) {
        this.sectie = sectie;
    }

    @Override
    public void afiseazaDetaliiStructura() {
        System.out.println("Sectia :"+sectie);
    }
}
