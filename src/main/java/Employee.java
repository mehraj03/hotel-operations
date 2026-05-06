import java.time.LocalDateTime;
public class Employee {
    private int employeeId;
    private int startTime;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    // Constructor
    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.startTime = 0;
    }

    // Regular getters
    public int getEmployeeId() {
        return this.employeeId;
    }

    public String getName() {
        return this.name;
    }

    public String getDepartment() {
        return this.department;
    }

    public double getPayRate() {
        return this.payRate;
    }

    public double getHoursWorked() {
        return this.hoursWorked;
    }

    // Setter for hoursWorked (might need to update during the week)
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    // DERIVED getter — regular hours (capped at 40)
    public double getRegularHours() {
        if (this.hoursWorked > 40) {
            return 40;
        }
        return this.hoursWorked;
    }

    // DERIVED getter — overtime hours (anything over 40)
    public double getOvertimeHours() {
        if (this.hoursWorked > 40) {
            return this.hoursWorked - 40;
        }
        return 0;
    }

    // DERIVED getter — total pay
    public double getTotalPay() {
        double regularPay = getRegularHours() * this.payRate;
        double overtimePay = getOvertimeHours() * this.payRate * 1.5;
        return regularPay + overtimePay;
    }
    //punch in with sepcific time
    public void punchIn(int time) {
        this.startTime = time;
    }
    // overload punchin
    public void punchIn() {
        LocalDateTime now = LocalDateTime.now();
        int currentHour = now.getHour();
        this.startTime = currentHour;
    }
    // punch out
    public void punchOut(int time) {
        int hoursThisShift = time - this.startTime;
        this.hoursWorked = this.hoursWorked + hoursThisShift;
        this.startTime = 0;
    }
    // overload punchout
    public void punchOut() {
        LocalDateTime now = LocalDateTime.now();
        int currentHour = now.getHour();
        int hoursThisShift = currentHour - this.startTime;
        this.hoursWorked = this.hoursWorked + hoursThisShift;
        this.startTime = 0;
    }
}
