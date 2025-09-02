import java.util.*;
class Employee {
    // Attributes
    String name;
    int id;
    double basicSalary;

    // Constructor
    Employee(String name, int id, double basicSalary) {
        this.name = name;
        this.id = id;
        this.basicSalary = basicSalary;
    }

    // Method to calculate net salary
    double calculateNetSalary() {
        double hra = 0.2 * basicSalary;  // House Rent Allowance
        double da = 0.1 * basicSalary;   // Dearness Allowance
        double tax = 0.05 * basicSalary; // Tax deduction
        return basicSalary + hra + da - tax;
    }

    // Method to display employee details
    void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Net Salary: ₹" + calculateNetSalary());
    }
}

public class payroll{
    public static void main(String[] args) {
        // Creating employee objects
        Employee emp1 = new Employee("Ravi", 101, 30000);
        Employee emp2 = new Employee("Anjali", 102, 40000);

        // Displaying their salary details
        emp1.displayDetails();
        System.out.println();
        emp2.displayDetails();
    }
}