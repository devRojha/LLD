package Uber.Factories;

import Uber.Entities.Driver;
import Uber.Entities.Rider;

public class Factory {

    public static Rider createRider(String name) {
        return new Rider(name);
    }

    public static Driver createDriver(String name, String cabNumber) {
        return new Driver(name, cabNumber);
    }
}
