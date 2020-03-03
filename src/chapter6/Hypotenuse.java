package chapter6;
//Ex. 6.15
import java.util.Scanner;

public class Hypotenuse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double side1;
        double side2;

        System.out.println("Enter side 1 after side 2:");
        side1 = scanner.nextDouble();
        side2 = scanner.nextDouble();
        System.out.println(hypotenuseCalc(side1,side2));
    }

    public static double hypotenuseCalc(final double side1, final double side2) {
        return  Math.sqrt(Math.pow(side1,2) + Math.pow(side2,2));
    }
}
