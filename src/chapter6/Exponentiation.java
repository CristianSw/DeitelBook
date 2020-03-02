package chapter6;

import java.util.Scanner;

public class Exponentiation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base;
        int exponent;
        int verifyExponent;
        int result;

        System.out.println("Enter value for base after for exponent: ");
        base = scanner.nextInt();
        verifyExponent = scanner.nextInt();
        if (verifyExponent > 0) {
            exponent = verifyExponent;
            System.out.println("Base : " + base);
            System.out.println("Exponent : " + exponent);
            result = integerPower(base, exponent);
            System.out.println("Result is : " + result);
        }else
            System.out.println("Exponent need to be positive!");

    }

    public static int integerPower(final int base, final int exponent) {
        int result = base;
        for (int i = 1; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
}
