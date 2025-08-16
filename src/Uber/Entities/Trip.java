package Uber.Entities;

public class Trip {
    int id;
    Rider rider;
    Driver driver;
    Location src, dest;
    double amount;

    public Trip(int id, Rider rider,  Location src, Location dest) {
        this.id = id;
        this.rider = rider;
        this.src = src;
        this.dest = dest;
    }

    public int getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Driver getDriver() {
        return driver;
    }

    public Rider getRider() {
        return rider;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Location getDest() {
        return dest;
    }

    public Location getSrc() {
        return src;
    }
}