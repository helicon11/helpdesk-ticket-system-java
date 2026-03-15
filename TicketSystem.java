import java.util.Scanner;

public class TicketSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TicketVerwaltung verwaltung = new TicketVerwaltung();
        while (true) {
            System.out.println("Ticket System Menü" +
                    "\n" +
                    "\n1 - Neues Ticket erstellen" +
                    "\n2 - Alle Tickets anzeigen" +
                    "\n3 - Ticketstatus ändern" +
                    "\n4 - Beenden");

            int wahl = sc.nextInt();

            if(wahl == 1) {
                sc.nextLine();

               System.out.println("Neues Ticket erstellen:" +
                       "\nName:");
               String name = sc.nextLine();

               System.out.println("\nProblembeschreibung:");
                String problembeschreibung = sc.nextLine();

                System.out.println("\nPriorität:");
                String prioritaet = sc.nextLine();

                verwaltung.ticketSpeichern(name, problembeschreibung, prioritaet);

            } else if(wahl == 2) {

                verwaltung.ticketsZeigen();

            } else if(wahl == 3) {

                sc.nextLine();

                System.out.println("Ticket-ID eingeben:");
                int ticketID = sc.nextInt();
                sc.nextLine();

                System.out.println("Ticket: " + ticketID +
                        "\nNeuen Status eingeben");
                String status = sc.nextLine();

                verwaltung.statusAendern(ticketID, status);
            } else if(wahl == 4) {
                break;
            } else {
                System.out.println("Fehler: Geben sie eine Zahl zwischen 1 und 4 ein");
            }
        }
        sc.close();
    }
}
