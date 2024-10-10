package Demo;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        
        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Cherry");
        fruits.add("Cherry");//Allows duplicate
        
        // Print elements
        System.out.println("Fruits: " + fruits);
        
        // Remove an element
        fruits.remove("Cherry");
        fruits.remove(0);
        System.out.println("After removal: " + fruits);
        System.out.println("Contains Banana: " + fruits.contains("Banana"));
        
        // Iterate through the list
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}

