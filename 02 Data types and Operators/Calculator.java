import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number 1 :");
        int num1=sc.nextInt();
        System.out.print("Enter Number 2 :");
        int num2=sc.nextInt();
        System.out.print("Enter Operation :");
        String operation=sc.next();
        int result=0;

        switch (operation) {
            case "+" -> result = num1 + num2;
            case "-" -> result = num1 - num2;
            case "*" -> result = num1 * num2;
            case "/" -> result = num1 / num2;
            default -> System.out.println("Enter Valid operation");
        }

        System.out.println("Sum of "+num1+""+operation+""+num2+"="+result);
    }
}
