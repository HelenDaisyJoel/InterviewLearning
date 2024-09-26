package Learning;

import java.util.HashMap;
import java.util.Map;

public class HashMapIterationExample {
    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Adding key-value pairs to the HashMap
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Orange", 30);
        map.put("Mango", 25);
        map.put("Banana", 25);//Remove duplicates value updated
        // Iterating over the HashMap using for loop
        System.out.println("Iterating over the HashMap:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }
}
