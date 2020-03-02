package chapter6;
//Ex.6.10
import java.util.Scanner;


public class RoundingNumbersAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number;
        double roundNumber;

        System.out.println("Please enter value:");
        while (scanner.hasNext()){
            number = scanner.nextDouble();
            System.out.println("Your Number is : " + number);
            roundNumber = roundToInteger(number);
            System.out.println("Round number to integer is : " + roundNumber);
            roundNumber = roundToTenths(number);
            System.out.println("Round number to tenths is : " + roundNumber);
            roundNumber = roundToHundredths(number);
            System.out.println("Round number to hundreds is : " + roundNumber);
            roundNumber = roundToThousandths(number);
            System.out.println("Round number to thousands is : " + roundNumber);
        }
    }
    public static double roundToInteger(final double number){
        return Math.floor(number + 0.5);
    }
    public static double roundToTenths(final double number){
        return Math.floor(number * 10 + 0.5) /10;
    }

    public static double roundToHundredths(final double number){
        return Math.floor(number * 100 + 0.5) /100;
    }
    public static double roundToThousandths(final double number){
        return Math.floor(number * 1000 + 0.5) /1000;
    }

}
