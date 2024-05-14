package com.tut.entity.EmbeddableExe;

import javax.persistence.Embeddable;

@Embeddable
public class Certificate {
    
    String Course;
    String duration;

    public  Certificate(){
        super();
    }

    public Certificate(String course, String duration) {
        Course = course;
        this.duration = duration;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getCourse() {
        return Course;
    }

    public void setCourse(String course) {
        Course = course;
    }
}
