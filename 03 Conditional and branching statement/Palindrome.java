import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //Taking input From User
        System.out.println("Enter Number or String to Check Palindrome:");
        String input=sc.nextLine();

        input=input.toLowerCase();

        //variable declaration
        int start=0;
        int end=input.length()-1;
        boolean isPalindrome=true;

        //Main Logic Two Pointer Method
        while(start<end){
            if(input.charAt(start)==input.charAt(end)){
             start++;
             end--;
            }else {
                isPalindrome=false;
                break;
            }
        }

        //Final Decision-making
        if(isPalindrome){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
