package com.tut;

import com.tut.entity.Address;
import com.tut.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.imageio.stream.FileImageInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        System.out.println(factory);
        System.out.println(factory.isOpen());

        Student st = new Student();
//        st.setId(101);
//        st.setName("Mahesh");
//        st.setCity("Jalna");
//        System.out.println(st);
//
//        st.setId(102);
//        st.setName("Durgesh");
//        st.setCity("Lucknow");
//        System.out.println(st);

        st.setId(109);
        st.setName("Aniket");
        st.setCity("abad");
        System.out.println(st);


        Address ad = new Address();

        ad.setStreet("Station Road");
        ad.setCity("Pune");
        ad.setOpen(true);
        ad.setAddDate(new Date());
        ad.setX(1.1);
      //  ad.setImage();

        //Reading Image

        FileInputStream fis = new FileInputStream("src/main/resources/pic.png");
       byte[] data = new byte[fis.available()];
       fis.read(data);
       ad.setImage(data);

        Session session =factory.openSession();

        session.beginTransaction();

        session.save(ad);
        session.save(st);
        session.getTransaction().commit();
        session.close();
        System.out.println("Done");


    }
}