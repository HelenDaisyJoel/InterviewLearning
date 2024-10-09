package test;

import java.util.HashMap;

public class WordOccurrence {
    public static void main(String[] args) {
        String input1 = "Java is the programming language";

        // Split the string into words
        String[] words = input1.split(" ");

        // Create a HashMap to store word occurrences
        HashMap<String, Integer> wordCount = new HashMap<>();

        // Count occurrences of each word
        for (String word : words) {
            // Remove punctuation and convert to lowercase for uniformity
            word = word.toLowerCase().trim();
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Print the occurrences
        System.out.println("Word occurrences:");
        for (String word : wordCount.keySet()) {
            System.out.println(word + ": " + wordCount.get(word));
        }
    }
}
