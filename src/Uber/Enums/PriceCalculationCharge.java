package Uber.Enums;

public enum PriceCalculationCharge {
    DEFAULT(8),
    PEAKHOUR(15);

    double value;
    PriceCalculationCharge(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
