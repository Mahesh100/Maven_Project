package com.tut.entity.OneToOne_OneToMany;

import javax.persistence.*;
import java.util.List;

@Entity
public class Question {
    @Id
    private int question_id;
    private String question;
/*
    One-to-One relationship  (One question have only one answer.)
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Id_of_answer")      //for renaming
    private Answer answer;

 */

    /*
    One-To-Many relationship ( One question have many answers )

     */
    @OneToMany (mappedBy = "question", fetch = FetchType.EAGER)
  //  @JoinColumn(name = "Id_of_answer")      //for renaming
    private List<Answer> answer;



    public  Question(){
        super();
    }

    public Question(int question_id, String question,List<Answer> answer) {
        this.question_id = question_id;
        this.question = question;
        this.answer = answer;

    }

    public List<Answer> getAnswer() {
        return answer;
    }

    public void setAnswer(List<Answer> answer) {
        this.answer = answer;
    }

    public int getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(int question_id) {
        this.question_id = question_id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return "Question{" +
                "question_id=" + question_id +
                ", question='" + question + '\'' +
                '}';
    }


}
