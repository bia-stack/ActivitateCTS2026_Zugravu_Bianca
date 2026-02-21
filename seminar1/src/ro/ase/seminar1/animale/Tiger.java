package ro.ase.seminar1.animale;

public class Tiger extends Animal{
    private String rasa;

    public Tiger(String nume, int varsta, String rasa) {
        super(nume, varsta);
        this.rasa = rasa;
    }

    @Override
    public void eat(String mancare) {
        System.out.println("Tigrul " + super.nume + " mananca " + mancare);
    }
}
