package MachineCodingRound.parkingLot.repository;

import MachineCodingRound.parkingLot.dto.Ticket;

import java.util.ArrayList;
import java.util.List;

public class TicketRepository {
    private static TicketRepository instance;
    List<Ticket> ticketList;
    private TicketRepository() {
        ticketList = new ArrayList<>();
    }
    public static TicketRepository getInstance() {
        if (instance == null) {
            instance = new TicketRepository();
        }
        return instance;
    }
    public List<Ticket> getTicketList() {
        return ticketList;
    }
    public void setTicketList(List<Ticket> ticketList) {
        this.ticketList = ticketList;
    }

}
