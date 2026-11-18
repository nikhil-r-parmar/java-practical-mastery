
// Create a program that calculates an employee's final salary using multiple methods.

public class EmpSalary2 {

    public static int calculateGrossSalary(int basic, int bonus) {
        int sum = basic + bonus;
        return sum;

    }

    public static int calculateNetSalary(int gross, int deduct) {
        int netSalary = gross - deduct;
        return netSalary;

    }

    public static void displaySalary(int basic, int bonus, int deduct) { 
        int grossSalary = calculateGrossSalary(basic, bonus);
        int netSalary = calculateNetSalary(grossSalary, deduct);

        System.out.println("Net Salary: " + netSalary);

    }

    public static void main(String[] args) {

        displaySalary(20000, 5000, 2000);
        displaySalary(15000, 3000, 1000);

    }

}