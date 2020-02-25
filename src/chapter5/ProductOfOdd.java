package chapter5;
//Ex. 5.12
public class ProductOfOdd {
    public static void main(String[] args) {
        int productTotal = 1;

        for (int i = 1; i <= 15; i++) {
            if (i % 2 == 0) {
                productTotal *=i;
            }
        }
        System.out.println("Total is: " + productTotal);
    }
}
