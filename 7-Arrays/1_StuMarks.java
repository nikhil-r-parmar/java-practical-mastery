
// A student wants to store marks for five subjects.
// Using five separate variables would make the data difficult to manage. Use one integer array instead.

public class 1_StuMarks {
    public static void main(String[] args) {

        int marks[5] = new marks[5];

        marks[0] = 99;
        marks[1] = 32;
        marks[2] = 54;
        marks[3] = 67;
        marks[4] = 75;

        System.out.println("Subject 1: " + marks[0]);
        System.out.println("Subject 2: " + marks[1]);
        System.out.println("Subject 3: " + marks[2]);
        System.out.println("Subject 4: " + marks[3]);
        System.out.println("Subject 5: " + marks[4]);

    }
}
