package Biblioteca.utilizatori;

public class LibraryStaff extends Member{
    private String StaffID;
    private String position;

    public LibraryStaff(String memberID, String name, String contactInfo, String StaffID, String position) {
        super(memberID, name, contactInfo);
        this.StaffID = StaffID;
        this.position = position;
    }

    public void manageBooks(){
        System.out.println("Bibliotecarul gestioneaza cartile!");
    }
}
