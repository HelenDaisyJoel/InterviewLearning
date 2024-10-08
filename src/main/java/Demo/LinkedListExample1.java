package Demo;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample1 {
    public static void main(String[] args) {
        // Creating a LinkedList of Integer type
        List<Integer> numbers = new LinkedList<>();

        // Adding elements to the list
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Accessing elements
        System.out.println("First number: " + numbers.get(0));

        // Removing an element by index
        numbers.remove(1);  // Removes the element at index 1 (20)

        // After removal
        System.out.println("After removal:");
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}

