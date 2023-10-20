public class Seating extends Furniture{
    int loadCapacity;

    public Seating(String name, double price, double taxation, int stockQuantity, ProductType type, String material, String dimension, int loadCapacity) {
        super(name, price, taxation, stockQuantity, type, material, dimension);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return String.format("%s %d",super.toString(),loadCapacity);
    }
}

