package service;

import abstrectclass.Book;
import interfaceclass.LibraryOperation;

import java.util.ArrayList;

public class LibraryService implements LibraryOperation {

    private ArrayList<Book> books=new ArrayList<>();

    @Override
    public void addBook(Book book){
        books.add(book);

        System.out.println("Book with given title : " + book.getTitle() + " is added to the library");
    }

    @Override
    public void borrowBook(String title){

        for(Book book:books){
            if(book.getTitle().equals(title)){
                book.setAvailable(false);
                System.out.println("You have borrowed the book with title : " + title);
                return;
            }else{
                System.out.println("Book with title : " + title + " is not available to borrow");
            }
        }
    }

    @Override
    public void returnBook(String title){

        for(Book book:books){
            if(book.getTitle().equals(title) && !book.isAvailable()){
                book.setAvailable(true);
                System.out.println("You have returned the book with title : " + title);
                return;
            }else{
                System.out.println("Book with title : " + title + " not found.");
            }
        }
    }

    public void displayAllBooks(){
        for(Book book:books){
            book.getDetails();
        }
    }

}
