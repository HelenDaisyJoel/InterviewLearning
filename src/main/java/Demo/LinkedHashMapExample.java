package Demo;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        // Creating a LinkedHashMap
        Map<String, Integer> marks = new LinkedHashMap<>();

        // Adding elements to the map (key-value pairs)
        marks.put("Math", 90);
        marks.put("Science", 85);
        marks.put("English", 88);

        // Accessing an element by key
        System.out.println("Marks in Science: " + marks.get("Science"));

        // Iterating through the map
        System.out.println("All subjects and marks:");
        for (Map.Entry<String, Integer> entry : marks.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

