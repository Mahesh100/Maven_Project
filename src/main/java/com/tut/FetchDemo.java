package com.tut;


import com.tut.entity.EmbeddableExe.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory factory = cfg.buildSessionFactory();

        Session session = factory.openSession();
        //get-student id 106

        Student student= session.get(Student.class,108);



        System.out.println("Get data is: "+ student);
      //  session.close();
       // factory.close();
    }
}
