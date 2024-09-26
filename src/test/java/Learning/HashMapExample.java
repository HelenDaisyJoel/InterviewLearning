package Learning;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Adding key-value pairs to the HashMap
        map.put("Apple", 10);
        map.put("Mango", 30);
        map.put("Banana", 20);
        map.put("Orange", 30);
        map.put("Mango", 25);

        // Displaying the HashMap
        System.out.println("Initial HashMap: " + map);

        // Retrieving a value
        String keyToRetrieve = "Banana";
        Integer value = map.get(keyToRetrieve);
        System.out.println("Value for key '" + keyToRetrieve + "': " + value);

        // Updating a value
        map.put("Apple", 15);
        System.out.println("Updated HashMap: " + map);

        // Removing a key-value pair
        map.remove("Mango");
        System.out.println("HashMap after removing 'Mango': " + map);

        // Iterating over the HashMap
        System.out.println("Iterating over the HashMap:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Checking if a key exists
        if (map.containsKey("Orange")) {
            System.out.println("The HashMap contains the key 'Orange'.");
        } else {
            System.out.println("The HashMap does not contain the key 'Orange'.");
        }

        // Checking the size of the HashMap
        System.out.println("Size of the HashMap: " + map.size());
    }
}
