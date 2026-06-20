package org.example;

public class GreatestCommonFactor {

    public static int GCD(int a,int b){
        if(a==b) return a;
        /**
         * Here suppose a=15 and b=25
         * Step-1: a!=b then b=a-b or b=a%b => b=15 => calling again GCD(15,15)
         *
         */
        else return GCD(b,a>b?a-b:b-a);
    }
}
