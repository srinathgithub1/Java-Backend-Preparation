package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array : ");
        n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the " + n + " elements in the array : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Max Number is: " + MaxNumber.max(arr));
    }
}