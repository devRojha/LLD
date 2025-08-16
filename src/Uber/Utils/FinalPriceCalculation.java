package Uber.Utils;

import Uber.Entities.Trip;

public class FinalPriceCalculation {
    public static double calculatePrice(double distance, double charge) {
        double price = charge * distance;
        return Math.round(price * 100.0) / 100.0;
    }
}
