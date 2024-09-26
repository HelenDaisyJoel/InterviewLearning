package Learning;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class sortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		 System.out.print("Enter the size of the array: ");
	        int size = scanner.nextInt();
	        int[] array = new int[size];
	        
	        System.out.print("Enter the elements of the array: ");
	        for(int i=0;i<size;i++) {
	        array[i] = scanner.nextInt();

	}
	        
	        int temp=0;
	        for(int i=0;i<size;i++) {
	        	for(int j=i+1; j<size;j++) {
	        		if(array[i]>array[j]) {
	        			temp=array[i];
	        			array[i]=array[j];
	        			array[j]=temp;
	        		}
	        	}
	        }
	     // Printing the sorted array
	     			System.out.println("Sorted array: " + Arrays.toString(array));

}
}
