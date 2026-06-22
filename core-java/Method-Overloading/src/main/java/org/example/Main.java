package org.example;

public class Main {
    public static void main(String[] args) {

//        This will give the correct output. it will call case-1 method.
        System.out.println(Max.max(10,20));

//         This will call the case-2 method
        System.out.println(Max.max(40.2f,20));

        System.out.println(Max.max(10,40,30));


    }
}