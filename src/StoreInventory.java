import java.util.NoSuchElementException;
public class StoreInventory {
    private Products p[]=new Products[100];
    int counter =0;

    public void addProduct(Products product){
        for(int i=0; i<p.length;i++){
            if(p[i]==null) {
                p[i] = product;
                counter++;
                System.out.println("product is added successfully");
                return;
            }
        }
        System.out.println("no space to add product");
    }

    public void removeProduct(int productId){
        for(int i=0;i<p.length;i++){
            if(p[i]!=null && p[i].getProductId()==productId){
                for(int j=i;j<p.length -1;j++){
                    p[j]=p[j+1];
                }
                p[p.length-1]=null;
                System.out.println("product is removed successfully.");
                counter--;
                return;
            }
        }
    }

    public void searchProduct(int productId) {
        try {
            for (int i = 0; i < p.length; i++) {
                if (p[i] != null && p[i].getProductId() == productId) {
                    System.out.println("Product found:");
                    System.out.println(p[i]);
                    return; // Exit the loop after finding the product
                }
            }
            throw new NoSuchElementException("Product not found with productId: " + productId);
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
    }


    public void getProductDetails(int productId){
        for(int i=0;i<p.length;i++){
            if(p[i]!=null && p[i].getProductId()==productId) {
                System.out.println("product name: "+p[i].getName());
                System.out.println("price: "+p[i].getPrice());
                System.out.println("taxation: "+p[i].getTaxation());
                System.out.println("stock quantity: "+p[i].getStockQuantity());
                System.out.println( "type: "+p[i].getType());
                return;
            }
        }
        System.out.println("invalid id");
    }
    public void getAvailableProducts() {
        System.out.println("Available products are:");
        System.out.println(String.format("%-12s %-11s %-9s %-12s %-14s %-13s", "Name", "ProductId", "Price", "Taxation", "Stock Quantity", "Product Type"));
        for (int i=0;i<counter;i++) {
            System.out.println(p[i]);
        }
    }

    public void updateProduct(int productId,String name,double price,double taxation,ProductType type){
        for(int i=0;i<counter;i++){
            if(p[i].getProductId()==productId){
                p[i].setName(name);
                p[i].setPrice(price);
                p[i].setTaxation(taxation);
                p[i].setType(type);
                System.out.println("Product is updated successfully.");
                return;
            }
        }
        System.out.println("invalid id!!");
    }
}

