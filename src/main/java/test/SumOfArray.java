package test;
import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        int[] array = new int[size];
        int sum = 0;
        
        // Input array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        
        // Calculate the sum of elements
        for (int num : array) {
            sum += num;
        }
        
        System.out.println("Sum of elements in the array: " + sum);
        
        scanner.close();
    }
}
