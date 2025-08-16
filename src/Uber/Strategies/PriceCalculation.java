package Uber.Strategies;

import Uber.Entities.Trip;

public interface PriceCalculation {

    public double calculatePrice(Trip trip);
}
