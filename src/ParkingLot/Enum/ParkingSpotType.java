package ParkingLot.Enum;

import ParkingLot.Entity.ParkingSpot;

public enum ParkingSpotType {

    BIKE("BIKE", 10),
    CAR("CAR", 20),
    TRUCK("TRUCK", 50);

    int price;
    String name;

    ParkingSpotType( String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

}
