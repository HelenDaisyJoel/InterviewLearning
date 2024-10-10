package Demo;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample1 {
    public static void main(String[] args) {
        // Creating a HashMap
        Map<Integer, String> students = new HashMap<>();

        // Adding elements to the map (key-value pairs)
        students.put(1, "Alice");
        students.put(2, "Bob");
        students.put(3, "Charlie");
        students.put(3, "Charlie1");

        // Accessing an element by key
        System.out.println("Student with ID 2: " + students.get(2));

        // Removing an element by key
//        students.remove(3);

        // Iterating through the map
        System.out.println("All students:");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}

