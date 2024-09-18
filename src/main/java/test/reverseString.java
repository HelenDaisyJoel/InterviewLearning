package test;

import java.util.Scanner;

public class reverseString {

	
	public static void main(String[] args) {
		
		 try (Scanner scanner = new Scanner(System.in)) {
			// Input the number
	        System.out.print("Enter a string to reverse: ");
	        String NAME = scanner.next();
	        int length=NAME.length();
	        char[] charArray=NAME.toCharArray();
	        for(int i=length-1;i>=0; i--)
	        {
	        	System.out.println(charArray[i]);
	        }
		}
	}
}
