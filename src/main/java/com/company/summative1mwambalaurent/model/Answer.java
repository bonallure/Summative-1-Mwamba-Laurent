package com.company.summative1mwambalaurent.model;


/**
 * Created by bonallure on 9/30/21
 */
public class Answer {

    private static int answerId = 0;
    private int id;
    private String question;
    private String answer;

    public Answer(){
        this.id = answerId++;
    }

    public Answer(String answer){
        this.answer = answer;
        this.id = answerId++;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
