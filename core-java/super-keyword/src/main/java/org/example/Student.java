package org.example;

public class Student extends Course {
    String name;
    int x=100;

    Student(int id,String name,String courseName){
        super(id,courseName);
        this.name = name;
    }

    public void display(){
        System.out.println("Student Class");
        System.out.println(name);
        super.display();
        System.out.println(super.courseName);
    }

}
