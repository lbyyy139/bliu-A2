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
        assignment.partFourA();
        assignment.partFourB();
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

    public void partFourA() {
        System.out.println("\n\n=== Part 4A: Ride History ===");

        Employee operator = new Employee("Sarah Operator", 28, "sarah@themepark.com", "EMP002", "Ride Operations");
        Ride waterRide = new Ride("Splash Mountain", "Water Ride", operator, 4);

        Visitor visitor1 = new Visitor("Frank", 22, "frank@email.com", "V006", "Adult");
        Visitor visitor2 = new Visitor("Grace", 19, "grace@email.com", "V007", "Student");
        Visitor visitor3 = new Visitor("Henry", 45, "henry@email.com", "V008", "Adult");
        Visitor visitor4 = new Visitor("Ivy", 32, "ivy@email.com", "V009", "Adult");
        Visitor visitor5 = new Visitor("Jack", 10, "jack@email.com", "V010", "Child");

        System.out.println("Adding visitors to ride history:");
        waterRide.addVisitorToHistory(visitor1);
        waterRide.addVisitorToHistory(visitor2);
        waterRide.addVisitorToHistory(visitor3);
        waterRide.addVisitorToHistory(visitor4);
        waterRide.addVisitorToHistory(visitor5);

        System.out.println("\nChecking visitor in history:");
        waterRide.checkVisitorFromHistory(visitor1);

        System.out.println("\nCounting visitors:");
        waterRide.numberOfVisitors();

        System.out.println("\nRide history:");
        waterRide.printRideHistory();
    }

    public void partFourB() {
        System.out.println("\n\n=== Part 4B: Sorting Ride History ===");

        Employee operator = new Employee("Mike Operator", 35, "mike@themepark.com", "EMP003", "Ride Operations");
        Ride ferrisWheel = new Ride("Sky Wheel", "Ferris Wheel", operator, 6);

        Visitor visitor1 = new Visitor("Zack", 25, "zack@email.com", "V011", "Adult");
        Visitor visitor2 = new Visitor("Alice", 30, "alice2@email.com", "V012", "Adult");
        Visitor visitor3 = new Visitor("Charlie", 18, "charlie2@email.com", "V013", "Student");
        Visitor visitor4 = new Visitor("Bob", 22, "bob2@email.com", "V014", "Adult");
        Visitor visitor5 = new Visitor("Alice", 25, "alice3@email.com", "V015", "Adult");

        System.out.println("Adding visitors to history:");
        ferrisWheel.addVisitorToHistory(visitor1);
        ferrisWheel.addVisitorToHistory(visitor2);
        ferrisWheel.addVisitorToHistory(visitor3);
        ferrisWheel.addVisitorToHistory(visitor4);
        ferrisWheel.addVisitorToHistory(visitor5);

        System.out.println("\nBefore sorting:");
        ferrisWheel.printRideHistory();

        System.out.println("\nSorting by name and age...");
        ferrisWheel.sortRideHistory(new VisitorComparator());

        System.out.println("\nAfter sorting:");
        ferrisWheel.printRideHistory();
    }
    public void partFive() {}
    public void partSix() {}
    public void partSeven() {}
}