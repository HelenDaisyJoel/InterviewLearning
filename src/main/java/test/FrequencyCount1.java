package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FrequencyCount1 {

	public static void main(String[] args) {
		int[] a = {2, 4, 1, 2, 3, 4, 4, 5};
        
        // Create a HashMap to store elements and their frequencies
        ArrayList<Integer> frequencyMap = new ArrayList<>();
        for(int i=0;i<a.length;i++) {
        	int k=0;
        	if(!frequencyMap.contains(a[i])) {
        		frequencyMap.add(a[i]);
        		k++;
        		for(int j=i+1;j<a.length;j++) {
        			if(a[i]==a[j]) {
        			k++;
        				
        			}
        		}
        		
        		System.out.println(a[i]+"-"+k);	
        		
        	}
        	if(k==1) {
    			System.out.println(a[i]+ " is the unique no");
    		}
        	
        }
        

	}

}
