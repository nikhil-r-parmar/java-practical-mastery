
// Checked User is Eligibile for loan using If Else.
// Author : Nikhil 
// 8/11/2026

public class LoanEligibility {
    public static void main(String args[]) {

        int age = 25;
        double monthlyIncome = 35000;
        int creditScore = 750;
        boolean hasExistingLoan = false;

        // basic validation
        if (age>=21 && age<=60) {
            if (monthlyIncome >= 25000) {
                if (creditScore>=650) {

                    // Loan category check
                    if (creditScore>=750) {

                        // existing loan check
                        if (hasExistingLoan) {
                            System.out.println("Manual Verification Required");

                        } else {
                            System.out.println("Loan Approved");
                            System.out.println("Loan Category: Premium Loan");

                        }

                    } else if (creditScore<750 && creditScore>=700) {
                        if (hasExistingLoan) {
                            System.out.println("Manual Verification Required");

                        } else {
                            System.out.println("Loan Approved");
                            System.out.println("Loan Category: Standard Loan");

                        }

                    } else {
                        if (hasExistingLoan) {
                            System.out.println("Manual Verification Required");

                        } else {
                            System.out.println("Loan Approved");
                            System.out.println("Loan Category: Basic Loan");

                        }
                    }

                } else {
                    System.out.println("Credit Score not valid");

                }

            } else {
                System.out.println("Monthly Income not valid");

            }

        } else {
            System.out.println("Age not valid");
            
        }
    }
}