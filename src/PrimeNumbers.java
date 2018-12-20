public class PrimeNumbers {

    private int flag=0;
    private int remainder=0;

    public String findPrimeNumber(int number) {
        remainder=number/2;
        if (remainder==0||remainder==1){
            return number+" is a prime number";
        }
        else {
            for(int i=2;i<number;i++){
                if(number%i==0){
                    flag=1;
                    break;
                }
            }
            if (flag==0)
                return number+" is a prime number";
            else
                return number+" is not a prime number";
        }

    }


}
