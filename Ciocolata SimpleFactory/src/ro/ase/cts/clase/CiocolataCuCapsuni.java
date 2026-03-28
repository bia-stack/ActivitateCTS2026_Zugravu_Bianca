package ro.ase.cts.clase;

public class CiocolataCuCapsuni extends Ciocolata{

    public CiocolataCuCapsuni(String nume, int kcal) {
        super(nume, kcal);
    }

    @Override
    public void afiseazaCiocolata() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ciocolata ").append(super.nume).append(" are ").append(super.kcal).append(" calorii!");
        System.out.println(sb);
    }
}
