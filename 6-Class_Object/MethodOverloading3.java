
// Combine method overloading with object fields and return values.

class BillCalculator {
    double price;

    public double calculateBill(int quantity) {
        return quantity * quantity;
    }

    public double calculateBill(int quantity, int discount) {
        return (price * quantity) - discount;
    }

}

public class MethodOverloading3 {
    public static void main(String[] args) {
        BillCalculator bill = new BillCalculator(); 

        bill.price = 100.0;



    }
}