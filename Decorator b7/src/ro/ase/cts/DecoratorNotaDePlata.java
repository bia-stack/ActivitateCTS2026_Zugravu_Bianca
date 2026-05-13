package ro.ase.cts;

public abstract class DecoratorNotaDePlata implements INotaDePlata{
    private NotaDePlata notaDePlata;

    public DecoratorNotaDePlata(NotaDePlata notaDePlata) {
        this.notaDePlata = notaDePlata;
    }

    @Override
    public void printeazaNotaDePlata() {
        notaDePlata.printeazaNotaDePlata();
        System.out.println("Nota de plata a fost emisa!");
    }

    public abstract void printeazaFelicitare();
}
