
// Implementation of Arithmetic & Assignment Operator:
// Author : Nikhil 
// 6/11/2026

public class EmployeeSalary {
    public static void main(String args[]) {

        double basicSalary = 25000;
        double bonus = 5000;
        double deduction = 2000;
        System.out.println(basicSalary);

        // addition + assignment
        basicSalary += bonus;       // BasicSalary = BasicSalary/100 * 10 bonus
        System.out.println(basicSalary);

        // subtraction + assignment
        basicSalary -= deduction;
        System.out.println(basicSalary);

        // multiplication + assignment
        basicSalary *= 1.1;
        System.out.println(basicSalary);

        // division + assignment
        basicSalary /= 2;
        System.out.println(basicSalary);
        

    }
}