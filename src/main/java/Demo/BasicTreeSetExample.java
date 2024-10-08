package Demo;

import java.util.TreeSet;

public class BasicTreeSetExample {
    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<Integer> numbers = new TreeSet<>();

        // Adding elements
        numbers.add(10);
        numbers.add(5);
        numbers.add(15);
        numbers.add(20);
        numbers.add(10); // Duplicate element, will not be added

        // Print the TreeSet
        System.out.println("TreeSet: " + numbers); // Output: [5, 10, 15, 20]
    }
}

