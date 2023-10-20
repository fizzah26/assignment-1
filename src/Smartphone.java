public class Smartphone extends Electronics{
    String opSystem;
    String cameraResolution;
    String storage;


    public Smartphone(String name, double price, double taxation, int stockQuantity,  ProductType type, String warranty, String powerConsumption, String opSystem, String cameraResolution, String storage) {
        super(name, price, taxation, stockQuantity, type, warranty, powerConsumption);
        this.opSystem = opSystem;
        this.cameraResolution = cameraResolution;
        storage = storage;
    }

    public String getOpSystem() {
        return opSystem;
    }

    public void setOpSystem(String opSystem) {
        this.opSystem = opSystem;
    }

    public String getCameraResolution() {
        return cameraResolution;
    }

    public void setCameraResolution(String cameraResolution) {
        this.cameraResolution = cameraResolution;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s",super.toString(),opSystem,cameraResolution,storage);
    }
}
