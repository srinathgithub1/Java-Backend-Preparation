package org.example;

class Rectangle{
    int length;
    int breadth;

    Rectangle(){
        length=breadth=1;
    }
//    when I took here parameter variable name is l and b, it is working as expected.
//    Rectangle(int l,int b){
//        length=l;
//        breadth=b;
//    }
/**   But most of the developer take parameter variable name same as the attribute name;
      In this case the Name conflict happen.
      When we run program using this constructor we will get the Output as 0 0
      Because java confused here, he is thinking length and breadth are local or parameterized variable.
     To solve this name conflict java using the this keyword.
 **/
    Rectangle(int length,int breadth){
        length=length;
        breadth=breadth;
    }

    public void display(){
        System.out.println(length + " " + breadth);
    }
}

public class Main {
    public static void main(String[] args) {

        Rectangle r1=new Rectangle(10,20);
        r1.display();
    }
}