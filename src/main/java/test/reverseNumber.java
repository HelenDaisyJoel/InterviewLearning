package test;

import java.util.Scanner;

public class reverseNumber {
	 public static void main(String[] args) {
	
		 Scanner scanner = new Scanner(System.in);
	        
	        // Input the number
	        System.out.print("Enter a number to reverse: ");
	        int number = scanner.nextInt();
		int reversedNumber=0;
		while (number != 0) {
		int lastdigit=number%10;
		reversedNumber=reversedNumber*10+lastdigit;
		number/=10;
		
		
		}
		 // Output the reversed number
        System.out.println("Reversed number: " + reversedNumber);
        
        scanner.close();
		 
	 }

}
