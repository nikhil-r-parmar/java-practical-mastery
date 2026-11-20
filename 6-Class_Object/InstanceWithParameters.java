
// Pass values to an instance method and use them with object fields.

class Rectangle {
    double length = 10.0;
    double width = 5.0;

    public void calculateArea(double l, double w) {
        double area = length * width;
        double area2 = l * w;
        System.out.println("Area = " + (area + area2));
    }
}

public class InstanceWithParameters {
    public static void main(String[] args) {
        Rectangle area = new Rectangle();
        area.calculateArea(2.0, 3.0);
    }
}