package ro.ase.cts.clase;

public class SupaDePui extends Supa{
    public SupaDePui(String denumire, double grame, int calorii) {
        super(denumire, grame, calorii);
    }

    @Override
    public void afiseazaSupa() {
        StringBuilder sb = new StringBuilder();
        sb.append("Supa ").append(super.denumire);
        sb.append(" are ").append(super.grame).append(" de grame si").append(super.calorii).append(" de calorii!");
        System.out.println(sb);
    }
}
