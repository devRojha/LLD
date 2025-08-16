package Uber.Managers;

import Uber.Entities.Driver;

import java.util.HashMap;


public class DriverManager {
    HashMap<String, Driver> driversHashMap;

    public static DriverManager driverManager;

    private DriverManager() {
        driversHashMap = new HashMap<> ();
    }

    public static DriverManager getInstance() {
        if (driverManager == null) {
            driverManager = new DriverManager();
        }
        return driverManager;
    }

    public void addDriver(Driver driver) {
        driversHashMap.put(driver.getName(), driver);
        System.out.println("Added Driver " + driver.getName());
    }

    public void removeDriver(Driver driver) {
        driversHashMap.remove(driver.getName());
        System.out.println("Removed Driver " + driver.getName());
    }

    public HashMap<String, Driver> getDriversHashMap() {
        return driversHashMap;
    }

    public Driver getDriver(String driverName) {
        if (driversHashMap.containsKey(driverName)) {
            return driversHashMap.get(driverName);
        }
        return null;
    }
}
