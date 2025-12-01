import java.util.Objects;

public class Visitor extends Person {
    private String visitorId;
    private String ticketType;

    public Visitor() {}

    public Visitor(String name, int age, String email, String visitorId, String ticketType) {
        super(name, age, email);
        this.visitorId = visitorId;
        this.ticketType = ticketType;
    }

    public String getVisitorId() {
        return visitorId;
    }

    public void setVisitorId(String visitorId) {
        this.visitorId = visitorId;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    @Override
    public String toString() {
        return "Visitor{name='" + getName() + "', age=" + getAge() +
                ", visitorId='" + visitorId + "', ticketType='" + ticketType + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Visitor visitor = (Visitor) obj;
        return Objects.equals(getName(), visitor.getName()) &&
                getAge() == visitor.getAge() &&
                Objects.equals(visitorId, visitor.visitorId) &&
                Objects.equals(ticketType, visitor.ticketType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), visitorId, ticketType);
    }
}