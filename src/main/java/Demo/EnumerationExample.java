package Demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class EnumerationExample {
    public static void main(String[] args) {
        // Creating an ArrayList
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");

        // Getting an Enumeration from the List
        Enumeration<String> enumeration = Collections.enumeration(list);

        // Using Enumeration to iterate over the list
        System.out.println("Elements in the list using Enumeration:");
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}
