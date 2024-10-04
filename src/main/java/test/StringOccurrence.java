package test;

import java.util.HashMap;
import java.util.Map;

public class StringOccurrence {
    
    public static void main(String[] args) {
        String str = "Hello World of Java";
        
        // Call the method to count occurrences
        countCharacterOccurrences(str);
    }

    public static void countCharacterOccurrences(String str) {
        // Create a HashMap to store character counts
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Convert the string to lower case to make the count case-insensitive
        str = str.toLowerCase();

        // Iterate through each character in the string
        for (char item : str.toCharArray()) {
            // Ignore spaces
            if (item != ' ') {
                // Update the count of the character
                charCountMap.put(item, charCountMap.getOrDefault(item, 0) + 1);
            }
        }

        // Print the character counts
        System.out.println("Character occurrences in the string:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
