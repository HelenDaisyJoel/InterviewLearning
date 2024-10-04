package Learning;

import java.util.HashSet;

public class RemoveStringOccurrences {
    public static void main(String[] args) {
        // Creating a HashSet to store strings
        HashSet<String> stringSet = new HashSet<>();

        // Adding strings to the HashSet
        stringSet.add("Java is the Programming language");
        stringSet.add("I know Java to script coding");
        stringSet.add("Orange");
        stringSet.add("Mango");
        stringSet.add("Grapes");

        // Displaying the original HashSet
        System.out.println("Original HashSet: " + stringSet);

        // Strings to remove
        String stringToRemove1 = "Banana";
        String stringToRemove2 = "Grapes";

        // Removing the specified strings
        stringSet.remove(stringToRemove1);
        stringSet.remove(stringToRemove2);

        // Displaying the HashSet after removal
        System.out.println("HashSet after removing '" + stringToRemove1 + "' and '" + stringToRemove2 + "': " + stringSet);
    }
}
