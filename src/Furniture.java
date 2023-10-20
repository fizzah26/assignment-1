public class Furniture extends Products{
    String material;
    String dimension;

    public Furniture(String name, double price, double taxation, int stockQuantity,ProductType type, String material, String dimension) {
        super(name, price, taxation, stockQuantity, type);
        this.material = material;
        this.dimension = dimension;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s",super.toString(),material,dimension);
    }
}
