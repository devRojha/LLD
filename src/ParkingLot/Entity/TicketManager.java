package ParkingLot.Entity;

import java.util.HashMap;
import java.util.Map;

public class TicketManager {
    Map<Integer,Ticket> ticketMap;

    public static TicketManager instance;

    private TicketManager(){
        this.ticketMap = new HashMap<>();
    }

    public static TicketManager getInstance(){
        if(instance == null) {
            instance = new TicketManager();
        }
        return instance;
    }

    public static Ticket getTicket(int id) {
        if(instance.ticketMap.containsKey(id)) {
            return instance.ticketMap.get(id);
        }
        else {
            System.out.println("Ticket Not Found");
            return null;
        }
    }
}
