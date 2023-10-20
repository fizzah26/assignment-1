public class StoreDemo {
    public static void main (String[]args) {
        Products p[]=new Products[100];
        StoreInventory storeInventory = new StoreInventory();

        Products p1 = new Products("cupboard", 50000, 25.5, 6,ProductType.FURNITURE);
        Products p2 = new Products("radio", 3500, 10, 34,ProductType.ELECTRONICS);
        Electronics e1 = new Electronics("ipad",90000,11.2,50, ProductType.ELECTRONICS,"5years","50W");
        Groceries g1 = new Groceries("eggs",380,3.4,80,ProductType.GROCERIES,new Date(24,10,2023),20.6);
        Groceries g2 = new Groceries ("chips",100,12.3,150,ProductType.GROCERIES,new Date(21,11,2024),100);
        storeInventory.addProduct(p1);
        storeInventory.addProduct(p2);
        storeInventory.addProduct(e1);
        storeInventory.addProduct(g1);
        storeInventory.addProduct(g2);

        storeInventory.updateProduct(2,"sofa",35,10.5,ProductType.FURNITURE);
        storeInventory.removeProduct(3);
        storeInventory.getProductDetails(2);
        storeInventory.searchProduct(6);
        storeInventory.getAvailableProducts();
    }


}
