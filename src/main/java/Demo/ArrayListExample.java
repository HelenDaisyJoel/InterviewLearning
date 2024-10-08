package Demo;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        
        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        
        // Print elements
        System.out.println("Fruits: " + fruits);
        
        // Remove an element
        fruits.remove("Banana");
        System.out.println("After removal: " + fruits);
        
        // Iterate through the list
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}

