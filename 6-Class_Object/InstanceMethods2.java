

// Combine object fields, method parameters, and return values.

class Employee {
    double basicSalary;
    double bonus;

    public double calculateSalary(double extraAllowance) {
        return basicSalary+bonus+extraAllowance;

    }

}

public class InstanceMethods2 {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.basicSalary = 20000.0;
        employee.bonus = 3000.0;

        double totalSalary = employee.calculateSalary(2000.0);

        System.out.println("Total Salary: " + totalSalary);

    }
}