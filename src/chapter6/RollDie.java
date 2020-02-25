package chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class RollDie {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        Scanner scanner = new Scanner(System.in);

        int frequency1 = 0;
        int frequency2 = 0;
        int frequency3 = 0;
        int frequency4 = 0;
        int frequency5 = 0;
        int frequency6 = 0;

        int roll;

        System.out.print("Enter number of roll of a die: ");
        roll = scanner.nextInt();

        for (int i = 0; i<roll;i++){
            int face = 1 + random.nextInt(6);

            switch(face){
                case 1:
                    ++frequency1;
                    break;
                case 2:
                    ++frequency2;
                    break;
                case 3:
                    ++frequency3;
                    break;
                case 4:
                    ++frequency4;
                    break;
                case 5:
                    ++frequency5;
                    break;
                case 6:
                    ++frequency6;
                    break;
            }
        }
        System.out.println("Face frequency : ");
        System.out.println("1 : " + frequency1);
        System.out.println("2 : " + frequency2);
        System.out.println("3 : " + frequency3);
        System.out.println("4 : " + frequency4);
        System.out.println("5 : " + frequency5);
        System.out.println("6 : " + frequency6);


    }
}
