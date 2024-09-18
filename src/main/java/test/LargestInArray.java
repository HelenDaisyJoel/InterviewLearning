package test;

import java.util.Scanner;

public class LargestInArray {
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
        
        int max = array[0];
        
        // Find the largest element
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        
        System.out.println("Largest element in the array: " + max);
        
        scanner.close();
    }
}
