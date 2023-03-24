import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size Of Array :");
        int sizeOfArray=sc.nextInt();

        int[] arr=new int[sizeOfArray];

        for(int i=0;i<sizeOfArray;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Normal Array :"+Arrays.toString(arr));

        int start=0;
        int end=sizeOfArray-1;

        while (start<end){
            //Swap Numbers
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

        System.out.println("Reverse Array :"+Arrays.toString(arr));

    }
}
