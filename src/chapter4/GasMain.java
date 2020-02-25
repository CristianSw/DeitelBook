package chapter4;
//Ex. 4.17
import java.util.Scanner;

public class GasMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GasMilienage gasMilienage = new GasMilienage(0,0);

        while(gasMilienage.getMiles() != -1 || gasMilienage.getGallons() != -1){
            System.out.println("Enter number of miles or -1 to exit:");
            gasMilienage.setMiles(scanner.nextDouble());
            System.out.println("Enter number of gallons or -1 to exit:");
            gasMilienage.setGallons(scanner.nextDouble());
            if (gasMilienage.getMiles() != -1 || gasMilienage.getGallons() != -1) {
                gasMilienage.setTotalMiles(gasMilienage.getTotalMiles() + gasMilienage.getMiles());
                gasMilienage.setTotalGalons(gasMilienage.getTotalGalons() + gasMilienage.getGallons());
                System.out.println("Miles per gallons for the current part is : " + gasMilienage.getMiles() / gasMilienage.getGallons());
            }
        }
        System.out.println("Total miles: " + gasMilienage.getTotalMiles());
        System.out.println("Total gallons: " + gasMilienage.getTotalGalons());
        System.out.println("Total miles per gallon spent on  trip : " + gasMilienage.getTotalMiles()/gasMilienage.getTotalGalons());

    }
}
