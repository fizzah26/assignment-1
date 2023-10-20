public class Products {
    private String name;
    private double price;
    private double taxation;
    private int stockQuantity;
    private int productId;
    ProductType type;
    private static int counter=0;


    public Products(String name, double price, double taxation, int stockQuantity, ProductType type) {
        this.name = name;
        this.price = price;
        this.taxation = taxation;
        this.stockQuantity = stockQuantity;
        this.productId = ++counter;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTaxation() {
        return taxation;
    }

    public void setTaxation(double taxation) {
        this.taxation = taxation;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public int getProductId() {
        return productId;
    }
    public ProductType getType() {
        return type;
    }

    public void setType(ProductType type) {
        this.type = type;
    }
    @Override
    public String toString() {
        return String.format("%-12s %-8d %-12.2f %-11.2f %-15d %-13s", name, productId, price, taxation, stockQuantity, type);
    }


}
