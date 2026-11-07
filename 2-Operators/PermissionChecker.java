
// Implementation of Bitwise Operator:
// Author : Nikhil 
// 7/11/2026

public class PermissionChecker {
    public static void main(String args[])  {

        int READ = 4;   // binary = 100
        int WRITE = 2;  // binary = 010
        int EXECUTE = 1;    // binary = 001

        int userPermission = 5; // binary = 101

        System.out.println("Read Permission: " + ((userPermission & READ) == READ));
        System.out.println("Write Permission: " + ((userPermission & WRITE) == WRITE));
        System.out.println("Execute Permission: " + ((userPermission & EXECUTE) == EXECUTE));

        System.out.println("Combined Read & Write: " + (READ | WRITE));
        System.out.println("Write Toggeled: " + (userPermission ^ WRITE));
        System.out.println("XOR to userpermission: " + (~userPermission));



    }
}
