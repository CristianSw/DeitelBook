package practiceFromDeitel.chapter5;
//Ex.5.13
import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Input n: ");
        n = scanner.nextInt();

        double total = 1;

        for (int i = 1; i <= n; i++) {
            total *= i;
            System.out.println("Factorial from " + i + " is: " + total);
        }
    }
}

