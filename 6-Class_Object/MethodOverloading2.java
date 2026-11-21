

// Understand method overloading when parameter types differ.

class DisplayInfo {
    public void display(int number) {
        System.out.println("Integer Value: " + number);

    }

    public void display(double number) {
        System.out.println("Decimal Value: " + number);

    }
}

public class MethodOverloading2 {
    public static void main(String[] args) {
        DisplayInfo info = new DisplayInfo();

        info.display(18);
        info.display(85.5);

    }
}