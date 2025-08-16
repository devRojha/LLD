package Uber.Strategies;

import Uber.Entities.Driver;
import Uber.Entities.Trip;

public interface DriverMatching {
    public Driver findDriver(Trip trip);
}
