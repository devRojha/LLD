package Uber.Managers;

import Uber.Entities.Trip;
import Uber.Strategies.*;

public class StrategyManager {

    // Driver Matching strategy

    public static DriverMatching getDriverMatching(Trip trip) {

        // 11 pm nearest
        // return new NearestDriverMatching();

        // other than default
        return new DefaultDriverMatching();
    }

    // price calculation strategy
    public static PriceCalculation getPriceCalculation(Trip trip) {
        return new DefaultPriceCalculation();
    }

}
