package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int m,n;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number M: ");
        m = sc.nextInt();

        System.out.print("Enter the Number N: ");
        n=sc.nextInt();

        System.out.println(GreatestCommonFactor.GCD(m,n));
    }
}