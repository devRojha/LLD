package ParkingLot.Entity;

import ParkingLot.Enum.ParkingSpotType;

public class Vehicle {
    public String VehicleNumber;
    ParkingSpotType parkingSpotType;

    public Vehicle(String VehicleNumber, ParkingSpotType parkingSpotType) {
        this.VehicleNumber = VehicleNumber;
        this.parkingSpotType = parkingSpotType;
    }

    public String getVehicleNumber() {
        return VehicleNumber;
    }

    public ParkingSpotType getParkingSpotType() {
        return parkingSpotType;
    }
}
