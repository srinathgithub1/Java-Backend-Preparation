package concreteclass;

import abstrectclass.Book;

public class PhysicalBook extends Book{

    public PhysicalBook(String bookTitle,String bookAuther){
        super(bookTitle,bookAuther);
    }

    @Override
    public void getDetails() {
        System.out.println("Book Title :" + getTitle() + " and Book Auther :" + getAuthor() + " is " + (isAvailable() ? " available." : "not available"));
    }

}
