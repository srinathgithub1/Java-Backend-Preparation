package mainlibrary;

import abstrectclass.Book;
import concreteclass.PhysicalBook;
import service.LibraryService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        LibraryService library=new LibraryService();

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Book Title : ");
        String bookTitle=sc.nextLine();

        System.out.println("Enter the Book Auther : ");
        String bookAuther=sc.nextLine();

        Book book1=new PhysicalBook(bookTitle,bookAuther);

        library.addBook(book1);

        // Adding second book.

        System.out.println("Enter the Book title : ");
        String boookTitle = sc.next();

        System.out.println("Enter the Book Author : ");
        String boookAuthor = sc.next();

        Book book2 = new PhysicalBook(boookTitle, boookAuthor);
        library.addBook(book2);

        System.out.println("=============Total Books are available now================");
        library.displayAllBooks();

        System.out.println("Which book you want to Borrow now :");
        String bookTitle1 = sc.next();
        library.borrowBook(bookTitle1);

        System.out.println("============Total Books are available now=============");
        library.displayAllBooks();

        System.out.println("Which book you want to Return now :");
        String bookTitle2 = sc.next();
        library.borrowBook(bookTitle2);
        System.out.println("Book returned : Thanks!");

        System.out.println("Total Books are available now :");
        library.displayAllBooks();

    }
}