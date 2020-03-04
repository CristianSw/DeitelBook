package chapter6;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int first;
        int second;

        System.out.println("Enter please value for first and second number:");
        while (scanner.hasNext()){
            first = scanner.nextInt();
            second = scanner.nextInt();
            System.out.println("Is second number multiply of first number : " + isMultiple(first,second));
        }

    }
    public static boolean isMultiple(final int first, final int second){
        if (first%second == 0)
            return true;
        else
            return false;
    }
}
