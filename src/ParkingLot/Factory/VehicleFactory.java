package ParkingLot.Factory;

import ParkingLot.Entity.ParkingLot;
import ParkingLot.Entity.Vehicle;
import ParkingLot.Enum.ParkingSpotType;

public class VehicleFactory {
    public static Vehicle createVehicle(String vehicleNumber, ParkingSpotType parkingSpotType){
        return new Vehicle(vehicleNumber, parkingSpotType);
    }
}
