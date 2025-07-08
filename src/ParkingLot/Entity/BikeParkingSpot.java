package ParkingLot.Entity;

import ParkingLot.Enum.ParkingSpotType;

public class BikeParkingSpot extends ParkingSpot {
    public BikeParkingSpot(int parkingSpotId, ParkingSpotType parkingSpotType) {
        super(parkingSpotId, parkingSpotType);
    }

    @Override
    public ParkingSpotType getParkingSpotType() {
        return parkingSpotType.BIKE;
    }
}
