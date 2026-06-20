package org.example;

public class MaxNumber {

    public static int max(int[] arr){
        int n=arr.length;
        int maxi=arr[0];
        for(int i=1;i<n;i++){
            maxi=Math.max(maxi,arr[i]);
        }
        return maxi;
    }
}
