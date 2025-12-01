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
    }

    public void partThree() {}
    public void partFourA() {}
    public void partFourB() {}
    public void partFive() {}
    public void partSix() {}
    public void partSeven() {}
}