package VendingMachineDesign.Entities;

import VendingMachineDesign.Enums.ItemTypes;

public class Item {
    ItemTypes type;
    int price;


    public ItemTypes getType() {
        return type;
    }

    public void setType(ItemTypes type) {
        this.type = type;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
