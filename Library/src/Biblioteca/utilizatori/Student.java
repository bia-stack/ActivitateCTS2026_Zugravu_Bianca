package Biblioteca.utilizatori;

import Biblioteca.carti.Book;

public class Student extends Member{
    private String studentID;
    private String departament;

    public Student(String memberID, String name, String contactInfo, String studentID, String departament) {
        super(memberID, name, contactInfo);
        this.studentID = studentID;
        this.departament = departament;
    }

    public void reserveBook(Book book){
        if(book == null){
            System.out.println("Cartea nu exista!");
            return;
        }
        System.out.println("Cartea " + book.getTitle() + " a fost rezervata de studentul cu numele " + getName() + " si ID-ul " + studentID);
    }
}
