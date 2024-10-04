package Learning;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class CollectionExample {
    public static void main(String[] args) {
        // Using HashMap to store phone book
        HashMap<String, String> phoneBook = new HashMap<>();

        // Adding entries to the phone book
        phoneBook.put("Alice", "123-456-7890");
        phoneBook.put("Bob", "234-567-8901");
        phoneBook.put("Charlie", "345-678-9012");
        phoneBook.put("Charlie", "345-678-9012");// Duplicate, will not be added
        // Retrieving a phone number
        String bobNumber = phoneBook.get("Bob");
        System.out.println("Bob's phone number: " + bobNumber);

        // Displaying the entire phone book
        System.out.println("\nPhone Book:");
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Phone Number: " + entry.getValue());
        }

        // Using HashSet to store unique user IDs
        HashSet<String> userIds = new HashSet<>();

        // Adding user IDs
        userIds.add("user1");
        userIds.add("user2");
        userIds.add("user3");
        userIds.add("user1"); // Duplicate, will not be added

        // Displaying unique user IDs
        System.out.println("\nUnique User IDs:");
        for (String userId : userIds) {
            System.out.println(userId);
        }

        // Checking if a specific user ID exists
        if (userIds.contains("user2")) {
            System.out.println("User ID 'user2' exists.");
        } else {
            System.out.println("User ID 'user2' does not exist.");
        }
    }
}
