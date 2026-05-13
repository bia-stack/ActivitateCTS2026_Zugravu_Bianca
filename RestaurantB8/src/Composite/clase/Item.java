package Composite.clase;

public class Item implements IStructura{
    private String denumire;
    private double pret;

    public Item(String denumire, double pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    @Override
    public void afiseazaDetaliiStructura(String spatiu) {
        System.out.println("Denumire produs: "+denumire+"| Pret:"+pret);
    }
}
