package seminar05.cts.main;

import seminar05.cts.clase.Rezervare;

public class Main {
    public static void main(String[] args){
        Rezervare rezervare1 = new Rezervare();
        Rezervare rezervare = (Rezervare) rezervare1.clone();
        rezervare1.setOra(19);
        System.out.println(rezervare1.toString());
        System.out.println(rezervare.toString());

    }
}
