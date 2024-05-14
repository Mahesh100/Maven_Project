package com.tut.entity;

import net.bytebuddy.implementation.bind.annotation.Super;

import javax.persistence.*;

@Entity
public class Answer {

    @Id
    private int answer_id;
    private String answer;

    public Answer(){
        super();
    }

    public int getAnswer_id() {
        return answer_id;
    }

    public void setAnswer_id(int answer_id) {
        this.answer_id = answer_id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Answer(int answer_id, String answer) {
        this.answer_id = answer_id;
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "answer_id=" + answer_id +
                ", answer='" + answer + '\'' +
                '}';
    }
/*
    @OneToOne(mappedBy = "answer")
    @JoinColumn(name = "question_id")

 */
    @ManyToOne
    private Question question;

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
}
