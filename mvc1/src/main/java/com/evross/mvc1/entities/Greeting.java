package com.evross.mvc1.entities;

public class Greeting {
    private String message;
    private int score;

    public Greeting(){}

    public Greeting(String message){
        this.message = message;
        this.score = 42;
    }

    public String getMessage(){
        return message;
    }

    public void setMessage(String message){
        this.message = message;
    }

    public int getScore(){
        return score;
    }

    public void setScore(Integer score){
        this.score = score;
    }
}
