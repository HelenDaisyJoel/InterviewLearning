package test;

import java.util.HashMap;
import java.util.Map;

public class WordOccurrance {

    public static void main(String[] args) {
        String str1 = "Hello a world is of Java";
        String str2 = "Java is a powerful world";
        Map<String, Integer> wordCountMap = new HashMap<>();
        
        String word1=str1.toLowerCase();
        String word2=str2.toLowerCase();
        
        String[] words1= str1.split("\\s+"); 
        String[] words2= str2.split("\\s+");
        
        for (String word : words1) {
            // Update the count of the word
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }
        for (String word : words2) {
            // Update the count of the word
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }
        
        

        // Process both strings
//        countWords(str1, wordCountMap);
//        countWords(str2, wordCountMap);

        // Print the word counts
        System.out.println("Word occurrences in both strings:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }



//    private static void countWords(String str, Map<String, Integer> wordCountMap) {
//        // Convert the string to lower case to make the count case-insensitive
//        str = str.toLowerCase();
//
//        // Split the string into words
//        String[] words = str.split("\\s+");  // Splits by spaces (and other whitespace)
//
//        // Iterate through each word in the array
//        for (String word : words) {
//            // Update the count of the word
//            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
//        }
//    }
}
