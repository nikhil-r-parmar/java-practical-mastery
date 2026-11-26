
// A company wants to increase every employee's salary by ₹5,000.
// Create an integer array named salary.
// Increase every salary by 5000 and update the original array.

public class UpdateElements {
    public static void main(String[] args) {
        int[] salary = {20000, 25000, 30000, 35000, 40000};

        System.out.println("Updated Salaries: ");
        for(int i=0; i<salary.length; i++) {
            salary[i] += 5000;
            System.out.println(salary[i]);
        }

    }
}