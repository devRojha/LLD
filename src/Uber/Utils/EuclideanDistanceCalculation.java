package Uber.Utils;


import Uber.Entities.Location;

public class EuclideanDistanceCalculation {

    public static double calculateDistance(Location src, Location dest) {
        double latitudeDifference = dest.getLatitude() - src.getLatitude();
        double longitudeDifference = dest.getLongitude() - src.getLongitude();
        return Math.sqrt(Math.pow(latitudeDifference, 2) + Math.pow(longitudeDifference, 2));
    }
}
