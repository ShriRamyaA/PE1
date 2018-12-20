package com.training.slackroute;

import java.util.Scanner;

public class Palindrome {
    int flag=0;
    int oflag=1;
    int sum=0;
    boolean isPalindrome;
    boolean isSumMoreThanLimit;

    public void checkPalindrome(){
        System.out.println("Enter a number");
        Scanner number=new Scanner(System.in);
        String sNum=number.nextLine();
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
            System.out.print(sNum+" is a palindrome");
            if(sum>25){
                System.out.println(" and the sum of even number/s is "+sum+" and is greater than 25");
            }
            else{
                System.out.println(" and the sum of even number/s is "+sum+" and is less than 25");
            }
        }
        else {
            System.out.println(sNum+" is not a  palindrome.");
        }

    }
}
