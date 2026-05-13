package ro.ase.cts;

public class NotaDePlataRevelion extends DecoratorNotaDePlata{
    public NotaDePlataRevelion(NotaDePlata notaDePlata) {
        super(notaDePlata);
    }

    @Override
    public void printeazaFelicitare() {
        this.printeazaNotaDePlata();
        System.out.println("La multi ani si un an noua fericit!");
    }
}
