package test;

import java.util.Arrays;
import java.util.Scanner;

public class numbersAscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner scanner = new Scanner(System.in);
        
        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        int[] array = new int[size];
        
     // Input array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        
        // Sort the array
        Arrays.sort(array);
        
        // Print the sorted array
        System.out.println("Sorted array in ascending order:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        
        scanner.close();
    }

	}


