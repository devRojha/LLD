package AmazonNotificationSystem;

import AmazonNotificationSystem.Observable.CerealObservable;
import AmazonNotificationSystem.Observable.IphoneObservable;
import AmazonNotificationSystem.Observable.StockObservable;
import AmazonNotificationSystem.Observer.EmailObserver;
import AmazonNotificationSystem.Observer.SMSObserver;
import AmazonNotificationSystem.Observer.StockObserver;

public class DriverAmazonNotificationSystem {
    public static void main(String[] args) {
        StockObservable Iphone = new IphoneObservable();
        StockObservable Cereal = new CerealObservable();

        StockObserver Ram = new EmailObserver("ram@gmail.com", Iphone);
        StockObserver Shyam = new SMSObserver("9988776655", Iphone);
        StockObserver Geeta = new EmailObserver("geeta@gmail.com", Cereal);
        StockObserver Geeta1 = new EmailObserver("geeta@gmail.com", Iphone);

        Iphone.addObserver(Ram);
        Iphone.addObserver(Shyam);
        Cereal.addObserver(Geeta);
        Cereal.addObserver(Geeta1);

        Iphone.setData(15);
        Cereal.setData(30);

    }
}
