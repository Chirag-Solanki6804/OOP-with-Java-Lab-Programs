import java.util.Scanner;

public class TemperatureConverter {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //Taking Temperature in Fahrenheit From User
        System.out.print("Enter Temperature in Fahrenheit :");
        double temperatureInFahrenheit=sc.nextDouble();

        //Logic
        double temperatureInCelsius= (((temperatureInFahrenheit-32)*5)/9);

        //result Displaying
        System.out.println(temperatureInFahrenheit+"F"+"=="+temperatureInCelsius+"C");
    }
}
