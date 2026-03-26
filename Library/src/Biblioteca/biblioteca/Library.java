package Biblioteca.biblioteca;

import java.util.List;

import Biblioteca.carti.Book;
import Biblioteca.utilizatori.Member;

public class Library {
    private String name;
    private String address;
    List<Book> books;
    List<Member> members;

    public Library(String name, String address, List<Book> books, List<Member> members) {
        this.name = name;
        this.address = address;
        this.books = books;
        this.members = members;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }
}
