import java.util.*;

public class Ride implements RideInterface {
    private String rideName;
    private String rideType;
    private Employee operator;
    private int maxRider;
    private int numOfCycles;

    private Queue<Visitor> waitingLine;
    private LinkedList<Visitor> rideHistory;

    public Ride() {
        this.waitingLine = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
        this.numOfCycles = 0;
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

    public int getNumOfCycles() { return numOfCycles; }

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
        if (rideHistory.add(visitor)) {
            System.out.println("✅ Visitor " + visitor.getName() + " added to ride history.");
        } else {
            System.out.println("❌ Failed to add visitor to ride history.");
        }
    }

    @Override
    public boolean checkVisitorFromHistory(Visitor visitor) {
        boolean found = rideHistory.contains(visitor);
        System.out.println("🔍 Visitor " + visitor.getName() +
                (found ? " found" : " not found") + " in ride history.");
        return found;
    }

    @Override
    public int numberOfVisitors() {
        int count = rideHistory.size();
        System.out.println("📊 Number of visitors in ride history: " + count);
        return count;
    }

    @Override
    public void printRideHistory() {
        if (rideHistory.isEmpty()) {
            System.out.println("📭 Ride history is empty.");
            return;
        }

        System.out.println("📖 Ride history (" + rideHistory.size() + " visitors):");
        Iterator<Visitor> iterator = rideHistory.iterator();
        int count = 1;
        while (iterator.hasNext()) {
            System.out.println("   " + count + ". " + iterator.next());
            count++;
        }
    }

    public void sortRideHistory(Comparator<Visitor> comparator) {
        Collections.sort(rideHistory, comparator);
        System.out.println("🔃 Ride history sorted successfully.");
    }

    @Override
    public void runOneCycle() {
        if (operator == null) {
            System.out.println("❌ Cannot run ride: No operator assigned.");
            return;
        }

        if (waitingLine.isEmpty()) {
            System.out.println("❌ Cannot run ride: No visitors in queue.");
            return;
        }

        System.out.println("🎢 Running ride cycle for " + rideName + "...");
        int ridersThisCycle = Math.min(maxRider, waitingLine.size());

        System.out.println("Taking " + ridersThisCycle + " visitors from queue:");
        for (int i = 0; i < ridersThisCycle; i++) {
            Visitor rider = waitingLine.poll();
            if (rider != null) {
                addVisitorToHistory(rider);
                System.out.println("   🎯 " + rider.getName() + " enjoyed the ride!");
            }
        }

        numOfCycles++;
        System.out.println("✅ Ride cycle completed. Total cycles run: " + numOfCycles);
    }
}