
// Create a program that calculates and displays an employee's salary details using a method.

public class EmpSalary {
    public static void displaySalary(int basic, int bonus, int deduction) {
        int final_salary = basic+bonus - deduction;
        System.out.println("Final Salary: " + final_salary);

    }

    public static void main(String[] args) {
        displaySalary(20000, 7000, 2000);

    }
}