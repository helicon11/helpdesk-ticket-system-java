import java.util.ArrayList;

public class TicketVerwaltung {
    private ArrayList<Ticket> tickets;

    public TicketVerwaltung() {
        this.tickets = new ArrayList<>();
    }

    private int nextId = 1;

    public void ticketSpeichern(String kundenName, String problemBeschreibung, String prioritaet) {
        Ticket ticket = new Ticket(nextId, kundenName, problemBeschreibung, prioritaet);
        tickets.add(ticket);
        nextId++;
    }

    public void ticketsZeigen() {
        for (Ticket ticket : tickets) {
            System.out.println("\n" + ticket);
        }
    }

    public Ticket findeTicket(int id) {
        for(Ticket ticket : tickets) {
            if(ticket.getId() == id) {
                return ticket;
            }
        }
        return null;
    }

    public void statusAendern(int id, String neuerStatus) {
        Ticket ticket = findeTicket(id);
        if(ticket != null) {
            ticket.setStatus(neuerStatus);
        }
    }
}