package com.tut.states;

import com.tut.entity.EmbeddableExe.Certificate;
import com.tut.entity.EmbeddableExe.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.persistence.Transient;

public class StateDemo {


    public static void main(String[] args) {
        /* States in Hibernate

        1) Transient state
        2) Persistent state
        3) Detached state
        4) Removed state */

        System.out.println("Example : ");

        SessionFactory factory = new Configuration().configure().buildSessionFactory();

        //Creating student object
        Student student = new Student();

        //setting property for student object
        student.setName("Kiran");
        student.setCity("Jalna");
        student.setCertificate(new Certificate("Java Hibernate","2 months"));
        student.setId(1234);

        //here above now student object is in transient state

        Session s = factory.openSession();
        Transaction tx =s.beginTransaction();

        s.save(student);   //In persistent state

        student.setName("John");

        tx.commit();

        s.close();  //Object is in detached state / Object get removed from the session object

        student.setName("Mahesh");

        //



        factory.close();


    }
}
