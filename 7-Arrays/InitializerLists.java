
// Create arrays using initializer lists and practise accessing elements through their indexes.

public class InitializerLists {
    public static void main(String[] args) {
        int[] ages = {18, 20, 22, 24};
        double[] prices = {99.5, 149.0, 199.5};
        String[] names = {"Amit", "Rahul", "Neha"};

        System.out.println("Ages Length: " + ages.length);
        System.out.println("Prices Length: " + prices.length);
        System.out.println("Names Length: " + names.length);

        System.out.println("\nAge First: " + ages[0]);
        System.out.println("Age Last: " + ages[ages.length - 1]);

        System.out.println("\nPrices First: " + prices[0]);
        System.out.println("Prices Last: " + prices[prices.length - 1]);
        
        System.out.println("\nNames First: " + names[0]);
        System.out.println("Names Last: " + names[names.length - 1]);

    }
}