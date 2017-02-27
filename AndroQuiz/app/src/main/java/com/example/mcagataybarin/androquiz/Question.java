package com.example.mcagataybarin.androquiz;

/**
 * Created by mcagataybarin on 2/26/17.
 */

public class Question {
    String question;
    String[] choices = new String[4];
    int answer, point, status=3;
    // 0-> false, 1-> true, 2-> no time, 3-> not opened

    public Question(String question, String[] choices, int answer, int point){
        this.question = question;
        this.choices = choices;
        this.answer = answer;
        this.point = point;
    }

    public int makeChoice(int index){
        if (index == answer) {
            this.status = 1;
            QuestionData.getInstance().incrementPoint(this.point);
        }
        else
            this.status = 0;
        return this.status;
    }

    public void timeIsUp(){
        this.status = 2;
    }

}
