package com.training.slackroute;

public class Iteration {

    StringBuilder out=new StringBuilder();
    String result;

    public String printIteration(int i) {
        for (int j = 1; j <= i; j++) {
            for (int k = 1; k <= j; k++) {
                out.append(j);
            }
        }
        result=out.toString();
        return result;
    }
}
