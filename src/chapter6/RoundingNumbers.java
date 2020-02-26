package chapter6;
//Ex.6.9
import java.util.Scanner;


public class RoundingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number;
        double roundNumber;

        System.out.println("Please enter value:");
        while (scanner.hasNext()){
            number = scanner.nextDouble();
            System.out.println("Your Number is : " + number);
            roundNumber = roundNumber(number);
            System.out.println("Round number is : " + roundNumber);
        }
    }

    public static double roundNumber(final double number){
        double y = Math.floor(number + 0.5);
        return y;
    }
}
