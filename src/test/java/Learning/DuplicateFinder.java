package Learning;

import java.util.HashSet;
import java.util.Set;

public class DuplicateFinder {
	
	public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 2, 3, 6}; // Sample array
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : arr) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

        System.out.println("Duplicate elements: " + duplicates);
        System.out.println("Duplicate elements: " + seen);
    }

}
