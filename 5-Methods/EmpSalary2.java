
// Create a program that calculates an employee's final salary using multiple methods.

public class EmpSalary2 {

    public static int calculateGrossSalary(int basic, int bonus) {
        int sum = basic + bonus;
        return sum;

    }

    public static int calculatenetSalary(int gross, int deduct) {
        int netSalary = gross - deduct;
        return netSalary;
        
    }

    public static void main(String[] args) {

    }

}