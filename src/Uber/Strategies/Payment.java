package Uber.Strategies;

import Uber.Entities.Trip;

public interface Payment {
    public void pay(Trip trip);
}
