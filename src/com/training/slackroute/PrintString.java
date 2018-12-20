package com.training.slackroute;



public class PrintString {


    public String checkNumber(int check) {
        if ((check % 2 == 0) & check > 20 & check < 30) {
            return "Jerry";
        } else if (check > 20 & check < 30) {
            return "Tom";
        }
        else {
            return null;
        }
    }
}
