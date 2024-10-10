package Demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SetExample {

	public static void main(String[] args) {
		HashSet<String> fruits = new HashSet<>();
        
        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Cherry");
        fruits.add("Cherry");//Doesn't allows duplicate
        
        // Print elements
        System.out.println("Fruits: " + fruits);
        
        // Remove an element
        fruits.remove("Cherry");
        fruits.remove(0);
        System.out.println("After removal: " + fruits);
        System.out.println("Contains Banana: " + fruits.contains("Banana"));
        
        // Iterate through the list-Approach1
        for (String fruit : fruits) {
            System.out.println("Approach 1 is:"+fruit);
        }
//        Approach 2
        Iterator<String> it=fruits.iterator();
        while(it.hasNext()) {
        	System.out.println("Approach 2 is:"+it.next());
        }
        }

}
