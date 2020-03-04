package chapter6;
// Ex. 6.20
import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius;
        double circleAreas;

        System.out.println("Enter please radius of circle : ");
        radius = scanner.nextDouble();
        circleAreas = circleArea(radius);
        System.out.println("Circle area is : " + circleAreas);

    }

    public static double circleArea(final double radius) {
        return 2 * Math.PI * radius;
    }
}
