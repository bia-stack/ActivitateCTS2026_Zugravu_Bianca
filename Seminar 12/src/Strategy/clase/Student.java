package Strategy.clase;

public class Student {
    private String nume;
    private ModSustinere modSustinere;

    public Student(String nume, ModSustinere modSustinere) {
        this.nume = nume;
        this.modSustinere = modSustinere;
    }

    public void setModSustinere(ModSustinere modSustinere) {
        this.modSustinere = modSustinere;
    }

    public Student(String nume){
        this.nume = nume;
        this.modSustinere =new ProbaScrisa();
    }

    public void examinare(ProbaOrala probaOrala){
        modSustinere.sustinereExamen();
    }

}
