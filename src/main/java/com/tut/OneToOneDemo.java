package com.tut;

import com.tut.entity.Answer;
import com.tut.entity.Question;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class OneToOneDemo {
    public static void main(String[] args) {

        Question qt = new Question();
        qt.setQuestion("What is java?");
        qt.setQuestion_id(1212);

        //Creating answers
        Answer ans = new Answer();
        ans.setAnswer("Java is Object Oriented Programming Language");
        ans.setAnswer_id(200);
        ans.setQuestion(qt);

        Answer ans2 = new Answer();
        ans2.setAnswer("Java is Robust Programming Language");
        ans2.setAnswer_id(300);
        ans2.setQuestion(qt);

        Answer ans3 = new Answer();
        ans3.setAnswer("With help of java we can build stand alone applications");
        ans3.setAnswer_id(400);
        ans3.setQuestion(qt);


        List<Answer> list = new ArrayList<>();
        list.add(ans);
        list.add(ans2);
        list.add(ans3);

        qt.setAnswer(list);


        Configuration cfg = new Configuration();
        cfg.configure();

        SessionFactory factory = cfg.buildSessionFactory();

        Session s = factory.openSession();
        Transaction tx = s.beginTransaction();


        // Save objects here

       // s.save(ans);
        s.save(qt);
        s.save(ans);
        s.save(ans2);
        s.save(ans3);

        tx.commit();
        s.close();
        factory.close();

    }
}
