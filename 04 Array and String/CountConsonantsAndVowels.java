import java.util.Scanner;

public class CountConsonantsAndVowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //Taking String Input From User
        System.out.print("Enter Any String :");
        String inputString=sc.nextLine();

        //Variables
        inputString=inputString.toLowerCase();
        int vowel=0;
        int consonant=0;

        //Main Logic
        for(int i=0;i<inputString.length();i++){
            if(inputString.charAt(i)=='a'|| inputString.charAt(i)=='e'|| inputString.charAt(i)=='i'|| inputString.charAt(i)=='o'|| inputString.charAt(i)=='u'){
                vowel++;
            }else{
                consonant++;
            }
        }

        //Final Statement
        System.out.println(inputString+" String Have "+vowel+" vowels and "+consonant+" Consonants");
    }
}
