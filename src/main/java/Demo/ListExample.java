package Demo;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        // Creating a List of String type
        List<String> fruits = new ArrayList<>();

        // Adding elements to the list
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Banana"); // Duplicate allowed

        // Accessing elements
        System.out.println("First fruit: " + fruits.get(0));

        // Iterating through the list
        System.out.println("All fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Removing an element
        fruits.remove("Banana");

        // After removal
        System.out.println("After removal of Banana:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}

