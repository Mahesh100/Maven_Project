package com.tut;

import com.tut.entity.EmbeddableExe.Certificate;
import com.tut.entity.EmbeddableExe.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmmedableDemo {

    public static void  main(String [] args)
    {
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory factory = cfg.buildSessionFactory();

        Certificate certificate = new Certificate();
        certificate.setDuration("2");
        certificate.setCourse("Android");

        Student stud = new Student();
        stud.setName("Mahesh");
        stud.setId(3);
        stud.setCity("Delhi");
        stud.setCertificate(certificate);

        //2nd student and 2nd Certificate
        Certificate certificate2 = new Certificate();
        certificate2.setDuration("4");
        certificate2.setCourse("Java");

        Student stud2 = new Student();
        stud2.setName("Ravi");
        stud2.setId(4);
        stud2.setCity("Noida");
        stud2.setCertificate(certificate2);


        Session s = factory.openSession();
        Transaction tx = s.beginTransaction();

        //Save objects here

        s.save(stud);
        s.save(stud2);

        tx.commit();
        s.close();
        factory.close();
    }
}
