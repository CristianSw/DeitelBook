package practiceFromDeitel.chapter4;
//Ex. 4.19
import java.util.Scanner;

public class SalesMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SalesPerson employee1 = new SalesPerson("John",200,0.09);
        boolean isTrue = true;
        int iterator = 1;

        System.out.println("Please enter " + employee1.getName() + "'s sold item price per week. -1 for exit.");
        while (isTrue){
            System.out.print(iterator + "\t");
            double price= scanner.nextDouble();
            if (price == -1){
                isTrue = false;
            }else {
                employee1.setSoldItemPrice(price);
                employee1.setSoldItemsTotal(employee1.getSoldItemsTotal() + employee1.getSoldItemPrice());
                iterator++;
            }
        }
        System.out.println("Total sold items price : "+employee1.getSoldItemsTotal());
        double finalSalary = employee1.getSoldItemsTotal() * employee1.getGrossSales() + employee1.getBaseSalary();
        employee1.setFinalSalary(finalSalary);
        System.out.println("Gross sales earnings : " + employee1.getSoldItemsTotal() * employee1.getGrossSales());
        System.out.println("Final salary : " + employee1.getFinalSalary());

    }
}
