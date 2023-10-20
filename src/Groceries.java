public class Groceries extends Products{
    Date expDate;
    double nutritionalVal;

    public Groceries(String name, double price, double taxation, int stockQuantity, ProductType type, Date expDate, double nutritionalVal) {
        super(name, price, taxation, stockQuantity, type);
        this.expDate = expDate;
        this.nutritionalVal = nutritionalVal;
    }

    public Date getExpDate() {
        return expDate;
    }

    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }

    public double getNutritionalVal() {
        return nutritionalVal;
    }

    public void setNutritionalVal(double nutritionalVal) {
        this.nutritionalVal = nutritionalVal;
    }

    @Override
    public String toString() {
        return String.format("%s %s %f",super.toString(),expDate,nutritionalVal);
    }
}
