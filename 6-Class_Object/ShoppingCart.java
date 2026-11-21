
// Combine independent objects, overloaded instance methods, parameters, return values and method composition.

public class ShoppingCart {
    double itemPrice;
    double itemQuantity;

    calculateTotal() {
        return itemPrice * itemQuantity;

    }

    calculateTotal(double discount) {
        return calculateTotal() - discount;

    }

    displayBill() {
        System.out.println("Origional Total: " + calculateTotal());
        System.out.println("Discounted Total: " + calculateTotal(100.0));

    }

    public static void main(String[] args) {
        ShoppingCart cart1 = new ShoppingCart();
        cart1.itemPrice = 150.0;
        cart1.itemQuantity = 4;

        ShoppingCart cart2 = new ShoppingCart();
        cart1.itemPrice = 200.0;
        cart1.itemQuantity = 3;
        


    }

}