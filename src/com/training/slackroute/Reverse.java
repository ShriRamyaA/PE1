package com.training.slackroute;

public class Reverse {
    public String reverseString(String check){

        StringBuilder word=new StringBuilder();

        for (int j=check.length()-1;j>=0;j--){
            word.append(check.charAt(j));
        }
        return word.toString();
    }
}
