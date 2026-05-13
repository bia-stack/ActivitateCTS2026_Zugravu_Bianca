package ro.ase.cts;

public class NotaDePlata implements INotaDePlata{
    private double sumaTotala;

    public NotaDePlata(double sumaTotala) {
        this.sumaTotala = sumaTotala;
    }

    @Override
    public void printeazaNotaDePlata() {
        System.out.println("Total de plata:"+sumaTotala);
    }

}


