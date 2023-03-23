import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //Taking input From User
        System.out.print("Enter Number To Check Prime Number :");
        int number=sc.nextInt();

        //Main Logic To check Prime
        boolean isPrime=true;
        if(number==0 || number==1){
            System.out.println(number+" is Not Prime Number");
        }else{
            for(int i=2;i<number/2;i++){
                if(number%i==0){
                    isPrime=false;
                    break;
                }
            }
        }

        //Final Decision-making
        if(isPrime){
            System.out.println(number+" is Prime Number");
        }else{
            System.out.println(number+" is Not Prime Number");
        }


    }
}
