package Learning;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        // Creating a LinkedHashSet
        LinkedHashSet<String> linkedSet = new LinkedHashSet<>();

        // Adding elements to the LinkedHashSet
        linkedSet.add("Apple");
        linkedSet.add("Banana");
        linkedSet.add("Orange");
        linkedSet.add("Mango");
        linkedSet.add("Banana"); // Duplicate element, will not be added

        // Displaying the LinkedHashSet
        System.out.println("LinkedHashSet: " + linkedSet);

        // Checking if an element exists
        if (linkedSet.contains("Orange")) {
            System.out.println("The LinkedHashSet contains 'Orange'.");
        } else {
            System.out.println("The LinkedHashSet does not contain 'Orange'.");
        }

        // Removing an element
        linkedSet.remove("Mango");
        System.out.println("LinkedHashSet after removing 'Mango': " + linkedSet);

        // Iterating over the LinkedHashSet
        System.out.println("Iterating over the LinkedHashSet:");
        for (String fruit : linkedSet) {
            System.out.println(fruit);
        }

        // Checking the size of the LinkedHashSet
        System.out.println("Size of the LinkedHashSet: " + linkedSet.size());
    }
}
