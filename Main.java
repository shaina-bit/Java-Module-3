class Employee {

    // Properties
    private int salary;
    private String name;

    // Constructor
    public Employee(int salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    // Method to return salary
    public int getSalary() {
        return salary;
    }

    // Method to return name
    public String getName() {
        return name;
    }

    // Method to change name
    public void setName(String newName) {
        this.name = newName;
    }
}

public class Main {
    public static void main(String[] args) {

        // Create an Employee object
        Employee emp = new Employee(50000, "Shaina");

        // Test methods
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Salary: " + emp.getSalary());

        // Change name
        emp.setName("Akshaya");

        System.out.println("Updated Name: " + emp.getName());
    }
}
