package ParkingLot.Strategy;

public class CashPayment implements PaymentStrategy{
    @Override
    public void payAmount(double amount) {

        System.out.println("Made a payment via cash : " + amount);
    }
}