package Uber.Managers;

import Uber.Entities.Driver;
import Uber.Entities.Location;
import Uber.Entities.Rider;
import Uber.Entities.Trip;
import Uber.Strategies.DriverMatching;
import Uber.Strategies.Payment;
import Uber.Strategies.PriceCalculation;

import java.util.HashMap;

public class TripManager {
    HashMap<Integer, Trip> tripsHashMap;

    public static TripManager tripManager;

    private TripManager() {
        tripsHashMap = new HashMap<> ();
    }

    public static TripManager getInstance() {
        if (tripManager == null) {
            tripManager = new TripManager();
        }
        return tripManager;
    }

    public Trip createTrip (Rider rider, Location src, Location dest) {

        int tripId = tripsHashMap.size() + 1;
        Trip trip = new Trip(tripId, rider, src, dest);

        // find the driver
        DriverMatching driverMatching = StrategyManager.getDriverMatching(trip);
        Driver driver = driverMatching.findDriver(trip);

        if (driver == null) {
            System.out.println("Driver not found");
            return null;
        }
        System.out.println("Driver found, Name : " +  driver.getName());
        trip.setDriver(driver);

        // calculate price
        PriceCalculation priceCalculation = StrategyManager.getPriceCalculation(trip);
        double price = priceCalculation.calculatePrice(trip);
        System.out.println("Total fare : " + price);
        trip.setAmount(price);

        // put into hashmap and return trip
        tripsHashMap.put(tripId, trip);
        return trip;
    }

    public Trip getTrip(int id) {
        if(tripsHashMap.containsKey(id)) {
            return tripsHashMap.get(id);
        }
        return null;
    }

    public void endTrip(Trip trip, Payment payment) {
        Driver  driver = trip.getDriver();
        driver.setAvailable(true);
        DriverManager driverManager = DriverManager.getInstance();
        driverManager.getDriversHashMap().replace(driver.getName(), driver);

        tripsHashMap.remove(trip.getId());

        // do payment
        payment.pay(trip);

        System.out.println("Trip ended with id : " + trip.getId() + " ,Rider : " + trip.getRider().getName() + " and Driver : " + driver.getName());

    }
}
