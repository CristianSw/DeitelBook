package practiceFromDeitel.chapter3;

public class Acount {
    private String name;
    private double balance;

    public Acount(String name, double balance) {
        this.name = name;
        if (balance > 0.0) {
            this.balance = balance;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double depositAmount) {
        balance = balance + depositAmount;
    }

    public void withdraw(double widthSumm){
        balance = balance - widthSumm;
    }

}
