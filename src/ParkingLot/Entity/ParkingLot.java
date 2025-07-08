package ParkingLot.Entity;

import ParkingLot.Enum.ParkingSpotType;
import ParkingLot.Strategy.DefaultParkingStrategy;
import ParkingLot.Strategy.ParkingStrategy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingLot {
    public List<ParkingSpot> parkingSpotList;
    public Map<Vehicle, ParkingSpot> vechicalParkingSpotMap;

    public ParkingLot(int bikeSpots, int carSpots, int truckSpots) {
        this.parkingSpotList = new ArrayList<>();
        this.vechicalParkingSpotMap = new HashMap<>();

        int currentId = 101;
        // making bike spots;
        for (int i = 0; i < bikeSpots; i++) {
            ParkingSpot parkingSpot = new BikeParkingSpot(currentId++, ParkingSpotType.BIKE);
            this.parkingSpotList.add(parkingSpot);
        }

        // making car spots
        for (int i = 0; i < carSpots; i++) {
            ParkingSpot parkingSpot = new CarParkingSpot(currentId++, ParkingSpotType.CAR);
            this.parkingSpotList.add(parkingSpot);
        }

        // making truck spots
        for (int i = 0; i < truckSpots; i++) {
            ParkingSpot parkingSpot = new TruckParkingSpot(currentId++, ParkingSpotType.TRUCK);
            this.parkingSpotList.add(parkingSpot);
        }
    }

    private void updateParkingSpot(ParkingSpot parkingSpot) {
        int id = parkingSpot.getParkingSpotId();
        for (int i = 0; i < this.parkingSpotList.size(); i++) {
            int currId = this.parkingSpotList.get(i).getParkingSpotId();
            if (currId == id) {
                this.parkingSpotList.set(i, parkingSpot);
            }
        }
    }

    public Ticket parkVehicleAndGenerateTicket(Vehicle vehicle, ParkingStrategy parkingStrategy) {

        ParkingSpot parkingSpot = parkingStrategy.getParkingSpot(vehicle,  parkingSpotList);

        if(parkingSpot == null) {
            System.out.println("no parking spots available for this vehicle " + vehicle.getVehicleNumber());
            return null;
        }
            parkingSpot.setAvailable(false);
            updateParkingSpot(parkingSpot);
            vechicalParkingSpotMap.put(vehicle, parkingSpot);
            System.out.println("Vehicle parked Successfully : " + vehicle.getVehicleNumber());
            return  Ticket.createTicket(vehicle, parkingSpot);
    }

    public void  vacateParkingSpot(Vehicle vehicle) {
        ParkingSpot parkingSpot = vechicalParkingSpotMap.get(vehicle);
        if (parkingSpot == null) {
            return;
        }
        parkingSpot.setAvailable(true);
        vechicalParkingSpotMap.remove(vehicle);
        updateParkingSpot(parkingSpot);
        System.out.println("Vehicle : " + vehicle.getVehicleNumber() + " is successfully vacated");
    }
}
