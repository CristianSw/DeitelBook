package chapter3;
//Ex. 3.13
public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Daniela","Tanas",2002);
        Employee emp2 = new Employee("Cristian","Dolinta",12500);

        System.out.println("Yearly salary for: " + emp1.getFirstName() + " is " + emp1.calcSalary(12));
        System.out.println("Yearly salary for: " + emp2.getFirstName() + " is " + emp2.calcSalary(12));

        emp1.raizeSalary(0.1);
        emp2.raizeSalary(0.2);

        System.out.println("Raized salary emp1: " + emp1.getSalary());
        System.out.println("Raized salary emp2: " + emp2.getSalary());

    }
}
