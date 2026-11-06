// Program to implement Manual (explicit) type conversion
// 6/11/2026
// author: Nikhil

public class ExplicitTypeConversion {
    public static void main(String args[]) {

        // A small temperature conversion program.

        double temp = 36.8; // celcius
        System.out.println(temp);

        // converting to integer
        int temprature = (int) temp;
        System.out.println(temprature);

        	
        double difference = temp - temprature;
        System.out.println(difference);
        

        double temp2 = 99.99;
        System.out.println(temp2);

        // converting to integer
        int temprature2 = (int) temp2;
        System.out.println(temprature2);

    }
}