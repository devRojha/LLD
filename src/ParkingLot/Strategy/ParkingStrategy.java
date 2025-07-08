package ParkingLot.Strategy;

import ParkingLot.Entity.ParkingSpot;
import ParkingLot.Entity.Vehicle;

import java.util.List;

public interface ParkingStrategy {
    public ParkingSpot getParkingSpot(Vehicle vehicle, List<ParkingSpot> parkingSpots);
}
