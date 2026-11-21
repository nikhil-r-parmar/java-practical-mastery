
// Combine independent objects, overloaded instance methods, parameters, return values and method composition.

public class ShoppingCart {
    double itemPrice;
    int itemQuantity;

    double calculateTotal() {
        return itemPrice * itemQuantity;

    }

    double calculateTotal(double discount) {
        return calculateTotal() - discount;

    }

    void displayBill(double discount) {
        System.out.println("Origional Total: " + calculateTotal());
        System.out.println("Discounted Total: " + calculateTotal(discount));

    }

    public static void main(String[] args) {
        ShoppingCart cart1 = new ShoppingCart();
        cart1.itemPrice = 150.0;
        cart1.itemQuantity = 4;
        cart1.displayBill(100.0);

        ShoppingCart cart2 = new ShoppingCart();
        cart2.itemPrice = 200.0;
        cart2.itemQuantity = 3;
        cart2.displayBill(150.0);

    }

}