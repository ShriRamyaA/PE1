package com.training.slackroute;

public class VowelConsonant {

    StringBuilder out=new StringBuilder();
    String result;

    public String checkLetter(String check){
        for(int j=0;j<check.length();j++){
            char ch=check.charAt(j);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                out.append(ch+"-vowel ");
            }
            else{
                out.append(ch+"-consonant ");
            }
        }
        result=out.toString();
        return result;
    }
}
