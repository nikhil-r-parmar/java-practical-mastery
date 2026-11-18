
// The following program contains multiple method-related errors. Find and fix them.

public class MethodDebug {

    public static int calculateTotal(int price, int quantity) {
        int total = price * quantity;
        return total
    }

    public static boolean isAffordable(int total, int budget) {
        if (total <= budget) {
            return true;
        }
        return false;
    }

    public static void displayResult(int price, int quantity, int budget) {

        int total = calculateTotal(price, quantity);
        boolean affordable = isAffordable(total, budget);

        if (affordable) {
            System.out.println("Affordable");
        } else {
            System.out.println("Not Affordable");
        }
    }

    public static void showMessage() {
        System.out.println("Purchase Check Complete");
    }

    public static void main(String[] args) {
        displayResult(100, 2, 300);
    }
}