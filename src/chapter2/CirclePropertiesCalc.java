package chapter2;
//Ex. 2.28
import java.util.Scanner;

public class CirclePropertiesCalc {
    static final double PI = Math.PI;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r;

        System.out.print("Give the radius: ");
        r = scanner.nextInt();

        System.out.println("Diameter : " + diameter(r));
        System.out.println("Circumference : " + circumference(r));
        System.out.println("Area : " + area(r));

    }

    public static double diameter(int r) {
        return 2 * r;
    }

    public static double circumference(int r){
        return 2*PI*r;
    }

    public static double area(int r){
        return PI*Math.pow(r,2);
    }
}
