package Composite.main;

import Composite.clase.IStructura;
import Composite.clase.Item;
import Composite.clase.Sectiune;

public class Main {
    public static void main(String[] args) {
        IStructura meniu = new Sectiune("Meniu");
        IStructura startere = new Sectiune("startere");
        IStructura bauturi = new Sectiune("bauturi");
        IStructura deserturi = new Sectiune("deserturi");

        IStructura item1 = new Item("Coca Cola",8.5);
        IStructura item2 = new Item("Sprite",9.9);
        IStructura item3 = new Item("Mirinda",8.7);
        IStructura item4 = new Item("Fanta",6.7);

        IStructura item5 = new Item("Supa-crema",20.99);
        IStructura item6 = new Item("Creveti",50);
        IStructura item7 = new Item("Hummus",15.99);
        IStructura item8 = new Item("Frigarui",25.99);

        IStructura item9 = new Item("Papanasi",30.89);
        IStructura item10 = new Item("Tiramisu",20.67);
        IStructura item11 = new Item("Clatite",19.99);


        ((Sectiune) meniu).adaugaNod(startere);
        ((Sectiune) meniu).adaugaNod(bauturi);
        ((Sectiune) meniu).adaugaNod(deserturi);

        ((Sectiune) startere).adaugaNod(item5);
        ((Sectiune) startere).adaugaNod(item6);
        ((Sectiune) startere).adaugaNod(item7);
        ((Sectiune) startere).adaugaNod(item8);

        ((Sectiune) bauturi).adaugaNod(item1);
        ((Sectiune) bauturi).adaugaNod(item2);
        ((Sectiune) bauturi).adaugaNod(item3);
        ((Sectiune) bauturi).adaugaNod(item4);

        ((Sectiune) deserturi).adaugaNod(item9);
        ((Sectiune) deserturi).adaugaNod(item10);
        ((Sectiune) deserturi).adaugaNod(item11);

        meniu.afiseazaDetaliiStructura();
    }
}