
// Combine method overloading with object fields and return values.

class BillCalculator {
    double price;

    public double calculateBill(int quantity) {
        return price * quantity;
    }

    public double calculateBill(int quantity, int discount) {
        return (price * quantity) - discount;
    }

}

public class MethodOverloading3 {
    public static void main(String[] args) {
        BillCalculator bill = new BillCalculator(); 

        bill.price = 100.0;

        System.out.println("Bill without Discount: " + bill.calculateBill(5));
        System.out.println("Bill with Discount: " + bill.calculateBill(5, 100));

    }
}