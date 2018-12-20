package com.training.slackroute;

public class Repeat {
    public String repeatString(int pnum, String pword) {
        StringBuilder result=new StringBuilder();

        char repeat[]=new char[pnum];
        result.append(pword);
        for(int j=0;j<pnum;j++) {
            for (int i = pword.length() - pnum; i < pword.length(); i++) {
                result.append(pword.charAt(i));
            }
        }
        return result.toString();
    }
}
