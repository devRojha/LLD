package AmazonNotificationSystem.Observer;

import AmazonNotificationSystem.Observable.StockObservable;

public class EmailObserver implements StockObserver{

    String email;

    StockObservable stockObservable;

    public EmailObserver(String email, StockObservable stockObservable) {
        this.email = email;
        this.stockObservable = stockObservable;
    }

    private void sendEmail(int stockData, String type) {
        System.out.println("Sending email to " + email + " for type " + type + ", Stock amount is " +  stockData);
    }

    @Override
    public void update() {
        sendEmail(stockObservable.getData(), stockObservable.getName());
    }
}
