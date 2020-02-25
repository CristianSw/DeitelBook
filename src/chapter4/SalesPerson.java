package practiceFromDeitel.chapter4;

public class SalesPerson {
    private String name;
    private int baseSalary;
    private double finalSalary;
    private double grossSales ;
    private double soldItemPrice;
    private double soldItemsTotal;

    public SalesPerson(String name, int baseSalary, double grossSales) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.grossSales = grossSales;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public double getSoldItemPrice() {
        return soldItemPrice;
    }

    public void setSoldItemPrice(double soldItemPrice) {
        this.soldItemPrice = soldItemPrice;
    }

    public double getSoldItemsTotal() {
        return soldItemsTotal;
    }

    public void setSoldItemsTotal(double soldItemsTotal) {
        this.soldItemsTotal = soldItemsTotal;
    }

    public double getFinalSalary() {
        return finalSalary;
    }

    public void setFinalSalary(double finalSalary) {
        this.finalSalary = finalSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }
}
