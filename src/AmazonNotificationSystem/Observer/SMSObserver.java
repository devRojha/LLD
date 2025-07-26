package AmazonNotificationSystem.Observer;

import AmazonNotificationSystem.Observable.StockObservable;

public class SMSObserver implements StockObserver {
    String phone;

    StockObservable stockObservable;

    public SMSObserver(String phone, StockObservable stockObservable) {
        this.phone = phone;
        this.stockObservable = stockObservable;
    }

    private void sendSMS(int stockData, String type) {
        System.out.println("Sending SMS to " + phone + " for type " + type + ", Stock amount is " +  stockData);
    }

    @Override
    public void update() {
        sendSMS(stockObservable.getData(), stockObservable.getName());
    }
}
