package Biblioteca.actiuni;

import Biblioteca.carti.BookCopy;

import Biblioteca.utilizatori.Member;
import java.time.LocalDate;
import java.util.Date;
import Biblioteca.carti.Status;

public class Transaction {
    private String transactionID;
    private Date transactionDate;

    public Transaction(String transactionID, Date transactionDate) {
        this.transactionID = transactionID;
        this.transactionDate = transactionDate;
    }

    public String getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public void issueBook(Member member, BookCopy copy) {
        if (copy.getStatus().equals("available")) {
            member.borrowBook(copy);
            System.out.println("Cartea a fost emisa!");
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
