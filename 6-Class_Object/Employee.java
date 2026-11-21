
// Independent Objects with Method Composition

public class Employee {
    double salary;
    double bonus;

    double calculateTotalSalary() {
        return salary + bonus;
    }

    void displaySalary() {
        double total = calculateTotalSalary();
        if (salary == 25000.0) {
            System.out.println("Employee 1 Total Salary: " + total);
        } else {
            System.out.println("Employee 2 Total Salary: " + total);
        }
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();

        emp1.salary = 25000.0;
        emp1.bonus = 3000.0;

        emp2.salary = 30000.0;
        emp2.bonus = 5000.0;

        emp1.displaySalary();
        emp2.displaySalary();
    }
}
