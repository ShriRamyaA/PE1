package com.training.slackroute;

public class Guess {

    public String guessNum(int flag){

        int num=76;
        int limit=100;

        do{
            if(flag<num){
                return "The number is less than the target";
            }
            else if(flag>num){
                return  "The number is greater than the target";
            }
        }while (flag!=num);
        return  "You guessed it right!";
    }
}
