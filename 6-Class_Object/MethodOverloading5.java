

// ombine method overloading with method composition.

class Order {
    double price;
    int quantity;

    public double calculateTotal(int) {
        return price * quantity;

    }

}

public class MethodOverloading5 {
    public static void main(String[] args) {
        Order order = new Order();
        
        order.price = 200.0;
        order.quantity = 3;

    }
}