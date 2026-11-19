
// Create a class representing a product in a shop. Create one object and display its default field values.

class Product {
    int quantity;
    double price;
    boolean available;

}

public class DefaultField {
    public static void main(String[] args) {
        Product Product = new Product();

        System.out.println("Quantity: " + Product.quantity);
        System.out.println("Price: " + Product.price);
        System.out.println("Available: " + Product.available);
    }
}