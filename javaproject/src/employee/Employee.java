package employee;
public class Employee {
    private String name;
    private int employeeId;
    private double salary;

    // Default constructor
    public Employee() {
        this.name = "Unknown";
        this.employeeId = 0;
        this.salary = 0.0;
    }

    // Constructor with name parameter
    public Employee(String name) {
        this.name = name;
        this.employeeId = 0;
        this.salary = 0.0;
    }

    // Constructor with name and employeeId parameters
    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = 0.0;
    }

    // Constructor with all parameters
    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public double getSalary() {
        return salary;
    }

    // Sample code snippet demonstrating the creation of Employee objects using different constructors
    public static void main(String[] args) {
        // Using the default constructor
        Employee defaultEmployee = new Employee();
        System.out.println("Default Employee: " + defaultEmployee.getName() +
                ", ID: " + defaultEmployee.getEmployeeId() +
                ", Salary: " + defaultEmployee.getSalary());

        // Using the constructor with name parameter
        Employee nameOnlyEmployee = new Employee("John Doe");
        System.out.println("Employee with Name Only: " + nameOnlyEmployee.getName() +
                ", ID: " + nameOnlyEmployee.getEmployeeId() +
                ", Salary: " + nameOnlyEmployee.getSalary());

        // Using the constructor with name and employeeId parameters
        Employee nameAndIdEmployee = new Employee("Jane Smith", 12345);
        System.out.println("Employee with Name and ID: " + nameAndIdEmployee.getName() +
                ", ID: " + nameAndIdEmployee.getEmployeeId() +
                ", Salary: " + nameAndIdEmployee.getSalary());

        // Using the constructor with all parameters
        Employee fullEmployee = new Employee("Bob Johnson", 67890, 50000.0);
        System.out.println("Full Employee: " + fullEmployee.getName() +
                ", ID: " + fullEmployee.getEmployeeId() +
                ", Salary: " + fullEmployee.getSalary());
    }
}

