package facultate.platforma.discipline;

import facultate.platforma.utilizatori.Profesor;
import facultate.platforma.utilizatori.Student;

import java.util.ArrayList;
import java.util.List;

public class Curs {
    private String numeCurs;
    private int credite;
    Profesor profesor;
    List<Student> studenti;

    public Curs(String numeCurs, int credite, Profesor profesor, List<Student> studenti) {
        this.numeCurs = numeCurs;
        this.credite = credite;
        this.profesor = profesor;
        this.studenti = new ArrayList<>();
    }

    public Curs(String java, int credite, Profesor profesor) {
        this.numeCurs = java;
        this.credite = credite;
        this.profesor = profesor;
        this.studenti = new ArrayList<>();
    }


    public String getNumeCurs() {
        return numeCurs;
    }

    public int getCredite() {
        return credite;
    }

    public void adaugaStudenti(Student student){
        studenti.add(student);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Curs:").append(numeCurs);
        sb.append(" Profesor:").append(profesor.getNume());
        sb.append(" Lista Studenti:");

        for (Student s : studenti) {
            sb.append(" ").append(s.getNume());
        }

        return sb.toString();
        }


    }

