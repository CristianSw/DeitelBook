package chapter6;

import java.util.Scanner;

public class MaximumFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double first, second, third;
        double result;

        System.out.println("Enter 3 numbers: ");
        first = scanner.nextDouble();
        second = scanner.nextDouble();
        third = scanner.nextDouble();

        result = maximum(first, second, third);

        System.out.println("Result is : " + result);

    }

    public static double maximum(final double first, final double second, final double third) {
        double localMax;
        localMax = Math.max(first, second);
        if (localMax > third) {
            return localMax;
        } else {
            return third;
        }
    }
}
