package AmazonNotificationSystem.Observable;

import AmazonNotificationSystem.Observer.StockObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservable implements StockObservable {

    List<StockObserver> observerList;
    int currentStock;
    String name;
    public IphoneObservable() {
        this.observerList = new ArrayList<>();
        this.currentStock = 0;
        this.name = "Iphone";
    }

    @Override
    public void addObserver(StockObserver Observer) {
        this.observerList.add(Observer);
    }

    @Override
    public void removeObserver(StockObserver Observer) {
        this.observerList.remove(Observer);
    }

    @Override
    public void notifyObservers() {
        for (StockObserver Observer : this.observerList) {
            Observer.update();
        }
    }

    @Override
    public int getData() {
        return currentStock;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setData(int data) {
        if (data > 0) {
            this.currentStock = data;
            notifyObservers();
        }
        else if (data < 0) {
            System.out.println("Invalid Data");
        }
        else {
            this.currentStock = 0;
        }
    }
}