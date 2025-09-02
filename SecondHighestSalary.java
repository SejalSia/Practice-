import java.util.ArrayList;
import java.util.List;

class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

public class SecondHighestSalary {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 60000.0));
        employees.add(new Employee("Jane", 75000.0));
        employees.add(new Employee("Bob", 55000.0));
        employees.add(new Employee("Alice", 80000.0));

        // Use Java 8 streams to find the second-highest salary
        double secondHighestSalary = employees.stream()
                .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
                .skip(1)
                .findFirst()
                .map(Employee::getSalary)
                .orElse(0.0);

        System.out.println("Second-highest salary: " + secondHighestSalary);
    }
}
