package chapter4;

public class GasMilienage {
    private double miles;
    private double totalMiles;
    private double gallons;
    private double totalGalons;

    public GasMilienage(double miles, double gallons) {
        this.miles = miles;
        this.gallons = gallons;
    }

    public double getMiles() {
        return miles;
    }

    public void setMiles(double miles) {
        this.miles = miles;
    }

    public double getGallons() {
        return gallons;
    }

    public void setGallons(double gallons) {
        this.gallons = gallons;
    }

    public double getTotalMiles() {
        return totalMiles;
    }

    public void setTotalMiles(double totalMiles) {
        this.totalMiles = totalMiles;
    }

    public double getTotalGalons() {
        return totalGalons;
    }

    public void setTotalGalons(double totalGalons) {
        this.totalGalons = totalGalons;
    }
}
