package test;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	        Scanner scanner = new Scanner(System.in);
	        
	        // Input two strings
	        System.out.print("Enter the first string: ");
	        String str1 = scanner.nextLine();
	        
	        System.out.print("Enter the second string: ");
	        String str2 = scanner.nextLine();
	        
	        // Convert strings to character arrays and sort them
	        char[] charArray1 = str1.toCharArray();
	        char[] charArray2 = str2.toCharArray();
	       
	        
	        Arrays.sort(charArray1);
	        Arrays.sort(charArray2);
	        
	        // Check if the sorted character arrays are equal
	        if (Arrays.equals(charArray1, charArray2)) {
	            System.out.println("The strings are anagrams.");
	        } else {
	            System.out.println("The strings are not anagrams.");
	        }
	        
	        scanner.close();
	    

	}

}
