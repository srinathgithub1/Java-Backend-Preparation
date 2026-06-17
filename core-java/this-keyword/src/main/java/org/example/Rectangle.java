package org.example;

public class Rectangle {
    int length;
    int breadth;

    /**
     * Here if you want to set the default value, you can do that in two-way.
     * 1. without using this keyword.
     * 2. using this-keyword.
     */
//  1. without using this keyword.
//    Rectangle(){
//        length=100;
//        breadth=200;
//    }
//  2. using this-keyword.
    Rectangle(){
        this(400,500);
    }
    /**
     * Here the default constructor is not available.
     * So, if I will call this class - this will give error
     * Because, the default constructor is not available.
     */
    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void display() {
        System.out.println(length + " " + breadth);
    }
}
