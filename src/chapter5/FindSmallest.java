package chapter5;
//Ex. 5.11
import java.util.Scanner;

public class FindSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int smallest;
        System.out.println("Enter values:");
        int number = scanner.nextInt();
        smallest = number;
        while (scanner.hasNext()) {
            number = scanner.nextInt();
            if (number < smallest) {
                smallest = number;
            }
        }
        System.out.println("Smallest: " + smallest);
    }
}
