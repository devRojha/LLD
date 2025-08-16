package Uber.Strategies;

import Uber.Entities.Trip;

public class CashPayment implements Payment {
    @Override
    public void pay(Trip trip) {
        double price = trip.getAmount();
        System.out.println(price + " Rs is Pay by cash");
    }
}
