package test;

import java.util.Scanner;

public class printArray {
	
	public static void main(String[] args) {
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
        
        
        
        int[] array1= {10,20,30,40,50};
        for (int numb:array1) {
        	System.out.println(numb+ "");
        }
        // Print the elements of the array
        System.out.println("Elements of the array:");
        for (int num : array) {
            System.out.print(num + " ");
       }
        
        scanner.close();
    }

}
