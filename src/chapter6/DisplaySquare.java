package chapter6;

import java.util.Scanner;

public class DisplaySquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.println("Enter number : ");
        number = scanner.nextInt();
        squareOfAsterisks(number);

    }

    public static void squareOfAsterisks(final int number) {
        if (number > 0) {
            for (int y = 0; y < number; y++) {
                for (int i = 1; i <= number; i++) {
                    System.out.print("*\t");
                }
                System.out.println();
            }
        } else
            System.out.println("Number should be > 0");
    }
}
