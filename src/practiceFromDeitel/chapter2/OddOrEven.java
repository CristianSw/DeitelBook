package practiceFromDeitel.chapter2;

import java.util.Scanner;

//Ex 2.25
public class OddOrEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.print("Enter nummber : ");
        number = scanner.nextInt();

        oddOrEven(number);
    }

    public static void oddOrEven(int number) {
        if (number % 2 == 0) {
            System.out.println("Number is Odd!");
        } else
            System.out.println("Number is Even");
    }
}