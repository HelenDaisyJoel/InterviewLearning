package test;

import java.util.Arrays;
import java.util.TreeSet;
import java.util.Comparator;

public class MergeArray {
	 public static void main(String[] args) {
		 int[] a1= {10,50,20};
		 int[] a2= {30,70};
		 int[] mergeArray=new int[a1.length+a2.length];
		 
		 System.arraycopy(a1, 0, mergeArray, 0, a1.length);
		 System.arraycopy(a2, 0, mergeArray, a1.length, a2.length);
		 System.out.println("Merged Array"+Arrays.toString(mergeArray));
		 
		// Sort the merged array
	        Arrays.sort(mergeArray);
	        
	        
	     // Print the sorted merged array
	        System.out.println("Merged and Sorted Array: " + Arrays.toString(mergeArray));
	        
	        
	        
//	    TreeSet<Integer> set=new TreeSet<>();
	     // Create a TreeSet with a custom comparator to sort in descending order
	        TreeSet<Integer> set = new TreeSet<>(Comparator.reverseOrder());
	        for(int num:a1) {
	    	set.add(num);
	    }
	    
	   
	    for(int num:a2) {
	    	set.add(num);
	    }
	    
	    System.out.println("Sorted elements in descending order: " +set);
	    
		 
		 
		 
		 
		 
	 }

}
