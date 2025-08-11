package VendingMachineDesign.Enums;

public enum Coins {
    ONE(1),
    TWO(2),
    FIVE(5),
    TEN(10),
    TWENTY(20);

    int value;

    Coins(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
