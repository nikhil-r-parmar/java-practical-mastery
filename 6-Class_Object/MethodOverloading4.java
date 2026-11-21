
// Understand how overloaded instance methods work independently with different objects.

class Temprature {
    double celsius;

    public double convert() {
        return celsius;
    }

    public double convert(double adjustment) {
        return celsius + adjustment;
    }

}

public class MethodOverloading4 {
    public static void main(String[] args) {
        Temprature temp1 = new Temprature();
        Temprature temp2 = new Temprature();

        temp1.celsius = 25.0;
        temp2.celsius = 30.0;

    }
}