package Learning;

import java.util.HashSet;
import java.util.Set;

public class DuplicateWordFinder {
    public static void main(String[] args) {
        // Two strings to compare
        String str1 = "Hi Java is the Programming language Hi is";
        String str2 = "Hi I know Java is to script coding is ";

        // Sets to hold words from both strings
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        // Splitting the first string and adding words to set1
        for (String word : str1.split(" ")) {
            set1.add(word);
        }

        // Splitting the second string and adding words to set2
        for (String word : str2.split(" ")) {
            set2.add(word);
        }

        // Finding duplicates
        set1.retainAll(set2);

        // Displaying duplicate words
        System.out.println("Duplicate words: " + set1);
        
    }
}
