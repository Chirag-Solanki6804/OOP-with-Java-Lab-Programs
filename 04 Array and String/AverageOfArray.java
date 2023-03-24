import java.util.Scanner;

public class AverageOfArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size Of Array :");
        int sizeOfArray=sc.nextInt();

        int[] arr=new int[sizeOfArray];

        int total=0;
        for(int i=0;i<sizeOfArray;i++){
            arr[i]=sc.nextInt();
            total+=arr[i];
        }

        System.out.println("Total of Array :"+total);
        System.out.println("Average of Array :"+(total/sizeOfArray));

    }
}
