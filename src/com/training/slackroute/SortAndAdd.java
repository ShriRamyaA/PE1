package com.training.slackroute;

import java.util.Arrays;

public class SortAndAdd {

    public String decreseSort(String inputString){

        StringBuilder orderNum=new StringBuilder();
        char tempArray[] = inputString.toCharArray();
        Arrays.sort(tempArray);

        for(int j=tempArray.length-1;j>=0;j--) {
            orderNum.append(tempArray[j]);
        }
        return orderNum.toString();
    }

    public String addEven(String inputString){
        int sum=0;
        StringBuilder orderNum=new StringBuilder();
        char tempArray[] = inputString.toCharArray();
        Arrays.sort(tempArray);

        for(int j=tempArray.length-1;j>=0;j--) {
            if(tempArray[j]%2==0){
                sum+=Character.getNumericValue(tempArray[j]);
            }
        }

        orderNum.append("The sum of even numbers is "+sum+" ");
        if(sum>15){
            orderNum.append("True");
        }
        else{
            orderNum.append("False");
        }
        return orderNum.toString();
    }
}
