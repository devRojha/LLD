package VendingMachineDesign.Entities;

public class ItemSelf {
    int productCode;
    Item item;

    boolean isAvailable;

    public ItemSelf(int productCode) {
        this.productCode = productCode;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public int getProductCode() {
        return productCode;
    }

    public Item getItem() {
        return item;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}
