package com.training.slackroute;

import java.util.Scanner;

public class Palindrome {
    int flag=0;
    int oflag=1;
    int sum=0;
    boolean isPalindrome;
    boolean isSumMoreThanLimit;
    StringBuilder result=new StringBuilder();

    public String checkPalindrome(String sNum){

        int length=sNum.length();

        if((length%2)==0){
            for(int j=0;j<(length/2);j++){
                if (sNum.charAt(j)==sNum.charAt(length-(j+1))){
                    flag+=1;
                }
                else
                    break;
            }
            if(flag==(length/2)){

            }
        }
        else{
            for(int j=0;j<((length-1)/2);j++){
                if(sNum.charAt(j)==sNum.charAt(length-(j+1))){
                    oflag+=1;
                }
                else
                    break;
            }
        }

        for(int j=0;j<length;j++){
            if(sNum.charAt(j)%2==0){
                sum+=Character.getNumericValue(sNum.charAt(j));
            }
        }
        if((flag==length/2)||(oflag>(length/2))){
            isPalindrome=true;
            result.append(isPalindrome);
            result.append(" ");
            if(sum>25){
                isSumMoreThanLimit=true;
                result.append(isSumMoreThanLimit);
            }
            else{
                isSumMoreThanLimit=false;
                result.append(isSumMoreThanLimit);
            }
        }
        else {
            isPalindrome=false;
            result.append(isPalindrome);
        }
return result.toString();
    }
}
