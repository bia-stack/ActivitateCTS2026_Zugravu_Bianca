package ro.ase.cts.Strategy.main;

import ro.ase.cts.Strategy.clase.ProbaOrala;
import ro.ase.cts.Strategy.clase.ProbaScrisa;
import ro.ase.cts.Strategy.clase.Student;

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
