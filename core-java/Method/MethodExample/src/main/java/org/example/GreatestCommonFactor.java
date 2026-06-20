package org.example;

public class GreatestCommonFactor {

    public static int GCD(int a,int b){
        if(b==0) return a;
        /**
         * Here suppose a=15 and b=25
         * Step-1: b!=0 then b=a%b => b=10 => calling again GCD(25,15%25=15)
         * Step-2: b!=0 then b=a%b => b=10 => calling again GCD(15,25%15=10)
         * Step-3: b!=0 then b=a%b => b=0 => calling again GVD(10,15%10=5)
         * Step-3: b!=0 then b=a%b => b=0 => calling again GVD(5,10%5=0)
         * Step-4: b==0 return a.
         *
         */
        else return GCD(b,a%b);
    }
}
