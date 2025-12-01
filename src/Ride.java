import java.util.*;

public class Ride implements RideInterface {
    private String rideName;
    private String rideType;
    private Employee operator;
    private int maxRider;

    private Queue<Visitor> waitingLine;

    public Ride() {
        this.waitingLine = new LinkedList<>();
    }

    public Ride(String rideName, String rideType, Employee operator, int maxRider) {
        this();
        this.rideName = rideName;
        this.rideType = rideType;
        this.operator = operator;
        this.maxRider = maxRider;
    }

    public String getRideName() { return rideName; }
    public void setRideName(String rideName) { this.rideName = rideName; }

    public String getRideType() { return rideType; }
    public void setRideType(String rideType) { this.rideType = rideType; }

    public Employee getOperator() { return operator; }
    public void setOperator(Employee operator) { this.operator = operator; }

    public int getMaxRider() { return maxRider; }
    public void setMaxRider(int maxRider) { this.maxRider = maxRider; }

    @Override
    public void addVisitorToQueue(Visitor visitor) {
        if (waitingLine.offer(visitor)) {
            System.out.println("✅ Visitor " + visitor.getName() + " added to queue.");
        } else {
            System.out.println("❌ Failed to add visitor to queue.");
        }
    }

    @Override
    public void removeVisitorFromQueue() {
        Visitor removed = waitingLine.poll();
        if (removed != null) {
            System.out.println("✅ Visitor " + removed.getName() + " removed from queue.");
        } else {
            System.out.println("❌ Queue is empty. No visitor to remove.");
        }
    }

    @Override
    public void printQueue() {
        if (waitingLine.isEmpty()) {
            System.out.println("📭 Queue is empty.");
            return;
        }

        System.out.println("📋 Current waiting queue (" + waitingLine.size() + " visitors):");
        int position = 1;
        for (Visitor visitor : waitingLine) {
            System.out.println("   " + position + ". " + visitor.getName());
            position++;
        }
    }

    @Override
    public void addVisitorToHistory(Visitor visitor) {
    }

    @Override
    public boolean checkVisitorFromHistory(Visitor visitor) {
        return false;
    }

    @Override
    public int numberOfVisitors() {
        return 0;
    }

    @Override
    public void printRideHistory() {
    }

    @Override
    public void runOneCycle() {
    }
}