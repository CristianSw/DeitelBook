package chapter5;
//Ex. 5.17
import java.util.Scanner;

public class CalcSales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int productNumber;
        int quantitySold;

        double total = 0;
        double price1 = 1.23;
        double price2 = 2.63;
        double price3 = 24.93;
        double price4 = 12.53;
        double price5 = 15.3;

        System.out.println("First number is product number: ");
        System.out.println("Second number is quantity sold: ");
        while (scanner.hasNext()){
            productNumber = scanner.nextInt();
            quantitySold = scanner.nextInt();

            switch (productNumber) {
                case 1:
                    total = price1 * quantitySold;
                    System.out.println(total);
                    break;
                case 2:
                    total = price2 * quantitySold;
                    System.out.println(total);
                    break;
                case 3:
                    total = price3 * quantitySold;
                    System.out.println(total);
                    break;
                case 4:
                    total = price4 * quantitySold;
                    System.out.println(total);
                    break;
                case 5:
                    total = price5 * quantitySold;
                    System.out.println(total);
                    break;
            }
        }


    }
}

