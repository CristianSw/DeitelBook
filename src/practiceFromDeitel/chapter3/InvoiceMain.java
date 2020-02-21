package practiceFromDeitel.chapter3;
//Ex. 3.12
public class InvoiceMain {
    public static void main(String[] args) {
        Invoice order1 = new Invoice("one","Oppo Find X", 5,600.99);
        Invoice order2 = new Invoice("two","Redmi Note 7", 10,400.23);
        Invoice faultOrder = new Invoice("three","Mi 9T",-2,999.99);
        Invoice faultOrder2 = new Invoice("four","Huawei P20 lite",6,-200);

        System.out.println("Total price per order one is: " + order1.getInvoiceAmount());
        System.out.println("Total price per order two is: " + order2.getInvoiceAmount());

        System.out.println("Total price per fault order one is: " + faultOrder.getInvoiceAmount());
        System.out.println("Total price per fault order two is: " + faultOrder2.getInvoiceAmount());

    }
}
