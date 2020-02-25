package chapter5;
//Ex. 5.15
public class TrianglePrinting {
    public static void main(String[] args) {
        boolean isTrue;
        int count;

        for (int i = 1; i <= 10; i++) {
            isTrue = true;
            count = 0;
            while (isTrue) {
                if (count != i) {
                    System.out.print("*");
                    System.out.print("\t");
                    count++;
                }
                if (count == i) {
                    isTrue = false;
                }
            }
            System.out.println();
        }
    }
}
