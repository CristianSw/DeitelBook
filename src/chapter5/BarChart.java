package chapter5;
//Ex. 5.16
import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1;
        int number2;
        int number3;
        int number4;
        int number5;
        System.out.println("Enter please 5 numbers between 1-30:");
        number1 = scanner.nextInt();
        number2 = scanner.nextInt();
        number3 = scanner.nextInt();
        number4 = scanner.nextInt();
        number5 = scanner.nextInt();

        printAsteriscs(number1);
        printAsteriscs(number2);
        printAsteriscs(number3);
        printAsteriscs(number4);
        printAsteriscs(number5);

    }

    private static void printAsteriscs(int number) {
        for (int i=0;i<number;i++){
            System.out.print("* ");
        }
        System.out.println();
    }
}
