package Biblioteca.carti;

import java.util.List;
import Biblioteca.carti.Status;

public class Book {
    private String title;
    private String author;
    private String ISBN;
    private String category;
    List<BookCopy> copies;

    public Book(String title, String author, String ISBN, String category, List<BookCopy> copies) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.category = category;
        this.copies = copies;
    }

    public String getTitle() {
        return title;
    }

    public boolean checkAvailability() {
        for (BookCopy copy : copies) {
            if (copy.getStatus().equals("available")) {
                return true;
            }

        }
        return false;
    }

    public boolean borrowBook() {
        for (BookCopy copy : copies) {
            if (copy.getStatus().equals("borrowed")) {
                return true;
            }

        }
        return false;
    }

    public boolean returnBook() {
        for (BookCopy copy : copies) {
            if (copy.getStatus().equals("borrowed")) {
                copy.setStatus(Status.available);
                return true;
            }
        }
        return false;
    }

}
