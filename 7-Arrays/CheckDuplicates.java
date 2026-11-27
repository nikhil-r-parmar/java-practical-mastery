
// A company stores employee ID numbers in an array. It wants to check whether any ID appears more than once.

public class CheckDuplicates {
    public static void main(String[] args) {
        int[] ids = {101, 205, 310, 415, 205, 520};

        boolean duplicate = false;

        for (int i=0; i<ids.length; i++) {
            for (int j=i+1; j<ids.length; j++) {
                if (ids[i] == ids[j]) {
                    duplicate = true;
                }
            }
        }

        if (duplicate) {
            System.out.println("Duplicate Found");
        } else {
            System.out.println("No Duplicate Found");
        }

    }
}