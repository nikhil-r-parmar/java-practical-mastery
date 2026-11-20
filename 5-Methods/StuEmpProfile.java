
//  Practice overloading by changing the sequence (order) of parameter types—even when the number and types of parameters are identical.

public class StuEmpProfile {
    public static void display(int id, String name) {
        System.out.println("1. Student: <" + name + "> | Roll No: <" + id + ">");

    }

    public static void display(String name, int id) {
        System.out.println("Employee ID: <" + id + "> | Name: <" + name + ">");

    }

    public static void display(String name, double marks) {
        System.out.println("1. Student: <" + name + "> | Marks: <" + marks + ">");

    }

    public static void main(String[] args) {
        display(18, "Nikhil");
        display("Prem", 5);
        display("Tushar", 99.9);

    }

}