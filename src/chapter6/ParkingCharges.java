package chapter6;
//Ex6.8
import java.util.Scanner;


public class ParkingCharges {
    private static double price = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of hours stayed at parking");
        int hours = scanner.nextInt();
        Customer customer = new Customer(hours);

        System.out.println(calculateCharges(customer) + " $");

    }

    public static double calculateCharges(Customer customer) {
        if (customer.getHours() <= 3) {
            price = 2.0;
        } else if (customer.getHours()>3){
            price = 2.0;
            for (int i = 0; i < customer.getHours(); i++) {
                price += 0.5;
                if (customer.getHours() == 24){
                    price = 20;
                    return price;
                }
            }
        }
        return price;
    }

    private static class Customer {
        private int hours;

        public Customer(int hours) {
            this.hours = hours;
        }

        public int getHours() {
            return hours;
        }

        public void setHours(int hours) {
            this.hours = hours;
        }
    }
}
