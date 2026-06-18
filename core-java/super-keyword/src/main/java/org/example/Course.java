package org.example;

public class Course {
    int id;
    String courseName;
    int x=200;
    public Course(int id, String courseName) {
        this.id = id;
        this.courseName = courseName;
    }

    public void display(){
        System.out.println("Course class");
    }
}
