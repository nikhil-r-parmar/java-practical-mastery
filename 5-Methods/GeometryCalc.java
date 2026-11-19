
//Practice overloading by changing the number and data types of parameters.

public class GeometryCalc {
    public static int area(int side) {
        return side * side;
    }

    public static int area(int length, int breadth) {
        return length * breadth;
    }

    public staic double area(double radius) {
        return 3.14 * radius * radius;
    }

    public static double area(double base, double height) {
        return (0.5 * base * height);
    }

    public static void main(String[] args) {

    }
}