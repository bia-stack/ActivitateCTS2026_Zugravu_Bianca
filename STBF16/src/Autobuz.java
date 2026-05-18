public class Autobuz {
    private String nrInmatriculare;

    public Autobuz(String nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
    }

    public String getNrInmatriculare() {
        return nrInmatriculare;
    }

    public void pornestePeTraseu(int nrLinie){
        System.out.println("Autobuzul cu nr inmatriculare "+nrInmatriculare+" porneste pe traseul "+nrLinie);
    }
}
