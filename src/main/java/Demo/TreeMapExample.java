package Demo;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // Creating a TreeMap
        Map<String, String> countryCodes = new TreeMap<>();

        // Adding elements to the map (key-value pairs)
        countryCodes.put("IN", "India");
        countryCodes.put("US", "United States");
        countryCodes.put("AU", "Australia");

        // TreeMap sorts the keys
        System.out.println("Country codes sorted by keys:");
        System.out.println(countryCodes);
        for (Map.Entry<String, String> entry : countryCodes.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
