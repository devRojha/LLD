package ParkingLot.Strategy;

public class UPIPayments implements PaymentStrategy {
    @Override
    public void payAmount(double amount) {

        System.out.println("Made a payment via UPI : " + amount);
    }
}
