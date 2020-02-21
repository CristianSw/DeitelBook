package practiceFromDeitel.chapter5;

import java.util.Scanner;

public class Theory {
    public static void main(String[] args) {
        // While statement
        System.out.println("---------------- while statement");
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

//        For statement
        System.out.println("---------------- for statement");
        for (int j = 0; j <= 10; j++) {
            System.out.println(j);
        }

//        Calc sum from 9 to 20

        int total = 0;
        for (int counter = 9; counter < 20; counter++) {
            total += counter;
        }
        System.out.println("Sum: " + total);
        Interest interest = new Interest();
        interest.calcInterest();

//        Do-While for nums to 10
        System.out.println("---------------- do-while statement");
        int counter = 0;
        do {
            System.out.println(counter);
            counter++;
        } while (counter <= 10);
//        Letter grade
        LetterGrade letterGrade = new LetterGrade();
        letterGrade.gradesCalculator();
        letterGrade.gradeReport();
    }


    private static class Interest {
        public double amount;
        public static double PRINCIPAL = 1000;
        public static final double RATE = 0.05;


        public void calcInterest() {
            System.out.println("Year\t\tDeposit amount ");
            for (int year = 0; year <= 10; year++) {
                amount = PRINCIPAL * Math.pow(1.0 + RATE, year);
                System.out.println(year + "\t\t" + amount);
            }
        }
    }

    private static class LetterGrade {

        public int total = 0;
        public int gradeCounter = 0;
        public int counterA = 0;
        public int counterB = 0;
        public int counterC = 0;
        public int counterD = 0;
        public int counterE = 0;
        public int counterF = 0;

        Scanner scanner = new Scanner(System.in);

        public void gradesCalculator() {
            System.out.println("Enter grades from 0-100");
            while (scanner.hasNext()) {
                int grade = scanner.nextInt();
                total += grade;
                gradeCounter++;

                switch (grade / 10) {
                    case 9:
                    case 10:
                        counterA++;
                        break;
                    case 8:
                        counterB++;
                        break;
                    case 7:
                        counterC++;
                        break;
                    case 6:
                        counterD++;
                        break;
                    case 5:
                        counterE++;
                        break;
                    default:
                        counterF++;
                        break;
                }
            }
        }
        public void gradeReport(){
            if (gradeCounter != 0) {
                System.out.println("Grade report");
                System.out.println("Total: " + total);
                System.out.println("Average: " + total / gradeCounter);
                System.out.println("Number of grades introduced : " + gradeCounter);
                System.out.println("A grade: " + counterA);
                System.out.println("B grade: " + counterB);
                System.out.println("C grade: " + counterC);
                System.out.println("D grade: " + counterD);
                System.out.println("E grade: " + counterE);
                System.out.println("F grade: " + counterF);
            } else
                System.out.println("No grades was entered");
        }
    }
}
