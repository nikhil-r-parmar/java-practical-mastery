
// Understand how multiple objects of the same class maintain separate field values.

class Mobile {
    int modelNumber;
    double price;
}

public class MultipleObjects {
    public static void main(String[] args) {
        Mobile mobile1 = new Mobile();
        Mobile mobile2 = new Mobile();

        mobile1.modelNumber = 101;
        mobile1.price = 15000.0;

        mobile2.modelNumber = 202;
        mobile2.price = 25000.0;

        System.out.println("Mobile 1 Model: " + mobile1.modelNumber);
        System.out.println("Mobile 1 Price: " + mobile1.price);
        System.out.println("Mobile 2 Model: " + mobile2.modelNumber);
        System.out.println("Mobile 2 Price: " + mobile2.price);

        mobile1.price = 18000.0;

        System.out.println("After updating Mobile 1:");
        System.out.println("Mobile 1 Price: " + mobile1.price);
        System.out.println("Mobile 2 Price: " + mobile2.price);

    }
}