package chapter5;
//Ex. 5.14
import java.util.Scanner;

public class CompoundInterest {

    public static double PRINCIPAL = 1000;

    public static void main(String[] args) {
        double amount;
        double rate;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter deposit: ");
        amount = scanner.nextDouble();
        System.out.print("Enter rate: ");
        while(scanner.hasNext()) {
            System.out.println("Enter rate: ");
            rate = scanner.nextDouble();

            System.out.println("Year\t\tDeposit amount ");
            for (int year = 0; year <= 10; year++) {
                amount = PRINCIPAL * Math.pow(1.0 + rate, year);
                System.out.println(year + "\t\t" + amount);
            }
        }

    }
}

