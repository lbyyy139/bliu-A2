public class AssignmentTwo {
    public static void main(String[] args) {
        System.out.println("=== Boyu Liu's Theme Park System ===");
        System.out.println("System started successfully!");

        Employee emp = new Employee("John", 30, "john@park.com", "EMP001", "Operations");
        Visitor visitor = new Visitor("Alice", 25, "alice@email.com", "V001", "Adult");
        Ride ride = new Ride("Roller Coaster", "Thrill", emp, 4);

        System.out.println("Employee: " + emp.getName());
        System.out.println("Visitor: " + visitor.getName());
        System.out.println("Ride: " + ride.getRideName());
        System.out.println("All basic classes working correctly!");

        AssignmentTwo assignment = new AssignmentTwo();
        assignment.partThree();
    }

    public void partThree() {
        System.out.println("\n=== Part 3: Queue Management ===");

        Employee operator = new Employee("John Operator", 30, "john@themepark.com", "EMP001", "Ride Operations");

        Ride rollerCoaster = new Ride("Thunder Bolt", "Roller Coaster", operator, 2);

        Visitor visitor1 = new Visitor("Alice", 25, "alice@email.com", "V001", "Adult");
        Visitor visitor2 = new Visitor("Bob", 30, "bob@email.com", "V002", "Adult");
        Visitor visitor3 = new Visitor("Charlie", 12, "charlie@email.com", "V003", "Child");
        Visitor visitor4 = new Visitor("Diana", 28, "diana@email.com", "V004", "Adult");
        Visitor visitor5 = new Visitor("Eve", 35, "eve@email.com", "V005", "Senior");

        System.out.println("Adding visitors to queue:");
        rollerCoaster.addVisitorToQueue(visitor1);
        rollerCoaster.addVisitorToQueue(visitor2);
        rollerCoaster.addVisitorToQueue(visitor3);
        rollerCoaster.addVisitorToQueue(visitor4);
        rollerCoaster.addVisitorToQueue(visitor5);

        System.out.println("\nCurrent queue status:");
        rollerCoaster.printQueue();

        System.out.println("\nRemoving one visitor:");
        rollerCoaster.removeVisitorFromQueue();

        System.out.println("\nQueue after removal:");
        rollerCoaster.printQueue();
    }

    public void partFourA() {}
    public void partFourB() {}
    public void partFive() {}
    public void partSix() {}
    public void partSeven() {}
}