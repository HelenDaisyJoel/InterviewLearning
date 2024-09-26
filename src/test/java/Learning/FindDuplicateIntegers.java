package Learning;

import java.util.HashSet;
import java.util.Set;
public class FindDuplicateIntegers {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 10, 20, 40, 50};
        // Set to store duplicates
        Set<Integer> duplicates = findDuplicates(a);
        // Print duplicates
        System.out.println("Duplicates: " + duplicates);
    }
    public static Set<Integer> findDuplicates(int[] array) {
        Set<Integer> items = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for (int item : array) {
            if (!items.add(item)) {
                duplicates.add(item);
            }
        }
        return duplicates;
    }
}