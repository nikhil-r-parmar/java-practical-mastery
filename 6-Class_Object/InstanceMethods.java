

// Create and call an instance method that uses its object's own fields.

class BankAccount {
    int accountNumber = 1801;
    double balance = 10000;

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);

    }
}

public class InstanceMethods {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.displayAccountDetails();

    }
}