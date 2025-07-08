package ParkingLot.Strategy;

import ParkingLot.Entity.ParkingSpot;
import ParkingLot.Entity.Vehicle;

import java.util.List;
import java.util.Objects;

public class DefaultParkingStrategy implements ParkingStrategy {
    @Override
    public ParkingSpot getParkingSpot(Vehicle vehicle, List<ParkingSpot> parkingSpotList) {
        int sizeOfList = parkingSpotList.size();
        String Type1 = vehicle.getParkingSpotType().getName();
        for (ParkingSpot parkingSpot : parkingSpotList) {
            String Type2 = parkingSpot.getParkingSpotType().getName();
            if (parkingSpot.isAvailable() && Type1.equals(Type2)) {
                return parkingSpot;
            }
        }
        return null;
    }

}
