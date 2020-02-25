package practiceFromDeitel.chapter5;

import java.util.Scanner;

public class ValueOfPI {
    public static void main(String[] args) {
        double pi = 0;
        int terms;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of terms that participate in series");
        terms = scanner.nextInt();
        for (double i = 0; i < terms; i ++) {
            if(i%2 == 0) // if the remainder of `i/2` is 0
                pi += -1 / ( 2 * i - 1);
            else
                pi += 1 / (2 * i - 1);
        }
        System.out.println(pi);
    }
}
