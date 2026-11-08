
// Checked College Admission Eligibility using Nested If Else.
// Author : Nikhil 
// 8/11/2026

public class CollegeAdmission {
    public static void main (String args[]) {

        int age = 18;
        double twelthMarks = 72;
        boolean twelthPassed = true;

        if (age>=17) {
            if (twelthPassed){
                if (twelthMarks >= 50) {
                    if (twelthMarks >= 75) {
                        System.out.println("Direct Admission");

                    } else if (twelthMarks>=60) {
                        System.out.println("Merit Admission");

                    } else {
                        System.out.println("Regular Admission");

                    }

                } else {
                    System.out.println("not eligible beacuse less 12th marks.");

                }

            } else {
                System.out.println("12th Failed.");

            }

        } else {
            System.out.println("Age not eligible.");

        }
    }
}