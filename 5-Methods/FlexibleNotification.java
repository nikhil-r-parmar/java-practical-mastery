
// Practice overloading by adding optional parameters (different parameter counts) using void static methods in a single class.

public class FlexibleNotification {
    public static void send(String message) {
        System.out.println("[INFO] <" + message + ">");

    }

    public static void send(String recipient, String message) {
        System.out.println("TO <" + recipient + ">: <" + message + ">");

    }

    public static void send(String recipient, String message, int priority) {
        System.out.println("[Priority <" + priority + ">] To <" + recipient + ">: <" + message + ">");

    }

    public static void main(String[] args) {

        send("Hello World");
        send("Nikhil","Hello Nikhil");
        send("K30", "Hello Khushi", 1);

    }
}