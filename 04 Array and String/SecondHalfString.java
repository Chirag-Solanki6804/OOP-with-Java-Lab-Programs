import java.util.Scanner;

public class SecondHalfString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any String :");
        String str=sc.nextLine();

        System.out.println("Length Of String :"+str.length());

        System.out.println("Second Half Of String :"+str.substring(str.length()/2));
    }
}
