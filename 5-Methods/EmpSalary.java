
// Create a program that calculates and displays an employee's salary details using a method.

public class EmpSalary {
    public static void displaySalary(double basic, double bonus, double deduction) {
        double final_salary = basic+bonus - deduction;
        System.out.println("Final Salary: " + final_salary);
        
    }
}