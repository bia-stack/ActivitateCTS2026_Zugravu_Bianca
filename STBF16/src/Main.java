public class Main {
    public static void main(String[] args) {
        Autobuz autobuz1 = new Autobuz("B122STB");
        Operator operator = new Operator();

        Command comanda1 = new Plecare(autobuz1,282);

        operator.adaugaComanda(comanda1);
        operator.executaComanda();
        operator.adaugaComanda(new Plecare(autobuz1,182));
        operator.executaComanda();
    }
}