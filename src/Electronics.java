public class Electronics extends Products{
    String warranty;
    String powerConsumption;


    public Electronics(String name, double price, double taxation, int stockQuantity, ProductType type, String warranty, String powerConsumption) {
        super(name, price, taxation, stockQuantity, type);
        this.warranty = warranty;
        this.powerConsumption = powerConsumption;
    }

    public String getWarranty() {
        return warranty;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }

    public String getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(String powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s",super.toString(),powerConsumption,warranty);
    }
}
