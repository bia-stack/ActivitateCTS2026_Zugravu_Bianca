package facultate.platforma.main;

import facultate.platforma.discipline.Curs;
import facultate.platforma.utilizatori.Asistent;
import facultate.platforma.utilizatori.Profesor;
import facultate.platforma.utilizatori.Student;


public class Main {
    public static void main(String[] args){
        Profesor prof = new Profesor("Anton Zamfir", 39,"1");
        System.out.println(prof.toString());

        Asistent asistent = new Asistent("Cosmin Daniel",24,"12");
        System.out.println(asistent.toString());

        Student stud = new Student("Popescu Maria",22,"s1234");
        System.out.println(stud.toString());

        Student stud1 = new Student("Ionescu Antonia",21,"s1233");
        Student stud2 = new Student("Fugiciu Alexia",19,"s1235");
        Student stud3 = new Student("Ziuabuna Andrei",24,"s1236");

        Curs java = new Curs("Java",5,prof);
        java.adaugaStudenti(stud);
        java.adaugaStudenti(stud1);
        java.adaugaStudenti(stud2);
        java.adaugaStudenti(stud3);

        System.out.println(java.toString());

    }
}
