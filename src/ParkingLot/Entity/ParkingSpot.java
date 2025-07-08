package ParkingLot.Entity;

import ParkingLot.Enum.ParkingSpotType;

public abstract class ParkingSpot {
    int parkingSpotId;
    boolean isAvailable;

    ParkingSpotType parkingSpotType;

    public ParkingSpot(int parkingSpotId, ParkingSpotType parkingSpotType) {
        this.parkingSpotId = parkingSpotId;
        this.isAvailable = true;
        this.parkingSpotType = parkingSpotType;
    }

    public int getParkingSpotId() {
        return parkingSpotId;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public abstract ParkingSpotType getParkingSpotType();
}
