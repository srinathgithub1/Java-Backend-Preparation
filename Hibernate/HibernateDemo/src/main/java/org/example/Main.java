package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        Student st=new Student();

        st.setsId(104);
        st.setsName("Vikash");
        st.setMarks(70);


        try(SessionFactory sf=new Configuration()
                .configure()
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();
                Session session=sf.openSession()){
            Transaction tx=session.beginTransaction();
            session.persist(st);
            tx.commit();
            System.out.print("Data saved successfully");
        }

    }
}