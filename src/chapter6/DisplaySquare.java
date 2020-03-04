package chapter6;

import java.util.Scanner;
//Ex.6.18, 6.19
public class DisplaySquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        char symbol;

        System.out.println("Enter number : ");
        number = scanner.nextInt();
        System.out.println("Enter symbol square composed by: ");
        symbol = scanner.next().charAt(0);
        squareOf(number,symbol);

    }

    public static void squareOf(final int number, final char symbol) {
        if (number > 0) {
            for (int y = 0; y < number; y++) {
                for (int i = 1; i <= number; i++) {
                    System.out.print(symbol + "\t");
                }
                System.out.println();
            }
        } else
            System.out.println("Number should be > 0");
    }
}
