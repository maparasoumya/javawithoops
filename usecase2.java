class Employee {
    String name;
    double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double calculateSalary() {
        return baseSalary + (0.06 * baseSalary); 
    }
}

class Manager extends Employee {

    public Manager(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        double salary = super.calculateSalary();
        salary += 2000;
        return salary;
    }
}

class Executive extends Manager {

    public Executive(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        double salary = super.calculateSalary(); 
        salary += 0.10 * baseSalary; 
        return salary;
    }
}

public class cs2 {
    public static void main(String[] args) {

        Employee e1 = new Employee("Soumya M", 100000);
        System.out.printf("Employee 1 Output: %.2f\n", e1.calculateSalary()); 

        Employee e2 = new Manager("Rahul", 56900);
        System.out.printf("Employee 2 Output: %.2f\n", e2.calculateSalary()); 

        Employee e3 = new Executive("Nihiti", 59999);
        System.out.printf("Employee 3 Output: %.2f\n", e3.calculateSalary()); 
    }
}
