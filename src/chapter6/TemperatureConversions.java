package chapter6;
//Ex. 6.22
import java.util.Scanner;

public class TemperatureConversions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chooser;
        double temperature;

        System.out.println("Enter temperature in fahrenheit or in celsius");
        temperature = scanner.nextDouble();

        System.out.println("Enter 1 for display celsius equivalent of fahrenheit");
        System.out.println("Enter 2 for display fahrenheit equivalent of celsius");
        chooser = scanner.nextInt();
        switch (chooser){
            case 1 :
                System.out.println(celsius(temperature));
                break;
            case 2:
                System.out.println(fahrenheit(temperature));
                break;
            default:
                System.out.println("You could not choose correct variant try again! ");
        }
    }

    public static double celsius(final double fahrenheit) {
        return 5.0 / 9.0 * (fahrenheit - 32);
    }

    public static double fahrenheit(final double celsius) {
        return 9.0 / 5.0 * celsius + 32;
    }
}
