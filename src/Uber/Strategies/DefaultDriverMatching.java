package Uber.Strategies;

import Uber.Entities.Driver;
import Uber.Entities.Trip;
import Uber.Managers.DriverManager;


public class DefaultDriverMatching implements DriverMatching {
    @Override
    public Driver findDriver(Trip trip) {
        DriverManager driverManager = DriverManager.getInstance();

        for (Driver driver : driverManager.getDriversHashMap().values()) {
            if (driver.isAvailable()) {
                driver.setAvailable(false);
                return driver;
            }
        }
        return null;
    }
}
