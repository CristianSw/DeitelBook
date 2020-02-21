package practiceFromDeitel.chapter2;

import java.util.Scanner;
//Ex. 2.17
public class ArithmeticSmallestAndLarger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Compare compare = new Compare();
        int num1;
        int num2;
        int num3;

        System.out.print("Enter 1 num : ");
        num1 = scanner.nextInt();
        System.out.print("Enter 2 num : ");
        num2 = scanner.nextInt();
        System.out.print("Enter 3 num : ");
        num3 = scanner.nextInt();

        System.out.println("Sum : " + compare.sum(num1, num2, num3));
        System.out.println("Average : " + compare.average(num1, num2, num3));
        System.out.println("Product : " + compare.product(num1, num2, num3));
        System.out.println("Smallest : " + compare.whoIsSmallest(num1, num2, num3));
        System.out.println("Bigger : " + compare.whoIsBigger(num1, num2, num3));


    }

    private static class Compare {

        public int sum(int a, int b, int c) {
            return a + b + c;
        }

        public int average(int a, int b, int c) {
            return (a + b + c) / 3;
        }

        public int product(int a, int b, int c) {
            return a * b * c;
        }

        public int whoIsSmallest(int a, int b, int c) {
            if (a < b && a < c)
                return a;
            else if (b < a && b < c)
                return b;
            else if (c < a && c < b)
                return c;
            else return 0;
        }
        public int whoIsBigger(int a, int b, int c){
            if (a > b && a > c)
                return a;
            else if (b > a && b > c)
                return b;
            else if (c > a && c > b)
                return c;
            else return 0;
        }
    }
}
