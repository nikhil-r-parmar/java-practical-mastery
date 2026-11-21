
// Understand how multiple methods can share the same name but have different parameter lists.

class AreaCalculator {
    public int calculateArea(int side) {
        return side * side;

    }

    int calculateArea(int length, int width) {
        return length * width;

    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        AreaCalculator calculate = new AreaCalculator();

        System.out.println("Square Area: " + calculate.calculateArea(5));
        System.out.println("Rectangle Area: " + calculate.calculateArea(10, 4));

    }

}