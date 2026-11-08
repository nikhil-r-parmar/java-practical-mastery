
// An Program to implement If-Else-If statements
// Author : Nikhil 
// 8/11/2026

public class ElectricityBill {
    public static void main(String args[]) {

        int usedUnits = 250;
        double charge = 0;

        
        if (usedUnits > 0) {

            if(usedUnits<=100) {
                charge = usedUnits * 3;

            } else if (usedUnits<=200) {
                charge = (100 * 3) + ((usedUnits - 100) * 5);

            } else {
                charge = (100 * 3) + (100*5) + ((usedUnits - 200) * 7);

            } 

            double meterCharge = 50;
            charge += meterCharge;
            System.out.println("Used Units: " + usedUnits);
            System.out.println("Charge = " + charge + "Rs.");

        } else {
            System.out.println("Invalid Units");

        }
    }
}