package Demo;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> scores = new HashMap<>();
        
        // Add elements
        scores.put("Alice", 85);
        scores.put("Bob", 90);
        scores.put("Charlie", 75);
        scores.put("Charlie", 80);//Duplicate removed
        
        // Print the scores
        System.out.println("Scores: " + scores);
        
        // Retrieve a value
        System.out.println("Alice's score: " + scores.get("Alice"));
        
        // Remove an element
        scores.remove("Charlie");
        System.out.println("After removing Charlie: " + scores);
        
        // Iterate through the map
        for (String key : scores.keySet()) {
            System.out.println(key + ": " + scores.get(key));
        }
    }
}
