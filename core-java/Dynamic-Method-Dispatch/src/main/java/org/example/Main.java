package org.example;
public class Main {
    public static void main(String[] args) {
        Super s1=new Super();
        s1.display();//Output- Super

        System.out.println("----------------------");

        Sub s2=new Sub();
        /**
         * Output
         * Sub - java first see the sysout("Sub"), so java will first print the Sub
         * Super - then java will call the Super class display() method.
         */
        s2.display();



    }
}