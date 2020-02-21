package practiceFromDeitel.chapter2;
//Ex. 2.24
import java.util.Scanner;

public class LargestAndSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1;
        int num2;
        int num3;
        int num4;
        int num5;
        int num6;


        System.out.print("Enter 1 num : ");
        num1 = scanner.nextInt();
        System.out.print("Enter 2 num : ");
        num2 = scanner.nextInt();
        System.out.print("Enter 3 num : ");
        num3 = scanner.nextInt();
        System.out.print("Enter 4 num : ");
        num4 = scanner.nextInt();
        System.out.print("Enter 5 num : ");
        num5 = scanner.nextInt();
        System.out.print("Enter 6 num : ");
        num6 = scanner.nextInt();

        System.out.println("Lower is : " + lower(num1, num2, num3, num4, num5, num6));
        System.out.println("Higher is : " + higher(num1, num2, num3, num4, num5, num6));


    }

    public static int lower(int num1, int num2, int num3, int num4, int num5, int num6) {
        if (num1 < num2 && num1 < num3 && num1 < num4 && num1 < num5 && num1 < num6)
            return num1;
        else if (num2 < num1 && num2 < num3 && num2 < num4 && num2 < num5 && num2 < num6)
            return num2;
        else if (num3 < num1 && num3 < num2 && num3 < num4 && num3 < num5 && num3 < num6)
            return num3;
        else if (num4 < num1 && num4 < num2 && num4 < num3 && num4 < num5 && num4 < num6)
            return num4;
        else if (num5 < num1 && num5 < num2 && num5 < num3 && num5 < num4 && num5 < num6)
            return num5;
        else if (num6 < num1 && num6 < num2 && num6 < num3 && num6 < num4 && num6 < num5)
            return num6;
        else return 0;
    }

    public static int higher(int num1, int num2, int num3, int num4, int num5, int num6) {
        if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5 && num1 > num6)
            return num1;
        else if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5 && num2 > num6)
            return num2;
        else if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5 && num3 > num6)
            return num3;
        else if (num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5 && num4 > num6)
            return num4;
        else if (num5 > num1 && num5 > num2 && num5 > num3 && num5 > num4 && num5 > num6)
            return num5;
        else if (num6 > num1 && num6 > num2 && num6 > num3 && num6 > num4 && num6 > num5)
            return num6;
        else return 0;
    }
}
