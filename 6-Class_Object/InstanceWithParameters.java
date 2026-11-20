
// Pass values to an instance method and use them with object fields.

class Rectangle {
    double length = 10.0;
    double width = 5.0;

    calculateArea(double a, double b) {
        double area = length * width;
        System.out.println("Area = " + area);
    }
}