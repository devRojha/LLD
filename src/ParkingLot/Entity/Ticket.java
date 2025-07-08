package ParkingLot.Entity;

public class Ticket {
    int TicketID;
    Vehicle vehicle;
    ParkingSpot parkingSpot;

    long entryTime;
    long exitTime;

    double price;

    private Ticket(Vehicle vehicle, ParkingSpot parkingSpot) {
        this.vehicle = vehicle;
        this.entryTime = System.currentTimeMillis();
        this.parkingSpot = parkingSpot;

        // assigning TicketID
        TicketManager ticketManager = TicketManager.getInstance();
        int size = ticketManager.ticketMap.size();
        // get the unique ID
        while (ticketManager.ticketMap.containsKey(size)) {
            size++;
        }
        this.TicketID = size;
    }

    public int getTicketID() {
        return TicketID;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public long getEntryTime() {
        return entryTime;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static Ticket createTicket(Vehicle vehicle, ParkingSpot parkingSpot) {
        Ticket ticket = new Ticket(vehicle, parkingSpot);
        TicketManager.instance.ticketMap.put(ticket.getTicketID(), ticket);
        return ticket;
    }

    public static double priceCalculation(Ticket ticket) {
        long duration = 5;
        ParkingSpot parkingSpot = ticket.getParkingSpot();

        int pricePerHour = parkingSpot.getParkingSpotType().getPrice();

        System.out.println("Vehicle Type: " + parkingSpot.getParkingSpotType().getName());

        double amount = duration * pricePerHour;

        System.out.println("Total amount to be paid for duration = " + duration + " and charge is : " + pricePerHour +" : " + amount);
        ticket.setPrice(amount);
        return amount;
    }
}
