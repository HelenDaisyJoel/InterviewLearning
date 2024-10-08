package test;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicatesFromString {
	
	 public static void main(String[] args) {
		 String name="Helen";
		 System.out.println("Original String: " + name);
		 LinkedHashSet<Character> set=new LinkedHashSet<>();
		 
		 char[] NewString=name.toCharArray();
		 for(char c: NewString)
		 {
			 set.add(c);
			 
		 }
		 
		 // Reconstruct the string without duplicates
	        StringBuilder newString = new StringBuilder();
	        for (char c : set) {
	            newString.append(c);
	        }
		 System.out.println("String after removing duplicates: " + newString.toString());
		 
	 }
	 

}

