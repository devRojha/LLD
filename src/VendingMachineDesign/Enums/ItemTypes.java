package VendingMachineDesign.Enums;

public enum ItemTypes {
    LAYS(10),
    PEPSI(15),
    CHOCOLATE(20);

    int price;

    ItemTypes(int price){
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
