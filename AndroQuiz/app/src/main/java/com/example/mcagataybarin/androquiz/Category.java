package com.example.mcagataybarin.androquiz;

/**
 * Created by mcagataybarin on 2/26/17.
 */

/*
* This class is created for Category object and holds the questions and name of the category.*/
public class Category {
    String name;
    Question[] questions;

    public Category(String name, Question[] questions){
        this.name = name;
        this.questions = questions;
    }


}
