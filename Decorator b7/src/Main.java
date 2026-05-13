import ro.ase.cts.DecoratorNotaDePlata;
import ro.ase.cts.NotaDePlata;
import ro.ase.cts.NotaDePlataRevelion;
import ro.ase.cts.NotaDePlataZiNastere;

public class Main {
  public static void main(String[] args) {
    NotaDePlata notaDePlata = new NotaDePlata(45.99);

    notaDePlata.printeazaNotaDePlata();

    DecoratorNotaDePlata notaDePlataZiNastere = new NotaDePlataZiNastere(notaDePlata);
    DecoratorNotaDePlata notaDePlataRevelion = new NotaDePlataRevelion(notaDePlata);

    notaDePlataRevelion.printeazaFelicitare();
    notaDePlataZiNastere.printeazaFelicitare();

  }
}