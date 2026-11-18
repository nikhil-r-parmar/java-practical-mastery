
// Create a program that uses two methods to display a simple shopping bill.

public class ShoppingBill {

    public static void showWelcome(){
        System.out.println("Welcome to My Store");
    }

    public static void showBill() {
        System.out.println("Item: Notebook");
        System.out.println("Price: 50");
    }

    public static void main(String[] args) {
        showWelcome();
        showBill();
        showBill();

    }
}