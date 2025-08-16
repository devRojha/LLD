package Uber.Entities;

public class Driver {
    String name;
    double rating;
    boolean isAvailable;
    String cabNumber;

    public Driver(String name, String cabNumber) {
        this.name = name;
        this.cabNumber = cabNumber;
        this.isAvailable = true;
        this.rating = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public String getCabNumber() {
        return cabNumber;
    }
}
