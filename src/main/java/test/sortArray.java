package test;

import java.util.Arrays;
import java.util.Scanner;

public class sortArray {

	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter the size of array: ");
			int size = scanner.nextInt();
			
			System.out.println("Enter the array elements: ");
			 int[] array = new int[size];
			for(int i=0;i<size;i++) {
				
				array[i] = scanner.nextInt();
			}
				
			
			// Sorting the array using Bubble Sort
			int temp;
			for (int i = 0; i < array.length; i++) {
			    for (int j = i + 1; j < array.length; j++) {
			        if (array[i] > array[j]) {  // Swap if the current element is greater than the next element
			            temp = array[i];
			            array[i] = array[j];
			            array[j] = temp;
			        }
			    }
			}
			
			// Printing the sorted array
			System.out.println("Sorted array: " + Arrays.toString(array));
		}
    }
}