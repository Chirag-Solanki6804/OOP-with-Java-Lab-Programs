import java.util.Scanner;

public class StudentDivision {
    public static void main(String[] args) {
        //Taking Marks of All Subject From Student

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter marks of Maths :");
        float mathsMarks=sc.nextFloat();
        System.out.print("Enter marks of Physics :");
        float physicsMarks=sc.nextFloat();
        System.out.print("Enter marks of Chemistry :");
        float chemistryMarks=sc.nextFloat();
        System.out.print("Enter marks of English :");
        float englishMarks=sc.nextFloat();
        System.out.print("Enter marks of Computer :");
        float computerMarks=sc.nextFloat();

        //Percentage calculation of Student for Division

        double percentage=Math.round((mathsMarks+physicsMarks+chemistryMarks+englishMarks+computerMarks)/5);

        //Division distribution

        if(percentage>=60){
            System.out.println("You Are in First Division.Your Percentage is "+percentage+"%");
        }else if(percentage>=50){
            System.out.println("You Are in Second Division.Your Percentage is "+percentage+"%");
        }else if(percentage>=40){
            System.out.println("You Are in Third Division.Your Percentage is "+percentage+"%");
        }else{
            System.out.println("You Are Fail!!");
        }
    }
}
