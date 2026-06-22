package org.example;

public class Max {

    /**
     * Case-1:
     * this is allowed. because both paramere is integer and we are returning the integer.
     * @param a
     * @param b
     * @return
     */
    public static int max(int a, int b){
        return a>b?a:b;
    }

    /**
     * Case-1:
     * this is not allowed. this is already available even if we change the name of
     * parameter it will not chang the method signature.
     * @param x
     * @param y
     * @return
     */
    public static int max(int x, int y){
        return x>y?x:y;
    }


    /**
     * Case-2:
     * this is allowed.
     * @param a
     * @param b
     * @return
     */
    public static float max(float a, int b){
        return (a>b) ? a:b;
    }
}
