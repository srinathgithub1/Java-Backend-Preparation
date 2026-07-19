package interfaceclass;

import abstrectclass.Book;

public interface LibraryOperation {

    void addBook(Book book);
    void borrowBook(String title);
    void returnBook(String title);

}
