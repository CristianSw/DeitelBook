package practiceFromDeitel.chapter2;

import java.util.Scanner;

//Ex. 2.15
public class Arithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        System.out.print("Introduceti 1 numar: ");
        num1 = scanner.nextInt();
        System.out.print("Introduceti 2 numar: ");
        num2 = scanner.nextInt();

        System.out.println("Sum : " + num1+num2);
        System.out.println("Product : " + num1*num2);
        System.out.println("Diference : " + (num1-num2));
        try {
            int division = num1 / num2;
            System.out.println("Division : " +division);
        } catch (ArithmeticException e){
            System.out.println("Devision by 0 is not allowed try again and be careful");
        }
        System.out.println("Mod : " + num1%num2);
    }
}
