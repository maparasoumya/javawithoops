import java.util.ArrayList;
import java.util.List;

class Employee {
    private String employeeId;
    private String name;
    private String role;
    private double baseSalary;
    private double deduction;

    // Constructor
    public Employee(String employeeId, String name, String role, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.role = role;
        this.baseSalary = baseSalary;
        this.deduction = 0;
    }

    // Calculate salary based on role using switch-case
    public double calculateSalary() {
        double salary = 0;

        switch (role.toLowerCase()) {
            case "manager":
                salary = baseSalary + (baseSalary * 0.20);
                break;
            case "developer":
                salary = baseSalary + (baseSalary * 0.10);
                break;
            case "designer":
                salary = baseSalary + (baseSalary * 0.05);
                break;
            case "intern":
                salary = 1000;
                break;
            default:
                salary = baseSalary;
                break;
        }

        return salary - deduction;
    }

    // Apply deduction to the salary
    public void applyDeduction(double amount) {
        if (amount > 0) {
            this.deduction = amount;
        }
    }

    // Display employee details
    public void displayEmployeeDetails() {
        double salary = calculateSalary();
        System.out.println("\n===== Employee Details =====");
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Base Salary: $" + baseSalary);
        System.out.println("Deduction: $" + deduction);
        System.out.println("Monthly Salary: $" + String.format("%.2f", salary));
        System.out.println("=============================");
    }

    // Getters
    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public double getBaseSalary() {
        return baseSalary;
    }
}

class Payroll {
    private List<Employee> employees;

    // Constructor
    public Payroll() {
        this.employees = new ArrayList<>();
    }

    // Add employee to payroll
    public void addEmployee(Employee employee) {
        employees.add(employee);
        System.out.println("Employee " + employee.getName() + " added to payroll successfully!");
    }

    // Calculate and display salaries of all employees
    public void calculateAllSalaries() {
        if (employees.isEmpty()) {
            System.out.println("\nNo employees in the payroll!");
            return;
        }

        System.out.println("\n========== PAYROLL SUMMARY ==========");
        double totalPayroll = 0;

        for (Employee employee : employees) {
            double salary = employee.calculateSalary();
            totalPayroll += salary;
            System.out.println(employee.getName() + " (" + employee.getRole() + "): $" + String.format("%.2f", salary));
        }

        System.out.println("-------------------------------------");
        System.out.println("Total Monthly Payroll: $" + String.format("%.2f", totalPayroll));
        System.out.println("=====================================\n");
    }

    // Find employee by ID
    public Employee findEmployeeById(String employeeId) {
        for (Employee employee : employees) {
            if (employee.getEmployeeId().equals(employeeId)) {
                return employee;
            }
        }
        return null;
    }

    // Get all employees
    public List<Employee> getAllEmployees() {
        return employees;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a Payroll object
        Payroll payroll = new Payroll();

        // Create employees with different roles
        Employee emp1 = new Employee("E001", "Alice Johnson", "Manager", 5000);
        Employee emp2 = new Employee("E002", "Bob Smith", "Developer", 4000);
        Employee emp3 = new Employee("E003", "Carol Davis", "Designer", 3500);
        Employee emp4 = new Employee("E004", "David Wilson", "Intern", 2000);

        // Add employees to payroll
        payroll.addEmployee(emp1);
        payroll.addEmployee(emp2);
        payroll.addEmployee(emp3);
        payroll.addEmployee(emp4);

        // Apply deductions to some employees
        emp1.applyDeduction(200);
        emp2.applyDeduction(100);

        // Display details of individual employees
        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();
        emp3.displayEmployeeDetails();
        emp4.displayEmployeeDetails();

        // Calculate and display all salaries
        payroll.calculateAllSalaries();

        // Find an employee by ID
        System.out.println("===== Finding Employee =====");
        Employee foundEmployee = payroll.findEmployeeById("E002");
        if (foundEmployee != null) {
            System.out.println("Found: " + foundEmployee.getName() + " - " + foundEmployee.getRole());
        } else {
            System.out.println("Employee not found!");
        }
        System.out.println("=============================\n");

        // Test with invalid employee ID
        Employee notFound = payroll.findEmployeeById("E999");
        if (notFound == null) {
            System.out.println("Employee with ID E999 does not exist in the system.\n");
        }
    }
}
