
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

public class MultipleMethods {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Addition: " + calc.add());
        System.out.println("Subtraction: " + calc.subtract());
        System.out.println("Multiplication: " + calc.multiply());

    }
}