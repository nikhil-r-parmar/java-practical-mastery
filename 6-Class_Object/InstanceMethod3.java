
// Understand how an instance method can call another instance method of the same class.

class Shop {
    double price;
    int quantity;

    public double calculateTotal() {
        return price * quantity;
    }

    public void displayBill() {
        System.out.println("Total Bill: " + calculateTotal());
    }
}

public class InstanceMethod3 {
    public static void main(String[] args) {

    }
}