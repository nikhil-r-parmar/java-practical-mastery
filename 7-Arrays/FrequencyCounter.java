
// A teacher wants to count how many times each selected number appears in an array.

public class FrequencyCounter {
    public static void main(String[] args) {
        int[] numbers = {2, 5, 2, 8, 5, 2, 9, 8};

        int appear2 = 0;
        int appear5 = 0;
        int appear8 = 0;

        for (int i=0; i<numbers.length; i++) {
            if (numbers[i] == 2) {
                appear2++;
            } else if (numbers[i] == 5) {
                appear5++;
            } else if (numbers[i] == 8) {
                appear8++;
            }

        }

        System.out.println("Frequency of 2: " + appear2);
        System.out.println("Frequency of 5: " + appear5);
        System.out.println("Frequency of 8: " + appear8);


    }
}