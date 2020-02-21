package practiceFromDeitel.chapter2;

import java.util.Scanner;

public class ProductOfThreeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalcProduct product = new CalcProduct();
        int num1;
        int num2;
        int num3;

        System.out.print("Introduceti 1 numar: ");
        num1 = scanner.nextInt();
        System.out.print("Introduceti 2 numar: ");
        num2 = scanner.nextInt();
        System.out.print("Introduceti 3 numar: ");
        num3 = scanner.nextInt();

        System.out.println("Prod = " + product.prod(num1,num2,num3));


    }

    private static class CalcProduct {


        public int prod(int a, int b, int c) {
            return a * b * c;
        }
    }
}
