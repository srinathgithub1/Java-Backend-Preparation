package concreteclass;

import abstrectclass.Book;

public class EBook extends Book {

    public EBook(String bookTitle,String bookAuther){
        super(bookTitle,bookAuther);
    }

    @Override
    public void getDetails() {
        System.out.println("Book Title :" + getTitle() + " Book Auther :" + getAuthor() + " is " + (isAvailable() ? " available." : "not available"));
    }
}
