package Biblioteca.utilizatori;

import Biblioteca.actiuni.Borrowing;
import Biblioteca.carti.BookCopy;
import Biblioteca.carti.Status;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Member {
    private String memberID;
    private String name;
    private String contactInfo;
    private List<Borrowing> borrowingList;

    public Member(String memberID, String name, String contactInfo) {
        this.memberID = memberID;
        this.name = name;
        this.contactInfo = contactInfo;
        this.borrowingList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void borrowBook(BookCopy copy) {
        if (copy.getStatus().equals(Status.available)) {
            copy.setStatus(Status.borrowed);
            Borrowing imprumut = new Borrowing("1", LocalDate.now(), LocalDate.now().plusDays(10), copy);
            borrowingList.add(imprumut);
            System.out.println("Cartea a fost imprumutata cu succes!");
        } else {
            System.out.println("Cartea este indisponibila!");
        }
    }

    public void returnBook(Borrowing borrowing) {
        if (borrowing == null) {
            System.out.println("Imprumutul nu este valid!");
            return;
        }
        if (borrowing.getReturnDate() != null) {
            System.out.println("Cartea a fost deja returnata!");
            return;
        }
        BookCopy copy = borrowing.getCopy();
        copy.setStatus(Status.available);
        borrowing.setReturnDate(LocalDate.now());
        System.out.println("Cartea a fost returnata!");

    }

}
