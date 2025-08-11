package VendingMachineDesign.Entities;

public class Inventory {
    ItemSelf [] inventory;
    int size;

    public Inventory(int size) {
        this.size = size;
        this.inventory = new ItemSelf[size];

        int selfCode = 101;

        for (int index = 0; index < size; index++) {
            ItemSelf itemSelf = new ItemSelf(selfCode);
            inventory[index] = itemSelf;
            selfCode += 1;
        }
    }

    public Item getItemByCode(int code) throws Exception{
        for (ItemSelf itemSelf : inventory) {
            if (itemSelf.getProductCode() == code) {
                if (itemSelf.isAvailable()) {
                    return itemSelf.getItem();
                }
                else {
                    System.out.println("Item is not available");
                    throw new Exception("Item is not available");
                }
            }
        }
        System.out.println("Can't find in the item self with given cod : " + code );
        throw new Exception("Can't find in the item self with given cod : " + code );
    }

    public ItemSelf[] getInventory() {
        return inventory;
    }
}
