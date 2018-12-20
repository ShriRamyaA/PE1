import com.training.slackroute.PrintString;
import com.training.slackroute.VowelConsonant;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
//         PrimeNumbers primeNumbers= new PrimeNumbers();
//         String result=primeNumbers.findPrimeNumber(5);
//         System.out.println(result);

//        System.out.println("Please enter a number");
//           Scanner number=new Scanner(System.in);
//           int i=number.nextInt();
//
//           for(int j=1; j<=i; j++) {
//               for(int k=1;k<=j;k++){
//                   System.out.print(j);
//               }
//           }


//        int flag=0;
//        int oflag=1;
//        int sum=0;
//        System.out.println("Enter a number");
//        Scanner number=new Scanner(System.in);
//        String sNum=number.nextLine();
//        int length=sNum.length();
//
//        if((length%2)==0){
//            for(int j=0;j<(length/2);j++){
//              if (sNum.charAt(j)==sNum.charAt(length-(j+1))){
//                  flag+=1;
//                }
//              else
//                  break;
//            }
//            if(flag==(length/2)){
//
//            }
//        }
//        else{
//            for(int j=0;j<((length-1)/2);j++){
//                if(sNum.charAt(j)==sNum.charAt(length-(j+1))){
//                    oflag+=1;
//                }
//                else
//                    break;
//            }
//        }
//
//        for(int j=0;j<length;j++){
//            if(sNum.charAt(j)%2==0){
//                sum+=Character.getNumericValue(sNum.charAt(j));
//            }
//        }
//        if((flag==length/2)||(oflag>(length/2))){
//            System.out.print(sNum+" is a palindrome");
//            if(sum>25){
//                System.out.println(" and the sum of even number/s is "+sum+" and is greater than 25");
//            }
//            else{
//                System.out.println(" and the sum of even number/s is "+sum+" and is less than 25");
//            }
//        }
//        else {
//            System.out.println(sNum+" is not a  palindrome.");
//        }

//        System.out.println("Enter any integer");
//        Scanner num=new Scanner(System.in);
//        int check=num.nextInt();
//        if((check%2==0)&check>20&check<30){
//            System.out.println("Jerry");
//        }
//        else if(check>20&check<30){
//            System.out.println("Tom");
//        }

//        PrintString printStringObj=new PrintString();
//        String display=printStringObj.checkNumber(23);
//        System.out.println(display);


//        System.out.println("Enter any word");
//        Scanner word=new Scanner(System.in);
//        String check=word.nextLine();
//        for(int j=0;j<check.length();j++){
//            char ch=check.charAt(j);
//            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
//                System.out.print(ch+"-vowel ");
//            }
//            else{
//                System.out.print(ch+"-consonant ");
//            }
//        }

//        VowelConsonant vowelConsonantObj=new VowelConsonant();
//        StringBuilder display=vowelConsonantObj.checkLetter("Ramya");
//        System.out.println(display);

//
//        int sum=0;
//        String yes=null;
//        do {
//            try{
//            System.out.println("Enter any integer");
//            Scanner num = new Scanner(System.in);
//            int add=num.nextInt();
//            sum+=add;
//                System.out.println("Enter y to continue and n to abort");
//                Scanner no=new Scanner(System.in);
//                yes=no.nextLine();
//            }
//            catch (Exception e){
//                System.out.println("Please enter integer");
//            }
//
//        }while (yes.equals("y"));
//        System.out.println("The sum of all the numbers is "+

//        System.out.println("Enter any character");
//        Scanner check=new Scanner(System.in);
//        String display=check.nextLine();
//        char flag=display.charAt(0);
//        int ascii = (int) flag;
//        if(ascii>64&ascii<91){
//            System.out.println(display+" is a capital letter");
//        }
//        else if(ascii>96&ascii<123){
//            System.out.println(display+" is a small letter");
//        }
//        else if(ascii>47&ascii<58){
//            System.out.println(display+" is a number");
//        }
//        else{
//            System.out.println(display+" is a special character");
//        }

//        int sum=0;
//        System.out.println("Enter any number");
//        Scanner check=new Scanner(System.in);
//        String inputString=check.nextLine();
//        char tempArray[] = inputString.toCharArray();
//        Arrays.sort(tempArray);
//        System.out.print("Sorted number in the non-increasing order is: ");
//        for(int j=tempArray.length-1;j>=0;j--) {
//            if(tempArray[j]%2==0){
//                sum+=Character.getNumericValue(tempArray[j]);
//            }
//            System.out.print(tempArray[j]);
//        }
//        System.out.println("\n");
//        System.out.println("The sum of even numbers is "+sum);
//        if(sum>15){
//            System.out.println("True");
//        }
//        else{
//            System.out.println("False");
//        }

//        System.out.println("Enter any word");
//        Scanner word=new Scanner(System.in);
//        String check=word.nextLine();
//        for (int j=check.length()-1;j>=0;j--){
//            System.out.print(check.charAt(j));
//        }

//        int num=76;
//        int limit=100;
//        int flag;
//        do{
//            System.out.println("Guess the number between 1-"+limit);
//            Scanner guess=new Scanner(System.in);
//             flag=guess.nextInt();
//            if(flag<num){
//                System.out.println("The number is less than the target");
//            }
//            else if(flag>num){
//                System.out.println("The number is greater than the target");
//            }
//        }while (flag!=num);
//        System.out.println("You guessed it right!");

//        System.out.println("Enter any word");
//        Scanner word=new Scanner(System.in);
//        String pword=word.nextLine();
//        System.out.println("Enter any number that is less than the length of the word you entered");
//        Scanner num=new Scanner(System.in);
//        int pnum=num.nextInt();
//        char repeat[]=new char[pnum];
//        System.out.print(pword);
//        for(int j=0;j<pnum;j++) {
//            for (int i = pword.length() - pnum; i < pword.length(); i++) {
//                System.out.print(pword.charAt(i));
//            }
//        }
















           }
    }

