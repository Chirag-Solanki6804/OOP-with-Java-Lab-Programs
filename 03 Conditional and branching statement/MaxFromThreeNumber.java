import java.util.Scanner;

public class MaxFromThreeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //Taking Three Number From User
        System.out.print("Enter Number 1 :");
        int numberOne=sc.nextInt();
        System.out.print("Enter Number 2 :");
        int numberTwo=sc.nextInt();
        System.out.print("Enter Number 3 :");
        int numberThree=sc.nextInt();

        //Main Logic
        if(numberOne>numberTwo){
            if (numberOne>numberThree){
                System.out.println(numberOne+" is Maximum Number");
            }else{
                System.out.println(numberThree+" is Maximum Number");
            }
        }else if(numberTwo>numberThree){
            System.out.println(numberTwo+" is Maximum Number");
        }else{
            System.out.println(numberThree+" is Maximum Number");
        }
    }
}
