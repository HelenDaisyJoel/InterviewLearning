package test;

import java.util.Arrays;

public class sortString {

	public static void main(String[] args) {
		int i;
		String str="Java ist Web";
		char[] array=str.toCharArray();
		char temp;
		for (i = 0; i < array.length; i++) {
		    for (int j = i + 1; j < array.length; j++) {
		        if (array[i] > array[j]) {  // Swap if the current element is greater than the next element
		            temp = array[i];
		            array[i] = array[j];
		            array[j] = temp;
		            
		        }
		    }
		}
		System.out.println("Sorted array: " + Arrays.toString(array));
//		System.out.println("Sorted array: " + array[i]);

	}

}
