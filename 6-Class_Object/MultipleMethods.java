
// Create multiple methods that perform different operations using the same object's fields.

class Calculator {
    int number1 = 18;
    int number2 = 6;

    public int add() {
        return number1+number2;
    }

    public int subtract() {
        return number1-number2;
    }

    public int multiply() {
        return number1*number2;
    }
}