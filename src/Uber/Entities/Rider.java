package Uber.Entities;

public class Rider {
    String name;
    double rating;

    public Rider(String name) {
        this.name = name;
        this.rating = 0;
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setName(String name) {
        this.name = name;
    }

}
