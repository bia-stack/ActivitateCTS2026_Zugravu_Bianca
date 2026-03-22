package facultate.platforma.utilizatori;

public class Student extends Persoana {
    private String idStudent;

    public Student(String nume, int varsta, String idStudent) {
        super(nume, varsta);
        this.idStudent = idStudent;
    }

    public String getIdStudent() {
        return idStudent;
    }

    @Override
    public String toString() {
        return "Studentul(a) " + super.toString() + " si are id student: " + idStudent;
    }
}
