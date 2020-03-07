package chapter6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReversingDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.print("Enter number : ");
        number = scanner.nextInt();

        display(number);

    }

    public static int restFromDivisionAToB(final int a, final int b) {
        return a % b;
    }

    public static int quotientAToB(final int a, final int b) {
        return a / b;
    }

    public static void display(final int number) {
        int inter = number;
        boolean isTrue = true;
        List<Integer> reverse = new ArrayList<>();

        while (isTrue) {
            reverse.add(restFromDivisionAToB(inter, 10));
            inter = quotientAToB(inter, 10);
            if (inter <= 0) {
                isTrue = false;
            }
        }

        System.out.println(reverse);
    }
}
