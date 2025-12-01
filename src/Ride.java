import java.util.*;

public class Ride implements RideInterface {
    private String rideName;
    private String rideType;
    private Employee operator;
    private int maxRider;

    public Ride() {}

    public Ride(String rideName, String rideType, Employee operator, int maxRider) {
        this.rideName = rideName;
        this.rideType = rideType;
        this.operator = operator;
        this.maxRider = maxRider;
    }

    public String getRideName() {
        return rideName;
    }

    public void setRideName(String rideName) {
        this.rideName = rideName;
    }

    public String getRideType() {
        return rideType;
    }

    public void setRideType(String rideType) {
        this.rideType = rideType;
    }

    public Employee getOperator() {
        return operator;
    }

    public void setOperator(Employee operator) {
        this.operator = operator;
    }

    public int getMaxRider() {
        return maxRider;
    }

    public void setMaxRider(int maxRider) {
        this.maxRider = maxRider;
    }

    @Override
    public void addVisitorToQueue(Visitor visitor) {
    }

    @Override
    public void removeVisitorFromQueue() {
    }

    @Override
    public void printQueue() {
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