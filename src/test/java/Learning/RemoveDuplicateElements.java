package Learning;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateElements {
    public static void main(String[] args) {
        // List of array elements (with duplicates)
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C++");
        list.add("Python");
        list.add("JavaScript");
        list.add("C++");

        System.out.println("Original List: " + list);

        // Using a Set to remove duplicates
        Set<String> set = new HashSet<>(list);

        // Creating a new list without duplicates
        List<String> listWithoutDuplicates = new ArrayList<>(set);

        // Displaying the list without duplicates
        System.out.println("List after removing duplicates: " + listWithoutDuplicates);
    }
}
