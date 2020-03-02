package chapter6;
//Ex.6.9
import java.util.Scanner;

import static chapter6.RoundingNumbersAdvanced.roundToInteger;


public class RoundingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number;
        double roundNumber;

        System.out.println("Please enter value:");
        while (scanner.hasNext()){
            number = scanner.nextDouble();
            System.out.println("Your Number is : " + number);
            roundNumber = roundToInteger(number);
            System.out.println("Round number is : " + roundNumber);
        }
    }

}
