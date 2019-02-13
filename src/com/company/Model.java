package com.company;

public class Model {
    private String firstWord;
    private String secondWord;

    //Program logic

    // Method constructs the sentence from two words

    public String constructSentence(String firstWord,String secondWord){
        return firstWord+" "+secondWord;
    }
    // Getters and setters

    public String getFirstWord(){
        return firstWord;
    }

    public void setFirstWord(String firstWord){
        this.firstWord=firstWord;
    }

    public String getSecondWord()
    {
        return secondWord;
    }

    public void setSecondWord(String secondWord){
        this.secondWord=secondWord;
    }

}
