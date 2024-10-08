package Demo;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<>();
        
        // Add elements
        cities.add("New York");
        cities.add("Los Angeles");
        cities.add("Chicago");
        
        // Print elements
        System.out.println("Cities: " + cities);
        
        // Remove the first element
        cities.removeFirst();
        System.out.println("After removing first city: " + cities);
        
        // Iterate through the list
        for (String city : cities) {
            System.out.println(city);
        }
    }
}
