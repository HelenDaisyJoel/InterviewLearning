package test;

import java.util.HashMap;

public class CharacterOccurrence {
    public static void main(String[] args) {
        String word = "programming";

        // Create a HashMap to store character occurrences
        HashMap<Character, Integer> charCount = new HashMap<>();

        // Count occurrences of each character
        for (char c : word.toCharArray()) {
            // Use getOrDefault to handle characters not yet in the map
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Print the occurrences
        System.out.println("Character occurrences in the word \"" + word + "\":");
        for (char c : charCount.keySet()) {
            System.out.println(c + ": " + charCount.get(c));
        }
    }
}
