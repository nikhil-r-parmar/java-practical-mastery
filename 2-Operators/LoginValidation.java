
// Logical Operators Challenge:
// Author : Nikhil 
// 6/11/2026

public class LoginValidation {
    public static void main(String args[]) {

        String correctUsername = "nikhil";
        String correctPassword = "java123";
        String enteredUsername = "nikhil";
        String enteredPassword = "java123";
        boolean accountActive = true;

        System.out.println("Username Matched?: " + (correctUsername.equals(enteredUsername)));
        System.out.println("Password Matched?: " + (correctPassword.equals(enteredPassword)));
        System.out.println("Both Matched?: " + ((correctUsername.equals(enteredUsername)) && (correctPassword.equals(enteredPassword))));

        enteredUsername = "nikhil";
        enteredPassword = "KHUSHI";
        System.out.println("Both Matched?: " + ((correctUsername.equals(enteredUsername)) && (correctPassword.equals(enteredPassword))));
        System.out.println("Anyone Incorrect?: " + ((!(correctUsername.equals(enteredUsername)) || (!(correctPassword.equals(enteredPassword))))));

        
        enteredUsername = "nicky";
        enteredPassword = "java123";
        System.out.println("Both Matched?: " + ((correctUsername.equals(enteredUsername)) && (correctPassword.equals(enteredPassword))));
        System.out.println("Anyone Incorrect?: " + ((!(correctUsername.equals(enteredUsername)) || (!(correctPassword.equals(enteredPassword))))));


        enteredUsername = "nikhil";
        System.out.println("Account is Active?: " + accountActive);
        System.out.println("Account is inactive?: " + !(accountActive));
        System.out.println("Anyone Incorrect?: " + ((!(correctUsername.equals(enteredUsername)) || (!(correctPassword.equals(enteredPassword))))));
        
        enteredPassword = "NickyP";
        System.out.println("Password Matched?: " + (correctPassword.equals(enteredPassword)));
    


    }
}