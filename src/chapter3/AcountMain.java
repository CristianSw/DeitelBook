package chapter3;

//Ex. 3.11 & 3.15
public class AcountMain {
    public static void main(String[] args) {
        Acount acount = new Acount("Cristian", 100);
        Acount acount1 = new Acount("Eugene", -10.07);

        displayAcountInfo(acount);
        displayAcountInfo(acount1);

        acount.deposit(2500);
        acount1.deposit(3000);

        System.out.println();
        displayAcountInfo(acount);
        displayAcountInfo(acount1);

        acount.withdraw(1000.965);
        acount1.withdraw(1263.2356);

        System.out.println();
        displayAcountInfo(acount);
        displayAcountInfo(acount1);

        acount.setName("Daniela");
        acount.deposit(1000);
        acount.withdraw(555.5);
        System.out.println();
        displayAcountInfo(acount);
    }

    private static void displayAcountInfo(Acount acount) {
        System.out.println("Acount owner is: " + acount.getName() + " and his balance is: " + acount.getBalance());
    }
}
