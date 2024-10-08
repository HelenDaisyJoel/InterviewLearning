package test;
import java.util.HashSet;
import java.util.Set;

public class testDemo {
//    public static int lengthOfLongestSubstring(String str) {
	
	 public static void main(String[] args) {
	        String str = "abcabcbb";
        Set<Character> set = new HashSet<>();
        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < str.length(); right++) {
            while (set.contains(str.charAt(right))) {
                set.remove(str.charAt(left));
                left++;
            }
            set.add(str.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }
//        return maxLength;
        System.out.println("Length of longest substring without repeating characters: " + maxLength);
    }

//    public static void main(String[] args) {
//        String str = "abcabcbb";
//        System.out.println("Length of longest substring without repeating characters: " + lengthOfLongestSubstring(str));
    }

