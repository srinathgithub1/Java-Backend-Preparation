package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        Student st=new Student();

        st.setsId(103);
        st.setsName("Prabhat");
        st.setMarks(90);

//        System.out.println(st);

        Configuration cfg=new Configuration().configure().addAnnotatedClass(Student.class);

        SessionFactory sf=cfg.buildSessionFactory();

        Session session=sf.openSession();

        Transaction tx=session.beginTransaction();

        session.persist(st);
        tx.commit();

        session.close();
        sf.close();
    }
}