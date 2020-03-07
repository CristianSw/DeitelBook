package chapter6;
//Ex. 6.23
import java.util.Scanner;

public class FindMinimum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double first, second, third;

        System.out.println("Enter please first, second and third number:");
        first = scanner.nextDouble();
        second = scanner.nextDouble();
        third = scanner.nextDouble();

        System.out.println("Minimum is : " + minimum3(first,second,third));
    }
    public static double minimum3(final double first, final double second, final double third){
        return Math.min(third,Math.min(first,second));
    }
}
