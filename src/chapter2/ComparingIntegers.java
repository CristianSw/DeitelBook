package chapter2;
//Ex. 2.16
import java.util.Scanner;

public class ComparingIntegers {
    public static void main(String[] args) {
    Compare compare = new Compare();
    compare.compareNumbers();
    }

    public static class Compare {
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;

        private void getNumFromKeyboard() {
            System.out.print("Introduceti 1 numar: ");
            num1 = scanner.nextInt();
            System.out.print("Introduceti 2 numar: ");
            num2 = scanner.nextInt();
        }
        public void compareNumbers(){
            getNumFromKeyboard();
            if (num1==num2)
                System.out.println("Equals");
            if (num1!=num2)
                System.out.println("Not equals");
            if (num1>=num2)
                System.out.println("Bigger or the same");
            if (num1<=num2)
                System.out.println("Smaller or the same");
            if (num1 > num2)
                System.out.println("Bigger");
            if (num1<num2)
                System.out.println("Smaller");
        }
    }
}
