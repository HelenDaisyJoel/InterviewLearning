package test;

import java.util.Scanner;

public class countEvenOdd {
	
	
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        
	        // Input array size
	        System.out.print("Enter the size of the array: ");
	        int size = scanner.nextInt();
	        
	        int[] numbers = new int[size];
	        
	        // Input array elements
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < size; i++) {
	            numbers[i] = scanner.nextInt();
	        }
		
		int oddCount=0;
		
		int evenCount=0;
		 // Count odd and even numbers
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        
        // Output the counts
        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of odd numbers: " + oddCount);
        
        scanner.close();
	}

}
