package Learning;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // Creating a TreeSet of integers
        TreeSet<Integer> numbers = new TreeSet<>();

        // Adding elements to the TreeSet
        numbers.add(50);
        numbers.add(20);
        numbers.add(10);
        numbers.add(40);
        numbers.add(30);
        
        // TreeSet sorts elements automatically
        System.out.println("TreeSet after adding elements: " + numbers);

        // Attempting to add a duplicate element
        numbers.add(20);
        System.out.println("After adding duplicate element 20: " + numbers);

        // Accessing the first and last elements
        System.out.println("First element: " + numbers.first());
        System.out.println("Last element: " + numbers.last());

        // Removing an element
        numbers.remove(30);
        System.out.println("TreeSet after removing element 30: " + numbers);

        // Finding elements less than a given value
        System.out.println("Elements less than 40: " + numbers.headSet(40));

        // Finding elements greater than or equal to a given value
        System.out.println("Elements greater than or equal to 20: " + numbers.tailSet(20));

        // Checking if a specific element exists
        if (numbers.contains(50)) {
            System.out.println("Element 50 is in the TreeSet");
        } else {
            System.out.println("Element 50 is not in the TreeSet");
        }

        // Iterating over the TreeSet
        System.out.println("Iterating over the TreeSet:");
        for (Integer num : numbers) {
            System.out.println(num);
        }
    }
}
