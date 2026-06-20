package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter the Number: ");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();

//        Prime prime=new Prime();
        if(Prime.isPrime(n)){
            System.out.println("Prime Number");
        }else {
            System.out.println("Not Prime Number");
        }
    }
}