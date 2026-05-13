package ro.ase.cts;

public class NotaDePlataZiNastere extends DecoratorNotaDePlata{
    public NotaDePlataZiNastere(NotaDePlata notaDePlata) {
        super(notaDePlata);
    }

    @Override
    public void printeazaFelicitare() {
        this.printeazaNotaDePlata();
        System.out.println("La multi ani cu ocazia zilei de nastere!");
    }
}
