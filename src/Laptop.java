public class Laptop extends Electronics{
    String processor;
    String screenDimension;
    int ram;


    public Laptop(String name, double price, double taxation, int stockQuantity, ProductType type, String warranty, String powerConsumption, String processor, String sreenDimemsion, int ram) {
        super(name, price, taxation, stockQuantity, type, warranty, powerConsumption);
        this.processor = processor;
        this.screenDimension = screenDimension;
        this.ram = ram;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getScreenDimension() {
        return screenDimension;
    }

    public void setScreenDimension(String screenDimension) {
        this.screenDimension = screenDimension;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s ",super.toString(),screenDimension,ram);
    }
}
