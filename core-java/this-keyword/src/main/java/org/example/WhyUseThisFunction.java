package org.example;

public class WhyUseThisFunction {
    public static void main(String[] args) {
        /**
         * the main point is when any parameterized constructor is defined in the parent class
         * and default constructor is not available then in that case, if you create the object without
         * passing the constructor then it will give Error. in that case you must need to create the default constructor.
         */
        Rectangle r1=new Rectangle();
        r1.display();

        /**
         * After executing the code this will assign the length=10 and breadth=20.
         */
        Rectangle r2=new Rectangle(10,20);
        r2.display();

    }
}
