package com.tut.ManyToMany;

import com.tut.entity.ManyToMany.Emp;
import com.tut.entity.ManyToMany.Project;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class ManyToManyMappingDemo {

    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure();

        SessionFactory factory = cfg.buildSessionFactory();


        Emp e1 = new Emp();
        Emp e2 = new Emp();

        e1.setEid(34);
        e1.setName("Ram");

        e2.setEid(35);
        e2.setName("Sham");

        Project p1 = new Project();
        Project p2 = new Project();

        p1.setProjectName("Library Management System");
        p1.setPid(12121);

        p2.setProjectName("Chat boat");
        p2.setPid(14214);

        List<Emp> emplist1 =new ArrayList<>();
        List<Project> projectlist2 = new ArrayList<>();

        emplist1.add(e1);
        emplist1.add(e2);

        projectlist2.add(p1);
        projectlist2.add(p2);

        e1.setProjects(projectlist2);
        p2.setEmps(emplist1);

        Session s = factory.openSession();
        Transaction tx = s.beginTransaction();
        //Save objects here

        s.save(e1);
        s.save(e2);
        s.save(p1);
        s.save(p2);


        tx.commit();
        s.close();
        factory.close();

    }
}
