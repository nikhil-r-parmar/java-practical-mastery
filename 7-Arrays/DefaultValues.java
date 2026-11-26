
// Create arrays using different data types and understand their default values.

public class DefaultValues {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        double[] prices = new double[3];
        char[] grades = new char[3];
        boolean[] isPassed = new boolean[3];

        System.out.println("Integer Defaults: ");
        for (int i=0; i<numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("Double Defaults: ");
        for (int i=0; i<prices.length; i++) {
            System.out.println(prices[i]);
        }

        System.out.println("Character Defaults: ");
        for (int i=0; i<grades.length; i++) {
            System.out.println(grades[i]);
        }

        System.out.println("Boolean Defaults: ");
        for (int i=0; i<isPassed.length; i++) {
            System.out.println(isPassed[i]);
        }

    }
}