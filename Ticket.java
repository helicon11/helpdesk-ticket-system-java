public class Ticket {
    private int id;
    private String kundenName;
    private String problemBeschreibung;
    private String prioritaet;
    private String status;

    public Ticket(int id, String kundenName, String problemBeschreibung, String prioritaet) {
        this.id = id;
        this.kundenName = kundenName;
        this.problemBeschreibung = problemBeschreibung;
        this.prioritaet = prioritaet;
        this.status = "Offen";
    }

    public int getId() {
        return id;
    }

    public String getKundenName() {
        return kundenName;
    }

    public String getProblemBeschreibung() {
        return problemBeschreibung;
    }

    public String getPrioritaet() {
        return prioritaet;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Ticket-ID: " + id +
                "\nKunde: " + kundenName +
                "\nProblem: " + problemBeschreibung +
                "\nPrioritaet: " + prioritaet +
                "\nStatus: " + status;
    }
}
