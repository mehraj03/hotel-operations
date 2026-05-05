public class Main {
    public static void main(String[] args) {

        // Test Room
        System.out.println("===== ROOM TESTS =====");
        Room room1 = new Room(2, 139.00, false, false);
        System.out.println("Beds: " + room1.getNumberOfBeds());
        System.out.println("Price: $" + room1.getPrice());
        System.out.println("Occupied? " + room1.isOccupied());
        System.out.println("Dirty? " + room1.isDirty());
        System.out.println("Available? " + room1.isAvailable());
        //room workflow
        System.out.println();
        System.out.println("==== ROOM WORKFLOW ====");
        Room room2 = new Room(1, 124.00,false, false);
        System.out.println("Available at start" + room2.isAvailable());

        room2.checkIn();
        System.out.println("After check in:");
        System.out.println(" Occupied? " + room2.isOccupied());
        System.out.println("  Dirty? " + room2.isDirty());
        System.out.println(" Available" + room2.isAvailable());

        room2.checkout();
        System.out.println("After check out:");
        System.out.println(" Occupied? " + room2.isOccupied());
        System.out.println("  Dirty? " + room2.isDirty());
        System.out.println(" Available" + room2.isAvailable());

        room2.cleanRoom();
        System.out.println("After cleaning:'");
        System.out.println(" Available? " + room2.isAvailable());


        // Test Reservation — king, weekday
        System.out.println();
        System.out.println("===== RESERVATION TESTS =====");
        Reservation res1 = new Reservation("king", 3, false);
        System.out.println("Type: " + res1.getRoomType());
        System.out.println("Nights: " + res1.getNumberOfNights());
        System.out.println("Weekend? " + res1.isWeekend());
        System.out.println("Price per night: $" + res1.getPrice());
        System.out.println("Total: $" + res1.getReservationTotal());

        // Test Reservation — double, weekend
        System.out.println();
        Reservation res2 = new Reservation("double", 2, true);
        System.out.println("Type: " + res2.getRoomType());
        System.out.println("Nights: " + res2.getNumberOfNights());
        System.out.println("Weekend? " + res2.isWeekend());
        System.out.println("Price per night: $" + res2.getPrice());
        System.out.println("Total: $" + res2.getReservationTotal());

        // Test Employee — under 40 hours
        System.out.println();
        System.out.println("===== EMPLOYEE TESTS =====");
        Employee emp1 = new Employee(101, "Alice", "Front Desk", 20.00, 35);
        System.out.println("Name: " + emp1.getName());
        System.out.println("Department: " + emp1.getDepartment());
        System.out.println("Hours worked: " + emp1.getHoursWorked());
        System.out.println("Regular hours: " + emp1.getRegularHours());
        System.out.println("Overtime hours: " + emp1.getOvertimeHours());
        System.out.println("Total pay: $" + emp1.getTotalPay());

        // Test Employee — over 40 hours (overtime)
        System.out.println();
        Employee emp2 = new Employee(102, "Bob", "Housekeeping", 20.00, 45);
        System.out.println("Name: " + emp2.getName());
        System.out.println("Department: " + emp2.getDepartment());
        System.out.println("Hours worked: " + emp2.getHoursWorked());
        System.out.println("Regular hours: " + emp2.getRegularHours());
        System.out.println("Overtime hours: " + emp2.getOvertimeHours());
        System.out.println("Total pay: $" + emp2.getTotalPay());

        // test employee punch card
        System.out.println();
        System.out.println("==== EMPLOYEE PUNCH CARD =====");
        Employee emp3 = new Employee(103, "charlie", "Maintenance", 18.00, 0);

        emp3.punchTimeCard(9);
        emp3.punchTimeCard(17);
        System.out.println("Hours after day 1: " + emp3.getHoursWorked());


        emp3.punchTimeCard(8);
        emp3.punchTimeCard(16);
        System.out.println("Hours after day 2: " + emp3.getHoursWorked());

        System.out.println("Total pay: $" + emp3.getTotalPay());
    }


}