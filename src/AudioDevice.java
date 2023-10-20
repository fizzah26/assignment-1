public class AudioDevice extends Electronics{

    public AudioDevice(String name, double price, double taxation, int stockQuantity,  ProductType type, String warranty, String powerConsumption) {
        super(name, price, taxation, stockQuantity, type, warranty, powerConsumption);
    }

    @Override
    public String toString() {
        return String.format(super.toString());
    }
}
