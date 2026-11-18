
// Create a program that uses two methods to display a simple shopping bill.
// REASONING: Calling showWelcome() prints the welcome message once, while calling showBill() prints the bill details each time it is invoked.
// Neither method takes parameters or returns a value because both use void and print directly to the console.

public class ShoppingBill {

    // method that display's welcome message
    public static void showWelcome(){
        System.out.println("Welcome to My Store");
    }

    // method that display's bill
    public static void showBill() {
        System.out.println("Item: Notebook");
        System.out.println("Price: 50");
    }

    public static void main(String[] args) {
        showWelcome();  // called welcome method once

        // called show bill method twise
        showBill();
        showBill();

    }
}