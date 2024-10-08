package Demo;

import java.util.ArrayList;

public class MixedArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList of Object type
        ArrayList<Object> mixedList = new ArrayList<>();

        // Add different types of data to the list
        mixedList.add(10);        // Integer
        mixedList.add("Hello");   // String
        mixedList.add(3.14);      // Double
        mixedList.add(true);      // Boolean

        // Access and print elements
        for (Object element : mixedList) {
            System.out.println("Element: " + element);
        }
    }
}