

// ombine method overloading with method composition.

class Order {
    double price;
    int quantity;

    public double calculateTotal() {
        return price * quantity;

    }

    public double calculateTotal(int discount) {
        return calculateTotal() - discount;

    }

}

public class MethodOverloading5 {
    public static void main(String[] args) {
        Order order = new Order();
        
        order.price = 200.0;
        order.quantity = 3;

        System.out.println("Origional Total: " + order.calculateTotal());
        System.out.println("Discounted Total: " + order.calculateTotal(100));

    }
}