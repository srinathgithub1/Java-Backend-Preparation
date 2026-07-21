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
            /***
             * Delete the Record
             */
            Student st=session.find(Student.class,1);

            Transaction tx=session.beginTransaction();
            
            session.remove(st);
            tx.commit();

            System.out.println("Data Deleted Successfully");
        }

    }
}