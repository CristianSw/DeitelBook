package chapter6;
//Ex. 6.17
import java.util.Scanner;

public class EvenOrODd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.println("Enter please the number: ");
        while (scanner.hasNext()){
            number = scanner.nextInt();
            System.out.println("Is Even : " + isEven(number));
        }
    }

    public static boolean isEven(final int number) {
        if (number % 2 == 0)
            return true;
        else
            return false;
    }
}
