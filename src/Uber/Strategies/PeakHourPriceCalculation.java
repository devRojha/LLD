package Uber.Strategies;

import Uber.Entities.Trip;
import Uber.Enums.PriceCalculationCharge;
import Uber.Utils.EuclideanDistanceCalculation;
import Uber.Utils.FinalPriceCalculation;

public class PeakHourPriceCalculation implements PriceCalculation {

    @Override
    public double calculatePrice(Trip trip) {
        double EuclideanDistance = EuclideanDistanceCalculation.calculateDistance(trip.getSrc(), trip.getDest());
        return FinalPriceCalculation.calculatePrice(EuclideanDistance, PriceCalculationCharge.DEFAULT.getValue());
    }
}
