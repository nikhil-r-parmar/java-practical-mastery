
// Create an integer array named numbers, and Reverse the elements inside the original array.

public class ReverseElements {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        int j=0;
        for (int i=(numbers.length-1); i>=0; i--){
            if (i == j) {
                break;
            }
            int temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
            j++;
        }

        for (int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }

    }
}