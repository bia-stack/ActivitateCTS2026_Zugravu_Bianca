package Composite.clase;

public class Item implements IStructura {
    private String denumire;
    private double pret;

    public Item(String denumire, double pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    @Override
    public void afiseazaDetaliiStructura() {
        System.out.println("Produs:"+denumire+"| Pret:"+pret);
    }
}
