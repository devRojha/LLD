package AmazonNotificationSystem.Observable;

import AmazonNotificationSystem.Observer.StockObserver;

import java.util.ArrayList;
import java.util.List;

public class CerealObservable implements StockObservable{
    List<StockObserver> observerList;
    int currentStock = 0;
    String name;
    // constructor
    public CerealObservable(){
        this.currentStock = 0;
        this.observerList = new ArrayList<>();
        this.name = "Cereal";
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
        for (StockObserver observer : observerList) {
            observer.update();
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
