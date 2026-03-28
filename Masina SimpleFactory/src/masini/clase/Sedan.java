package masini.clase;

public class Sedan extends Automobil{

    public Sedan(String marca, String model, Motorizare tipCombustibil, int rulaj, int anFabricatie, boolean istoricAccident) {
        super(marca, model, tipCombustibil, rulaj, anFabricatie, istoricAccident);
    }

    @Override
    public void afiseazaDetaliiAuto() {
        StringBuilder sb = new StringBuilder();
        sb.append("Automobilul ").append(super.marca).append(", model ").append(super.model);
        sb.append(" este pe ").append(super.tipCombustibil).append(", are ").append(super.rulaj);
        sb.append(" km, a fost fabricat in anul ").append(super.anFabricatie);
        sb.append(" si ");
        sb.append(super.istoricAccident ? "are accidente in istoric ": "nu are in istoric accidente");
        System.out.println(sb);
    }
}
