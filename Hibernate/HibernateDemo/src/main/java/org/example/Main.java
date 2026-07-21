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
             * Update the Record.
             * Approach-1:
             */
            Student student=new Student();
            student.setsId(3);
            student.setsName("Pooja");
            student.setMarks(70);

            Transaction tx=session.beginTransaction();
            session.merge(student);
            tx.commit();
            System.out.println("Data Updated Successfully");
        }

    }
}