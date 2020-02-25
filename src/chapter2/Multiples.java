package chapter2;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;

        System.out.print("Enter 1 number: ");
        num1 = scanner.nextInt();
        System.out.print("Enter 2 number: ");
        num2 = scanner.nextInt();
        multiples(num1, num2);
    }

    public static void multiples(int number1, int number2) {
        if (number1 % number2 == 0) {
            System.out.println("Number 1 multiples of nummber 2");
        } else
            System.out.println("Is not multiply");
    }
}