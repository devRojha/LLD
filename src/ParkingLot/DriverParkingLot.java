package ParkingLot;

import ParkingLot.Entity.ParkingLot;
import ParkingLot.Entity.ParkingSpot;
import ParkingLot.Entity.Ticket;
import ParkingLot.Entity.Vehicle;
import ParkingLot.Enum.ParkingSpotType;
import ParkingLot.Factory.VehicleFactory;
import ParkingLot.Strategy.CashPayment;
import ParkingLot.Strategy.DefaultParkingStrategy;
import ParkingLot.Strategy.PaymentStrategy;
import ParkingLot.Strategy.UPIPayments;

public class DriverParkingLot {
    public static void main(String []args) {
        // 1. Have a parking lot ( it has some x spots for each vehicle type)
        // 2. Support parking for different vehicle types each with different cost
        // 3. Park and Vacate the vehicle
        // 4. Generate ticket
        // 5. Price calculation
        // 6. Do the payment
        // 7. Have different parking strategies
        // 8. Different payment strategies
        // 9. Enter and exit gates are just my intermediate steps ( enter gate -> parking and generate ticket)

        int bikes = 20, cars = 10, Truks = 5;

        ParkingLot parkingLot = new ParkingLot(bikes, cars, Truks);

        Vehicle splendor = VehicleFactory.createVehicle("KA53A1234", ParkingSpotType.BIKE);
        Vehicle passionpro = VehicleFactory.createVehicle("KA53A1111", ParkingSpotType.BIKE);
        Vehicle meteor = VehicleFactory.createVehicle("KA53A1112", ParkingSpotType.BIKE);
        Vehicle interceptor = VehicleFactory.createVehicle("KA53A1113", ParkingSpotType.BIKE);
        Vehicle yamaha = VehicleFactory.createVehicle("KA53A1114", ParkingSpotType.BIKE);

        Vehicle car = VehicleFactory.createVehicle("KA53A1235", ParkingSpotType.CAR);
        Vehicle luxuryCar = VehicleFactory.createVehicle("KA53A1236", ParkingSpotType.CAR);

        Vehicle truck = VehicleFactory.createVehicle("HA53A1236", ParkingSpotType.TRUCK);


        Ticket truckTicket = parkingLot.parkVehicleAndGenerateTicket(truck, new DefaultParkingStrategy());

        double amount = Ticket.priceCalculation(truckTicket);

        PaymentStrategy cashPayment = new UPIPayments();
        cashPayment.payAmount(amount);

        parkingLot.vacateParkingSpot(truck);
    }

}
