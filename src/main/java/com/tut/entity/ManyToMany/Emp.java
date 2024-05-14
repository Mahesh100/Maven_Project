package com.tut.entity.ManyToMany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Emp {
    @Id
    private int eid;
    private String name;

    @ManyToMany
    private List<Project> projects;

    public Emp(){
       super();
    }
    public Emp(String name, List<Project> projects, int eid) {
        this.name = name;
        this.projects = projects;
        this.eid = eid;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }
}
