package org.example;

public class Main {
    public static void main(String[] args) {

//        This will give the correct output. it will call case-1 method.
        System.out.println(Max.max(10,20));

//        This will give error because in Max class there is not any method which is taking
//        parameter max(float,int). It will give Compiler error.
//        System.out.println(Max.max(10.5,20));


    }
}