package com.training.slackroute;

public class Letters {

    public String findLetterType(char character){
        String result;

        int ascii = (int) character;
        if(ascii>64&ascii<91){
           result=character+" is a capital letter";
        }
        else if(ascii>96&ascii<123){
            result=character+" is a small letter";
        }
        else if(ascii>47&ascii<58){
            result=character+" is a number";
        }
        else{
            result=character+" is a special character";
        }
        return result;
    }
}
