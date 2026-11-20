
// Understand the difference between fields declared inside a class and local variables declared inside a method.

class Employee {
    int employeeId;
    double salary;

}

public class FieldvsLocal {
    public static void main(String[] args) {
        Employee employee = new Employee();

        double bonus = 5000.0;
        employee.employeeId = 18;
        employee.salary = 25000.0;

        System.out.println("Employee Id: " + employee.employeeId);
        System.out.println("Salary: " + employee.salary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Amount: " + (employee.salary + bonus));

    }
}