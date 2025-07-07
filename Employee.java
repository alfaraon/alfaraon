package employeemanagement;

public class Employee {
    private int employeeId;
    private String firstName;
    private String lastName;
    private String position;
    private double basicSalary;

    public Employee(int employeeId, String firstName, String lastName, String position, double basicSalary) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.basicSalary = basicSalary;
    }

    public String getDetails() {
        return employeeId + ": " + firstName + " " + lastName + " (" + position + ")";
    }
}