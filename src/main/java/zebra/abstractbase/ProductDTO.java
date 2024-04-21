package zebra.abstractbase;

public interface ProductDTO {
    double getPrice();

    long getInventoryID();

    void setPrice(double price);

    void setInventoryID(long inventoryID);
}
