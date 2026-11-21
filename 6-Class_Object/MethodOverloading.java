
// Understand how multiple methods can share the same name but have different parameter lists.

class AreaCalculator {
    public int calculateArea(int side) {
        return side * side;

    }

    int calculateArea(int length, int width) {
        return length * width;
        
    }
}