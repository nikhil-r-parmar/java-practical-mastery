
// Combine method overloading with built-in String methods (.trim(), .toUpperCase(), .substring(), .length()) and char parameters.

public class StringFormatter {
    public static String format(String text) {
        return (text.trim()).toUpperCase();

    }

    public static String format(String text, int maxLength) {
        if (text.length() > maxLength) {
            return ((text.substring(0, maxLength)) + "...");
        } else {
            return text;
        }

    }

    public static String format(String text, char borderChar) {
        return (borderChar + text.trim() + borderChar);

    }

    public static void main(String[] args) {
        System.out.println(format("nickyp"));
        System.out.println(format("nickyp", 5));
        System.out.println(format("nickyp", '^'));

    }

}