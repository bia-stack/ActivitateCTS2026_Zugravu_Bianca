package Strategy.main;

import Strategy.clase.ProbaOrala;
import Strategy.clase.ProbaScrisa;
import Strategy.clase.Student;

public class Main {
    static void main(String[] args) {
        Student student = new Student("Gigel");
        student.examinare(new ProbaOrala());

        student.examinare(new ProbaOrala());
        student.examinare(new ProbaOrala());

        student.setModSustinere(new ProbaScrisa());
        student.examinare(new ProbaOrala());
    }
}
