
// Combine method overloading with built-in String methods (.trim(), .toUpperCase(), .substring(), .length()) and char parameters.

public class StringFormatter {
    public static String format(String text) {
        return (text.trim()).toUpperCase();

    }

    public static String format(String text, int maxLength) {
        if (text.lenght() > maxLength) {
            return (text.substring(0, maxLenght)).append("...");
        } else {
            return text;
        }

    }

    public static String format() {

    }



}