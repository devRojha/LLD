package Uber;

import Uber.Entities.Driver;
import Uber.Entities.Location;
import Uber.Entities.Rider;
import Uber.Entities.Trip;
import Uber.Managers.DriverManager;
import Uber.Managers.RiderManager;
import Uber.Managers.TripManager;
import Uber.Strategies.CashPayment;
import Uber.Strategies.DefaultDriverMatching;
import Uber.Strategies.Payment;
import Uber.Strategies.UPIPayment;

public class DriverUber {
    public static void main(String[] args) {

        // create Rider
        Rider raj = new Rider("Raj");
        Rider kajal = new Rider("Kajal");

        // add rider to list
        RiderManager riderManager = RiderManager.getInstance();
        riderManager.addRider(raj);
        riderManager.addRider(kajal);

        // create driver
        Driver rohan = new Driver("Rohan", "LHBK4992");
        Driver ved = new Driver("Ved", "LHBK4996");

        // add driver to list;
        DriverManager driverManager = DriverManager.getInstance();
        driverManager.addDriver(rohan);
        driverManager.addDriver(ved);

        // create location
        Location src1 = new Location(94.4, 56.5);
        Location dest1 = new Location(150.4, 69.5);
        Location src2 = new Location(94.4, 56.5);
        Location dest2 = new Location(150.4, 69.5);


        // create trip for users
        TripManager tripManager = TripManager.getInstance();
        Trip t1 = tripManager.createTrip(raj, src1, dest1);
        Trip t2 = tripManager.createTrip(kajal, src2, dest2);

        // end Trip with payment strategy
        tripManager.endTrip(t1, new CashPayment());
        tripManager.endTrip(t2, new UPIPayment());

    }
}
