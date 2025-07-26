package AmazonNotificationSystem.Observable;

import AmazonNotificationSystem.Observer.StockObserver;

import java.util.Observer;

public interface StockObservable {
    public void addObserver(StockObserver Observer);
    public void removeObserver(StockObserver Observer);
    public void notifyObservers();
    public int getData();
    public String getName();
    public void setData(int data);
}
