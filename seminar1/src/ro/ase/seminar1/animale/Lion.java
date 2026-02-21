package ro.ase.seminar1.animale;

public class Lion extends Animal{
    private int greutate;

    public Lion(String nume, int varsta, int greutate) {
        super(nume, varsta);
        this.greutate = greutate;
    }

    @Override
    public void eat(String mancare) {
        System.out.println("Leul a mancat " + mancare);
    }
}
