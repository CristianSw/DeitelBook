package chapter6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//Ex. 6.21
public class SeparatingDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.println("Enter please a number: ");
        number = scanner.nextInt();
        displayNumber(number);

    }

    public static int restFromDivisionAToB(final int a, final int b) {
        return a % b;
    }

    public static int quotientAToB(final int a, final int b) {
        return a / b;
    }

    public static void displayNumber(final int number){
        int intermediate = number;
        boolean isTrue = true;
        List<Integer> reverse = new ArrayList<>();

        while(isTrue){
           reverse.add(restFromDivisionAToB(intermediate,10));
            intermediate = quotientAToB(intermediate,10);
            if (intermediate <= 0){
                isTrue = false;
            }
        }

        Collections.reverse(reverse);
        System.out.println(reverse);
    }
}
