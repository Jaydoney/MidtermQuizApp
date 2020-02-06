package com.example.assignment1;

class Question {
    private String question;
    private String answer;

    public Question(String theQuestion){
        //question is expected to be of the form:
        //"Is Java an Object-Oriented Language?[Yes]"
        int index = theQuestion.indexOf("(");
        question = theQuestion.substring(0,index);
        answer = theQuestion.substring(index+1,theQuestion.length()-1);
    }
    public String getQuestion(){
        return question;
    }
    public String getAnswer(){
        return answer;
    }
}
