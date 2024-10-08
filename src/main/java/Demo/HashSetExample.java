package Demo;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        
        // Add elements
        set.add("Red");
        set.add("Blue");
        set.add("Green");
        
        // Print the set
        System.out.println("Colors: " + set);
        
        // Check if an element exists
        if (set.contains("Blue")) {
            System.out.println("Blue is in the set.");
        }
        
        // Remove an element
        set.remove("Green");
        System.out.println("After removal: " + set);
        
        // Iterate through the set
        for (String color : set) {
            System.out.println(color);
        }
    }
}
