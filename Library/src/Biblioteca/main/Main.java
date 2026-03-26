package Biblioteca.main;

import Biblioteca.actiuni.Borrowing;
import Biblioteca.actiuni.Transaction;
import Biblioteca.biblioteca.Library;
import Biblioteca.carti.Book;
import Biblioteca.carti.BookCopy;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import Biblioteca.carti.Status;
import Biblioteca.utilizatori.LibraryStaff;
import Biblioteca.utilizatori.Student;

public class Main {
    public static void main(String[] args){

        List<BookCopy> copies = new ArrayList<>();

        BookCopy copy = new BookCopy("1",Status.available);
        copies.add(copy);

        Book book = new Book("Alba ca zapada si cei 7 pitici",
                "Fratii Grimm","978-3-16-148410-0","Literatura pentru copii",copies);


        Student student = new Student("M101", "Vasile Andrei",
                "vasileandrei@gmail.com","S100","Facultatea de Marketing");

        System.out.println("================= Verific daca aceasta carte este valabila=============================");
        copy.checkStatus();

        System.out.println("=================== Studentul a imprumutat cartea ======================================");
        student.borrowBook(copy);

        System.out.println(" ============================= Verific daca imprumut a avut loc:=======================");
        copy.checkStatus();

        System.out.println(" ============================= Ce carte a fost imprumutate si de cine =================");
        student.reserveBook(book);

        Borrowing borrowing = new Borrowing("1",
                LocalDate.now(),LocalDate.now().plusDays(14),copy);

        student.returnBook(borrowing);
        System.out.println("Verific daca a fost returnata");
        copy.checkStatus();

        LibraryStaff staff = new LibraryStaff("LS001",
                "Popescu Aurica","popescuaurica69@gmail.com","STF001","Bibliotecar Sef");

        staff.manageBooks();

        List<Book> bookList = new ArrayList<>();
        bookList.add(book);

        Library library = new Library("Biblioteca Judeteana Slobozia","Strd Morii nr2",bookList,new ArrayList<>());

        Book book1 = new Book("Amintiri din Copilarie",
                "Ion Creaga","123-456-789","Literatura pentru copii",copies);
        library.addBook(book1);

        library.removeBook(book1);

        Transaction tr = new Transaction("1", new Date());
        tr.issueBook(student,copy);

        student.borrowBook(copy);
        Borrowing borrowing1= new Borrowing("2",LocalDate.now(),LocalDate.now().plusDays(10),copy);
        borrowing1.extendDueDate(20);
    }
}