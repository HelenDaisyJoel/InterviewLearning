package test;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCount {
    public static void main(String[] args) {
        int[] a = {2, 4, 1, 2, 3, 4, 4, 5};
        
        // Create a HashMap to store elements and their frequencies
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        // Iterate through the array and populate the HashMap
        for (int num : a) {
            if (frequencyMap.containsKey(num)) {
                // If the element already exists in the map, increment its count
                frequencyMap.put(num, frequencyMap.get(num) + 1);
            } else {
                // If the element is not present, add it with count 1
                frequencyMap.put(num, 1);
            }
        }
        
        // Print the elements and their frequencies
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
    }
}

