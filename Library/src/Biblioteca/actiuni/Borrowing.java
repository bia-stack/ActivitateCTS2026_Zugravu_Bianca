package Biblioteca.actiuni;

import Biblioteca.carti.BookCopy;

import java.time.LocalDate;

public class Borrowing {
    private String borrowingID;
    private LocalDate borrowingDate;
    private LocalDate dueDate;
    private LocalDate returnDate;
    private BookCopy copy;

    public Borrowing(String borrowingID, LocalDate borrowingDate, LocalDate dueDate, BookCopy copy) {
        this.borrowingID = borrowingID;
        this.borrowingDate = borrowingDate;
        this.dueDate = dueDate;
        this.copy = copy;
        this.returnDate = null;
    }

    public LocalDate getBorrowingDate() {
        return borrowingDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public BookCopy getCopy() {
        return copy;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public void extendDueDate(int days){
        if (returnDate != null){
            System.out.println("Cartea a fost deja returnata!");
        } else {
            dueDate = dueDate.plusDays(days);
            System.out.println("Termenul de returnare a fost actualizat cu " + days + " zile");

        }
    }
}
