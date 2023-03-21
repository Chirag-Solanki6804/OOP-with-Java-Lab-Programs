import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //Taking Circle Radius From User
        System.out.print("Enter Radius of Circle:");
        double radius=sc.nextDouble();

        //Logic or calculation
        double area=Math.round(Math.PI*Math.pow(radius,2));

        //result Displaying
        System.out.println("Area of Circle :"+area);
    }
}
