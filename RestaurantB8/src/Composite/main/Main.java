package Composite.main;

import Composite.clase.IStructura;
import Composite.clase.Item;
import Composite.clase.Sectiune;

public class Main {
    public static void main(String[] args) {
        IStructura meniu = new Sectiune("Meniu");

        IStructura startere = new Sectiune("Startere");
        IStructura bauturi = new Sectiune("Bauturi");
        IStructura deserturi = new Sectiune("Deserturi");

        IStructura item1 = new Item("hummus",20.89);
        IStructura item2 = new Item("frigarui",35.67);
        IStructura item3 = new Item("creveti",80.99);

        IStructura item4 = new Item("7Up",8.99);
        IStructura item5 = new Item("Sprite",7.99);
        IStructura item6 = new Item("Mirinda",6.99);

        IStructura item7 = new Item("Clatite",15.80);
        IStructura item8 = new Item("Papanasi",20.80);
        IStructura item9 = new Item("Tiramisu",25.99);

        ((Sectiune) meniu).adaugaNod(startere);
        ((Sectiune) meniu).adaugaNod(bauturi);
        ((Sectiune) meniu).adaugaNod(deserturi);

        ((Sectiune) startere).adaugaNod(item1);
        ((Sectiune) startere).adaugaNod(item2);
        ((Sectiune) startere).adaugaNod(item3);

        ((Sectiune) bauturi).adaugaNod(item4);
        ((Sectiune) bauturi).adaugaNod(item5);
        ((Sectiune) bauturi).adaugaNod(item6);

        ((Sectiune) deserturi).adaugaNod(item7);
        ((Sectiune) deserturi).adaugaNod(item8);
        ((Sectiune) deserturi).adaugaNod(item9);

        meniu.afiseazaDetaliiStructura("\n");

    }
}