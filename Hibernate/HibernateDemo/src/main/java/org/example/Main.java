package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        try(SessionFactory sf=new Configuration()
                .configure()
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();
                Session session=sf.openSession()){
            Student s1=session.find(Student.class,102);
            if(s1!=null){
                System.out.println(s1);
            }else{
                System.out.println("Data not found");
            }

        }

    }
}