package Uber.Managers;

import Uber.Entities.Rider;

import java.util.HashMap;

public class RiderManager {
    HashMap<String, Rider> ridersHashMap;

    public static RiderManager riderManager;

    private RiderManager() {
        ridersHashMap = new HashMap<> ();
    }

    public static RiderManager getInstance() {
        if (riderManager == null) {
            riderManager = new RiderManager();
        }
        return riderManager;
    }

    public void addRider(Rider rider) {
        ridersHashMap.put(rider.getName(), rider);
        System.out.println("Added Rider " + rider.getName());
    }

    public void removeRider(Rider rider) {
        ridersHashMap.remove(rider.getName());
        System.out.println("Removed Rider " + rider.getName());
    }

    public Rider getRider(String name) {
        if (ridersHashMap.containsKey(name)) {
            return ridersHashMap.get(name);
        }
        return null;
    }
}

