
package ParkingLot.Entity;

import ParkingLot.Enum.ParkingSpotType;

public class CarParkingSpot extends ParkingSpot {
    public CarParkingSpot(int parkingSpotId, ParkingSpotType parkingSpotType) {
        super(parkingSpotId, parkingSpotType);
    }

    @Override
    public ParkingSpotType getParkingSpotType() {
        return parkingSpotType.CAR;
    }
}